package tdd.domain;

/**
 * Created by jarvis on 2016. 4. 30..
 */
public class Money implements Expression{
    // 변수
    protected int amount;
    protected String currency;

    // 생성자
    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollor(int amount) {
        return new Money(amount, "USD");
    }
    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    // 일반 메서드
    public Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    public Expression plus(Money addend){
        return new Money(amount + addend.amount, currency);
    }

    // 오버라이드 메서드
    @Override
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }

    @Override
    public String toString(){
        return amount + " " + currency;
    }


}
