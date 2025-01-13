package othello; 

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.assertEquals; 

public class PartieTest{
     /**
     * Test of Partie constructor, of class Partie.
     */
    @Test
    public void testPartie() {
        Partie instance = new Partie(8);
        assertEquals(instance.getTour(), 0);
        assertEquals(instance.getTaillePlateau(), 8);
        assertEquals(instance.getPartieFinie(),false); 

        Pion pionTest = new Pion(); 
        assertEquals(instance.getPlateau()[0][0].getCouleur(),pionTest.getCouleur()); 

    }
    
    /**
     * Test of getTour method, of class Partie.
     */
    @Test
    public void testGetTour() {
        Partie instance = new Partie(8);
        assertEquals(instance.getTour(), 0);
    }

    /**
     * Test of getTaillePlateau method, of class Partie.
     */
    @Test
    public void testGetTaillePlateau() {
        Partie instance = new Partie(8);
        assertEquals(instance.getTaillePlateau(), 8);
    }

     /**
     * Test of getPartieFinie method, of class Partie.
     */
    @Test
    public void testGetPartieFinie() {
        Partie instance = new Partie(8);
        assertEquals(instance.getPartieFinie(), false);
    }

    
    /**
     * Test of setTour method, of class Partie.
     */
    @Test
    public void testSetTour() {
        Partie instance = new Partie(8);
        instance.setTour(10);
        assertEquals(instance.getTour(), 10);
    }

    /**
     * Test of setTaillePlateau method, of class Partie.
     */
    @Test
    public void testSetTaillePlateau() {
        Partie instance = new Partie(8);
        instance.setTaillePlateau(6);
        assertEquals(instance.getTaillePlateau(), 6);
    }

    /**
     * Test of setPartieFinie method, of class Partie.
     */
    @Test
    public void testSetPartieFinie() {
        Partie instance = new Partie(8);
        instance.setPartieFinie(true);
        assertEquals(instance.getPartieFinie(), true);
    }
}