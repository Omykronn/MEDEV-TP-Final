package othello; 

import java.util.logging.Logger;

import othello.Pion; 

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
        this.plateau[taillePlateau/2][taillePlateau/2-1].setCouleur(1); 
        this.plateau[taillePlateau/2][taillePlateau/2].setCouleur(-1); 

        this.logger = Logger.getLogger("othello.partie.logger");
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
}