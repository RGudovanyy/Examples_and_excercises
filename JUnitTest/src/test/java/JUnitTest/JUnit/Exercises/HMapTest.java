package JUnitTest.JUnit.Exercises;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HMapTest {

    Map<Integer, String> map;

    @Before
    public void setUp(){
        map = new HashMap<Integer, String>();
    }

    @Test
    public void returnedPutValue(){
        map.put(1,"hello");
        Assert.assertEquals("hello",map.get(1));
    }

    @Test
    public void replacedSameKeys(){
        map.put(1,"hello");
        Assert.assertEquals("hello",map.get(1));
        map.put(1,"world");
        Assert.assertEquals("world",map.get(1));
    }

    @Test
    public void clearMap(){
        map.put(1,"hello");
        Assert.assertFalse(map.isEmpty());
        map.clear();
        Assert.assertTrue(map.isEmpty());
    }

    @Test
    public void nullKey(){
        map.put(null,"nullValue");
        Assert.assertEquals("nullValue",map.get(null));
    }

}
