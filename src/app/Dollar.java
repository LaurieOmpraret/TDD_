/**
 * Created by Laurie on 18/01/2015.
 */
public class Dollar extends Money{
    public Dollar(int amount, String currency){
        super(amount, currency);
    }
    public String currency(){
        return currency;
    }
}