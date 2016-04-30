package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 29..
 */
public class Dollor {
    public int amount;

    public Dollor(int amount){
        this.amount = amount;
    }

    public Dollor times(int multiplier){
        return new Dollor(amount * multiplier);
    }
}
