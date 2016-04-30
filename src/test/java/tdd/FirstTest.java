package tdd;

import tdd.domain.Dollor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jarvis on 2016. 4. 29..
 */
public class FirstTest {

    @Test
    public void testMultiplication(){
        Dollor five = new Dollor(5);
        Dollor product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);

    }

}
