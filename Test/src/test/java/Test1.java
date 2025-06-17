package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test1 {
    @Test
    public void testAdd() {
        assertEquals(5, Main.add(2, 3));
        assertEquals(0, Main.add(-1, 1));
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, Main.divide(10, 2));
        assertThrows(ArithmeticException.class, () -> Main.divide(10, 0));
    }

    @Test
    public void testCheckNumber() {
        assertEquals("Negative", Main.checkNumber(-5));
        assertEquals("Zero", Main.checkNumber(0));
        assertEquals("Positive", Main.checkNumber(50));
        assertEquals("Large", Main.checkNumber(101));
    }


}
