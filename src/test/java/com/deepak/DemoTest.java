package com.deepak;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    
    private static Demo demo;
    
    @BeforeClass
    public static void setUp() {
        demo = new Demo();
    }
    
    @AfterClass
    public static void destroy() {
        if (demo != null) {
            demo = null;
        }
    }
    
    @Test
    public void shouldGreetWithName() {
        String actualResult = demo.sayHello("Deepak");
        assertEquals("Hello, Deepak", actualResult);
    }
}
