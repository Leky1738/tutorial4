package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest2 {

        Calc c = new Calc();

        @Test
        public void testSubtraction() {
            int result = c.subtract(4, 2);
            assertEquals(4, result);
        }
    }


