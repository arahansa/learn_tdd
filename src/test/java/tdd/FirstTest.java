package tdd;

import tdd.domain.Dollor;
import org.junit.Test;
import tdd.domain.Franc;
import tdd.domain.Money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jarvis on 2016. 4. 29..
 */
public class FirstTest {

    @Test
    public void testMultiplication(){
        Money five = Money.dollor(5);
        assertEquals(Money.dollor(10), five.times(2));
        assertEquals(Money.dollor(15), five.times(3));
    }

    @Test
    public void testEquality() throws Exception{
        assertTrue(Money.dollor(5).equals(Money.dollor(5)));
        assertFalse(Money.dollor(5).equals(Money.dollor(6)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        assertFalse(Money.franc(5).equals(Money.dollor(5)));
    }

    @Test
    public void testFranchMultiplication(){
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

}
