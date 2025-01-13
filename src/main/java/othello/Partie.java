package othello; 

import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.Level;
import othello.Pion;
import utils.Tuple; 

public class Partie {
    private Pion[][] plateau; 
    private int tour; 
    private int taillePlateau; 
    private boolean partieFinie; 
    private Logger logger;

    /**
     * Constructeur de Partie avec paramètre 
     * Construit le plateau en début de jeu avec les pions du centre déjà placés
     * @param taillePlateau la taille du plateau carré 
     */
    public Partie(int taillePlateau){
        this.tour = 0; 
        this.taillePlateau = taillePlateau; 
        this.partieFinie = false; 

        this.plateau = new Pion[taillePlateau][taillePlateau]; 
        for (int i =0 ; i<this.taillePlateau; i++){
            for (int j= 0; j<this.taillePlateau; j++){
                this.plateau[i][j]=new Pion(); 
            }
        }
       

        this.plateau[taillePlateau/2-1][taillePlateau/2-1].setCouleur(1); 
        this.plateau[taillePlateau/2-1][taillePlateau/2].setCouleur(-1); 
        this.plateau[taillePlateau/2][taillePlateau/2-1].setCouleur(-1); 
        this.plateau[taillePlateau/2][taillePlateau/2].setCouleur(1); 

        this.logger = Logger.getLogger("othello.partie.logger");
    }

    /**
     * Execution d'une partie
     */
    public void jouer() {
        while (!this.partieFinie) {
            this.tourDeJeu();

            this.tour ++;
        }
    }
    
    /**
     * Execution d'un tour de jeu
     */
    public void tourDeJeu() {
        Tuple action;

        this.afficher();
        action = this.choix();
    }

    /**
     * Affichage du plateau
     */
    public void afficher() {
        String message = "Configuration actuel\n\n  ";

        // Affichage du nom des colonnes
        for (int k = 0; k < this.taillePlateau; k++) {
            message += Character.toString(65 + k);
        }

        message += '\n';

        // Affichage du plateau
        for (int i = 0; i < this.taillePlateau; i++) {
            // Affichage des lignes
            message += "\n" + (i + 1) + ' ';

            for (int j = 0; j < this.taillePlateau; j++) {
                message += this.plateau[i][j].affichage();
            }
        }

        this.logger.log(Level.OFF, message + '\n');
    }

    /**
     * Choix de l'action
     * @return Coordonnées du pion à placer
     */
    public Tuple choix() {
        boolean actionLicite = false;
        Scanner scanner = new Scanner(System.in);
        String answer;
        Tuple action = null;

        this.messageTour();

        while (!actionLicite) {
            answer = scanner.nextLine();

            if (answer == "pass") {
                action = null;
                actionLicite = true;
            }
            else {
                action = new Tuple(((int) answer.charAt(0)) - 65, ((int) answer.charAt(1)) - 65);
                actionLicite = action.getX() >= 0 && action.getX() < this.taillePlateau && action.getY() >= 0 && action.getY() < this.taillePlateau && this.testPrise(action);
            }
        }

        return action;
    }

    /**
     * Vérifie si l'action engendre une prise
     * @param action Action à vérifier
     * @return  Validité de l'action
     */
    public boolean testPrise(Tuple action) {
        // TODO : Vérification

        return true;
    }

    /**
     * Affiche quel couleur joue
     */
    private void messageTour() {
        String message = "Aux ";

        if (this.joueurActuel() == 1) {
            message += "blanc";
        }
        else {
            message += "noir";
        }

        message += "s de jouer ! (e.g e1 ou pass pour passer le tour)";

        this.logger.log(Level.OFF, message);
    }

    /**
     * Getter Tour
     * @return le numéro du tour de jeu, 0 quand la partie vient de commencer 
     */
    public int getTour(){
        return this.tour; 
    }

    /**
     * Getter taillePateau
     * @return la taille du plateau carré 
     */
    public int getTaillePlateau(){
        return this.taillePlateau; 
    }

    /**
     * Getter partieFinie
     * @return un boolean qui donne true quand la partie est finie 
     */
    public boolean getPartieFinie(){
        return this.partieFinie; 
    }

    /**
     * Getter plateau
     * @return renvoie le plateau en Pion[][]
     */
    public Pion[][] getPlateau(){
        return this.plateau; 
    }

    /**
     * Setter Tour
     * @param tour numéro du tour
     */
    public void setTour(int tour){
        this.tour=tour; 
    }

    /**
     * Setter taillePlateau
     * @param taillePlateau numéro du tour
     */
    public void setTaillePlateau(int taillePlateau){
        this.taillePlateau=taillePlateau; 
    }

    /**
     * Setter partieFinie
     * @param fin boolean true si la partie est finie 
     */
    public void setPartieFinie(boolean fin){
        this.partieFinie=fin; 
    }

    /**
     * A partir du tour de jeu en cours, donne le joueur actuel
     * @return  tour actuel (-1/1)
     */
    private int joueurActuel() {

        int couleurJoueur;
        if (this.getTour()%2 == 0) {
            couleurJoueur = -1; //noir
        }else {
            couleurJoueur = 1; //blanc
        }
        return couleurJoueur;
    }   

    /**
     * Setter plateau
     * @param plateau nouveau plateau de pion
     */
    public void setPlateau(Pion[][] plateau){
        this.plateau=plateau; 
    }

    /**
     * Getter logger
     * @return Logger de la partie
     */
    public Logger getLogger() {
        return this.logger;
    }

    /**
     * Setter logger
     * @param logger Nouveau logger
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    
    /**
     * On récupère le choix du joueur et on applique les modifications au plateau, pion à pauser et pion à retourner
     * ATTENTION en l'état, on n'applique l'effet qu'en ligne et en colonne et pas en diagonal
     * @param choix le tuple de position que le joueur a choisi pour placer son pion
     */
    public void appliquer(Tuple choix){
        int posX=choix.getX(); 
        int posY=choix.getY(); 

        int couleurJoueur=this.joueurActuel(); 

        this.plateau[posX][posY].setCouleur(couleurJoueur);

        
        //le long de la colonne x vers le bas
        int positionArret = posX+1; 
        int couleurAutre = this.getPlateau()[positionArret][posY].getCouleur(); 
        while (positionArret < this.getTaillePlateau() && couleurAutre != 0 && couleurAutre != couleurJoueur){
            positionArret = positionArret+1; 
            couleurAutre=this.getPlateau()[positionArret][posY].getCouleur(); 
        }

        if (couleurAutre == couleurJoueur){
            for (int i = posX+1 ; i<positionArret ;  i++){
                this.getPlateau()[i][posY].retourner(); 
            }
        }

        //le long de la colonne x vers le haut
        positionArret = posX-1; 
        couleurAutre = this.getPlateau()[positionArret][posY].getCouleur(); 
        while (positionArret >-1  && couleurAutre != 0 && couleurAutre != couleurJoueur){
            positionArret = positionArret-1; 
            couleurAutre=this.getPlateau()[positionArret][posY].getCouleur(); 
        }

        if (couleurAutre == couleurJoueur){
            for (int i =positionArret+1; i<posX ;  i++){
                this.getPlateau()[i][posY].retourner(); 
            }
        }

        //le long de la ligne y vers la droite
        positionArret = posY+1; 
        couleurAutre = this.getPlateau()[posX][positionArret].getCouleur(); 
        while (positionArret < this.getTaillePlateau() && couleurAutre != 0 && couleurAutre != couleurJoueur){
            positionArret = positionArret+1; 
            couleurAutre=this.getPlateau()[posX][positionArret].getCouleur(); 
        }

        if (couleurAutre == couleurJoueur){
            for (int i = posY+1 ; i<positionArret ;  i++){
                this.getPlateau()[posX][i].retourner(); 
            }
        }

        //le long de la ligne y vers la gauche
        positionArret = posY-1; 
        couleurAutre = this.getPlateau()[posX][positionArret].getCouleur(); 
        while (positionArret >-1  && couleurAutre != 0 && couleurAutre != couleurJoueur){
            positionArret = positionArret-1; 
            couleurAutre=this.getPlateau()[posX][positionArret].getCouleur(); 
        }

        if (couleurAutre == couleurJoueur){
            for (int i =positionArret+1; i<posY ;  i++){
                this.getPlateau()[posX][i].retourner(); 
            }
        }


    }
}