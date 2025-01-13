package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TupleTest {
    /**
     * Test du constructeur de Tuple
     */
    @Test
    public void testConstructor() {
        Tuple tuple = new Tuple(1, -1);
        
        assertEquals(tuple.getX(), 1);
        assertEquals(tuple.getY(), -1);
    }

    /**
     * Test le getter du premier entier
     */
    @Test
    public void testGetX() {
        Tuple tuple = new Tuple(0, 1);

        assertEquals(tuple.getX(), 0);
    }

    /**
     * Test le getter du deuxième entier
     */
    @Test
    public void testGetY() {
        Tuple tuple = new Tuple(0, 1);

        assertEquals(tuple.getY(), 1);
    }

    /**
     * Test le setter du premier entier
     */
    @Test
    public void testSetX() {
        Tuple tuple = new Tuple(0, 1);

        tuple.setX(-1);

        assertEquals(tuple.getX(), -1);
    }

    /**
     * Test le setter du deuxième entier
     */
    @Test
    public void testSetY() {
        Tuple tuple = new Tuple(0, 1);

        tuple.setY(-1);

        assertEquals(tuple.getY(), -1);
    }
}