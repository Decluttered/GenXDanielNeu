package Testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class GreetTest {
    
    
    @Test
    public void test()
    {
        Greet g = new Greet();
        assertEquals("Hello", g.function());
    }
}
