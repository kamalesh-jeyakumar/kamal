package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Main1 main; // Change 'Main' to 'Main1' to match your class name

    @Before // This runs before each test
    public void setUp() {
        main = new Main1(); // Change 'Main' to 'Main1'
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, Jenkins!", main.greet());
    }
}
