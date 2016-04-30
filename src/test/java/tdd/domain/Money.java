package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public abstract class Money {
    protected int amount;

    abstract public Money times(int multiplier);

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    public static Dollor dollor(int amount) {
        return new Dollor(amount);
    }
    public static Franc franc(int amount) {
        return new Franc(amount);
    }
}
