package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public class Franc extends Money{

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

}
