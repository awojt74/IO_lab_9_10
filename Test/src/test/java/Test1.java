package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test1 {
    @Test
    public void testAdd() {
        assertEquals(5, Main.add(2, 3));
    }
}
