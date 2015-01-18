/**
 * Created by Laurie on 18/01/2015.
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;
    Money (int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    Expression plus(Money addend) {
        return new Sum(this, addend);
    }
    String currency(){
        return this.currency;
    }
    static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    static Money franc(int amount){
        return new Money(amount, "CHF");
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return money.amount == this.amount && currency().equals(money.currency());
    }
    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }
    public Money reduce(String to){
        return this;
    }
    public String toString(){
        return amount + " " + currency;
    }
}