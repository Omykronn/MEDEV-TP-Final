package utils;

/**
 * Tuple de deux entiers
 * @author Simon
 */
public class Tuple {
    private int x;
    private int y;

    /**
     * Constructeur
     * @param x Premier entier
     * @param y Deuxième entier 
     */
    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retourne le premier entier
     * @return Valeur du premier entier
     */
    public int getX() {
        return this.x;
    }

    /**
     * Modifier le premier entier
     * @param x Premier entier
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Retourne le deuxième entier
     * @return Valeur du deuxième entier
     */
    public int getY() {
        return this.y;
    }

    /**
     * Modifier le deuxième entier
     * @param x Deuxième entier
     */
    public void setY(int y) {
        this.y = y;
    }
}
