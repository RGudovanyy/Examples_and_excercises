package JUnitTest.JUnit.Exercises.TDD;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordValidatorTest {

    PasswordValidator pv;
    @Before
    public void setUp(){
        pv = new PasswordValidator();
    }


    @Test(expected = NullPointerException.class)
    public void should_throw_null_pointer_exception(){
        pv.setPassword(null);
    }

    @Test
    public void should_be_a_eight_characters_long(){

        pv.setPassword("snn5699");
        Assert.assertFalse(pv.getPassword().length() >= 8);
    }

    @Test
    public void should_be_at_least_two_digits(){
        pv.setPassword("qwertyui");
        String password = pv.getPassword();
        char[] pass =  password.toCharArray();
        int countDigits = 0;
        for(int i = 0; i < pass.length; i++){
            if(Character.isDigit(pass[i])) {
                countDigits++;
            }
        }
        Assert.assertFalse("Count of digits must be 2 and more, but gained " + countDigits,countDigits>=2);
    }

    @Test
    public void should_be_at_least_one_upper_case_letter(){
        pv.setPassword("qwerty123");
        String password = pv.getPassword();
        char[] pass = password.toCharArray();
        boolean upperDigits = false;
        for(int i = 0; i < pass.length; i++){
            if(Character.isUpperCase(pass[i]))
                upperDigits = true;
        }
        Assert.assertFalse(upperDigits);
    }

}