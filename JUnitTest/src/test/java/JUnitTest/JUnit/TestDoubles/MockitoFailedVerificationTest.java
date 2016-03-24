package JUnitTest.JUnit.TestDoubles;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoFailedVerificationTest {

    private Car myFerrari = mock(Car.class);

    @Test
    public void testVreificationFailure(){
        myFerrari.needsFuel();

        verify(myFerrari).getEngineTemperature();
    }
}
