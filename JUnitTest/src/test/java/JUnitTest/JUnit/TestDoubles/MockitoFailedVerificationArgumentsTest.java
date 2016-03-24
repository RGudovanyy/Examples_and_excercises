package JUnitTest.JUnit.TestDoubles;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoFailedVerificationArgumentsTest {
    private Car myFerrari = mock(Car.class);

    @Test
    public void testVerificationFailureArguments(){
        myFerrari.driveTo("Sweet home Alabama");
        verify(myFerrari).driveTo("Sweet home Honolulu");
    }
}
