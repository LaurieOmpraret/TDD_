/**
 * Created by Laurie on 18/01/2015.
 */
public class Franc extends Money{
    public Franc(int amount, String currency){
        super(amount, currency);
    }
    public String currency(){
        return currency;
    }
}