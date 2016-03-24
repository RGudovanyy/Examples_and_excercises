package JUnitTest.JUnit;

import org.junit.Assert;
import org.junit.Test;

public class TestJunit {

    String message = "Hello world";

    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        message = "New world";
        Assert.assertEquals(message,messageUtil.printMessage());
    }
}
