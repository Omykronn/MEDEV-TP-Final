package othello; 

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class PionTest {

    /**
     * Test of Pion constructor, of class Pion.
     */
    @Test
    public void testPion() {
        System.out.println("Constructeur Pion");
        Pion instance = new Pion(1);
        assertEquals(instance.getCouleur(), 1);

        Pion instanceVide = new Pion(); 
        assertEquals(instanceVide.getCouleur(), 0);
    }
    
    /**
     * Test of getCouleur method, of class Pion.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        Pion instance = new Pion(1);
        assertEquals(instance.getCouleur(), 1);
    }

    /**
     * Test of setCouleur method, of class Pion.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        Pion instance = new Pion(1);
        instance.setCouleur(-1); 
        assertEquals(instance.getCouleur(), -1);
    }

    /**
     * Test of retourner method, of class Pion.
     */
    @Test
    public void testRetourner() {
        System.out.println("retourner");
        Pion instance = new Pion(1);
        instance.retourner();
        assertEquals(instance.getCouleur(), -1);
    }

    /**
     * Test of affichage method, of class Pion.
     */
    @Test
    public void testAffichage() {
        System.out.println("affichage");
        Pion instance = new Pion(1);
        assertEquals(instance.affichage(), "B");

        Pion instanceVide = new Pion(); 
        assertEquals(instanceVide.affichage(), "");
    }

    /**
     * Test of estPose method, of class Pion.
     */
    @Test
    public void testEstPose() {
        System.out.println("estPose");
        Pion instance = new Pion(1);
        assertEquals(instance.estPose(), true);

        Pion instanceVide = new Pion(); 
        assertEquals(instanceVide.estPose(), false);
    }



}