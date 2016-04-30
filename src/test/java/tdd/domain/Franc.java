package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public class Franc {

    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object object){
        Franc franc = (Franc) object;
        return amount == franc.amount;
    }
}
