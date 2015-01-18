/**
 * Created by Laurie on 18/01/2015.
 */
public class Dollar extends Money{
    public Dollar(int amount){
        this.amount = amount;
    }
    public Money times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }
}