/**
 * Created by Laurie on 18/01/2015.
 */
public class Dollar {
    public int amount;
    public Dollar(int amount) {
        this.amount = amount;
    }
    public void times(int multiplier) {
        amount *= multiplier;
    }
}
