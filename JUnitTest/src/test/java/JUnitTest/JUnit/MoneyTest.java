package JUnitTest.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void constructorTest() {
        Money money = new Money(10, "USD");

        Assert.assertEquals(10,money.getAmount());
        Assert.assertEquals("USD",money.getCurrency());

        money = new Money(20, "EUR");
        Assert.assertEquals(20,money.getAmount());
        Assert.assertEquals("EUR", money.getCurrency());
    }
}
