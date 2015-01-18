import org.junit.Assert;
import org.junit.Test;
/**
 * Created by Laurie on 18/01/2015.
 */
public class testOperations {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }
}