/**
 * Created by Laurie on 18/01/2015.
 */

public interface Expression {
    Money reduce(Bank bank, String to);
}