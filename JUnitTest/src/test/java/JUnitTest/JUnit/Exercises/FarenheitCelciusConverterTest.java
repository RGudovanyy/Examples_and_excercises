package JUnitTest.JUnit.Exercises;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FarenheitCelciusConverterTest {
    private static final Object[] getGradusF(){
        return new Object[]{
                new Object[]{32},
                new Object[]{98},
                new Object[] {212}
        };
    }
    private static final Object[] getGradusC(){
        return new Object[]{
                new Object[]{0},
                new Object[]{37},
                new Object[] {100}
        };
    }




    @Test
    @Parameters(method = "getGradusC")
    public void testToFarenheit(int c) throws Exception {
        Assert.assertEquals(c*32, FarenheitCelciusConverter.toFarenheit(c) );
    }

    @Test
    @Parameters(method = "getGradusF")
    public void testToCelcius(int f) throws Exception {
        Assert.assertEquals(f/32, FarenheitCelciusConverter.toCelcius(f));
    }
}