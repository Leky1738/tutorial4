package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    Calc c = new Calc();

    @Test
    public void testSubtraction() {
        int result = c.subtract(4, 2);
        assertEquals(2, result); // Corrected assertion
    }
}
