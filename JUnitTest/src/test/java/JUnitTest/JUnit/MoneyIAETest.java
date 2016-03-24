package JUnitTest.JUnit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class MoneyIAETest {

    private final  static int VALID_AMOUNT = 5;
    private final static String VALID_CCURRENCY = "USD";

    private static final Object[] getInvalidAmount(){
        return new Integer[] [] {{-12387}, {-5}, {-1}};
    }

    @Test(expected =  IllegalArgumentException.class)
    @Parameters (method = "getInvalidAmount")
    public void constructorTestAmount(int invalidAmount){
        new Money(invalidAmount, VALID_CCURRENCY);
    }

    private static final Object[] getInvalidCurrency(){
        return new String [][] {{null},{""}};
    }

    @Test(expected =  IllegalArgumentException.class)
    @Parameters (method = "getInvalidCurrency")
    public void constructorTestCurrency(String invalidCurrency){
        new Money(VALID_AMOUNT,invalidCurrency);
    }
}
