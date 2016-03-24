package JUnitTest.JUnit.Exercises.TDD;

import org.junit.Assert;
import org.junit.Test;

public class RegexTest {

    @Test
    public void should_return_string(){
        Regex rx = new Regex("qwerty");
        Assert.assertEquals("qwerty", rx.getString());
    }

    @Test
    public void iteration_should_return_string(){
        Regex rx = new Regex("123");
        Assert.assertEquals(rx.getString(), rx.checkNumbers(rx.getString()));
    }



}
