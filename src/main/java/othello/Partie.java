package othello; 

import othello.Pion; 

public class Partie {
    private Pion[][] plateau; 
    private int tour; 
    private int taillePlateau; 
    private boolean partieFinie; 

    /**
     * Constructeur de Partie avec paramètre 
     */
    public Partie(int taillePlateau){
        this.tour = 0; 
        this.taillePlateau = taillePlateau; 
        this.partieFinie = false; 

        this.plateau = new Pion[taillePlateau][taillePlateau]; 
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
}