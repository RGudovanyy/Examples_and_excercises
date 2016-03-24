package JUnitTest.JUnit.Exercises;

import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest {

    @Test(expected = NullPointerException.class)
    public void checkNullString(){
        StringReverse.reverse("");
        StringReverse.reverse(null);
    }

    @Test
    public void checkReverse(){
        String input = "reverse";
        Assert.assertEquals("esrever",StringReverse.reverse(input));
    }



}
