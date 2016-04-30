package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 29..
 */
public class Dollor {
    public int amount;

    public Dollor(int amount){
        this.amount = amount;
    }

    public void times(int multiplier){
        amount *= multiplier;
    }
}
