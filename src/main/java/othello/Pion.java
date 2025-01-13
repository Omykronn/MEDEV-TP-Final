
public class Pion {
    private int couleur;


    /**
     * Constructeur par défaut
     * le pion n'est pas posé donc couleur = 0
     */
    public Pion() {
        this.couleur = 0; 
    }

    /**
     * Constructeur avec paramètres 
     * @param couleur couleur à associer au pion
     */
    public Pion(int couleur){
        this.couleur = couleur; 
    }

    /**
     * Getter Couleur
     */
    public int getCouleur(){
        return this.couleur; 
    }

    /**
     * Setter Couleur
     * @param couleur couleur à associer au pion
     */
    public void setCouleur(int couleur){
        this.couleur = couleur; 
    }
    
}