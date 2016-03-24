package JUnitTest.JUnit.Exercises.Mock;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceImplTest {

    User user = mock(User.class);
    UserDAO  userDAO  = mock(UserDAO.class);
    SecurityService securityService = mock(SecurityService.class);

    UserServiceImpl userService = new UserServiceImpl(userDAO,securityService);

    @Test
    public void should_return_old_password(){
        when(user.getPassword()).thenReturn("123");
        Assert.assertEquals(user.getPassword(),"123");
    }

    @Test public void should_change_password(){

    }
}
