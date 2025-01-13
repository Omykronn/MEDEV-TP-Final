package othello; 

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
     * @return couleur du pion (int)
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
    

    /**
     * Retourne un pion est change sa couleur
     */
    public void retourner(){
        this.setCouleur(this.couleur * -1); 
    }

    /**
     * Renvoie la couleur du pion noir(N)/blanc(B)/vide(V)
     * @return couleur du pion N/B/V
     */
    public String affichage(){
        String color; 
        if (this.couleur==1){
            color= "█"; 
        }
        else if (this.couleur ==-1){
            color ="░"; 
        }
        else {
            color= " "; 
        }
        return color; 
    }

    /**
     * Renvoie true si le pion est posé (couleur != 0), sinon false 
     * @return pion posé ou non
     */
    public boolean estPose(){
        boolean reponse; 
        if (this.couleur ==0){
            reponse =false;
        }
        else {
            reponse = true; 
        }
        return reponse;
    }
}