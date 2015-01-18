/**
 * Created by Laurie on 18/01/2015.
 */
public class Franc extends Money{
    public Franc(int amount){
        this.amount = amount;
    }
    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
