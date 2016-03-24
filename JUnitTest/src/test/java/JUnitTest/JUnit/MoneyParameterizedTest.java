package JUnitTest.JUnit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
/*annotation on the test class informs JUnit that this test
must be run with a special Runner provided by JUnitParams library.
*/

public class MoneyParameterizedTest {
    private static final Object[] getMoney() {   //Data-providing methods are expected to return an Object[] array.
        return new Object[]{
                /*
                The constructorTest() method expects two parameters: amount and
currency . Each row of the array returned by the getMoney() method contains them both.
                 */
                new Object[] {10, "USD"},
                new Object[] {20, "EUR"}
        };
    }

    @Test
    @Parameters(method = "getMoney")
    /*
    If a method uses a data-providing method, it will have to be annotated with a @Parameters
annotation with the method attribute.
     */
    public void constructorTest(int amount, String currency){
        Money money = new Money(amount,currency);

        Assert.assertEquals(amount,money.getAmount());
        Assert.assertEquals(currency, money.getCurrency());
    }

}
