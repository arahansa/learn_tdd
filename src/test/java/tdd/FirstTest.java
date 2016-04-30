package tdd;

import org.junit.Test;
import tdd.domain.Bank;
import tdd.domain.Dollor;
import tdd.domain.Expression;
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
    }


    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollor(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }


    @Test
    public void testDifferentClassEquality() throws Exception{
        // assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
        assertTrue(new Money(10, "USD").equals(new Dollor(10, "USD")));
    }

     @Test
     public void testSimpleAddition() throws Exception{
         Money five = Money.dollor(5);
         Expression sum = five.plus(five);
         Bank bank = new Bank();
         Money reduced = bank.reduce(sum, "USD");

         assertEquals(Money.dollor(10), reduced);
     }


}
