package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public class Money {
    protected int amount;

    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }
}
