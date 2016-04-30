package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public class Franc extends Money{

    public Franc(int amount, String currency){
        super(amount, currency);
    }

    public Franc times(int multiplier){
        return Money.franc(amount * multiplier);
    }



}
