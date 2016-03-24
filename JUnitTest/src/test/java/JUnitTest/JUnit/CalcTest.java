package JUnitTest.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {


    @Test
    public void testSumm() throws Exception {

        Calculator.Calc c = new Calculator.Calc();
        Assert.assertEquals(50,c.summ(31,20));
    }

    @Test
    public void testDiv() throws Exception {
        //Assert.assertEquals(3,9,3);
    }


}