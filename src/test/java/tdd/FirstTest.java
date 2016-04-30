package tdd;

import tdd.domain.Dollor;
import org.junit.Test;
import tdd.domain.Franc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jarvis on 2016. 4. 29..
 */
public class FirstTest {

    @Test
    public void testMultiplication(){
        Dollor five = new Dollor(5);
        assertEquals(new Dollor(10), five.times(2));
        assertEquals(new Dollor(15), five.times(3));
    }

    @Test
    public void testEquality() throws Exception{
        assertTrue(new Dollor(5).equals(new Dollor(5)));
        assertFalse(new Dollor(5).equals(new Dollor(6)));
    }

    @Test
    public void testFranchMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

}
