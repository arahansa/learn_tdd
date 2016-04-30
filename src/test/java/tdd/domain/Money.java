package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public abstract class Money {
    protected int amount;
    protected String currency;

    public abstract Money times(int multiplier);

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return currency;
    }

    public static Dollor dollor(int amount) {
        return new Dollor(amount, "USD");
    }
    public static Franc franc(int amount) {
        return new Franc(amount, "CFH");
    }

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

}
