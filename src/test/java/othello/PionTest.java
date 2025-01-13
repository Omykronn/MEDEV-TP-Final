package othello; 

public class PionTest {



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
}