package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibTest {
    @Test
    public void testGetFibSeriesRange1() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();

        assertFalse(result.isEmpty());
        assertEquals(Arrays.asList(0), result);
    }

    @Test
    public void testGetFibSeriesRange6() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertTrue(result.contains(3));
        assertEquals(6, result.size());
        assertFalse(result.contains(4));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), result);

        for (int i = 1; i < result.size(); i++) {
            assertTrue(result.get(i - 1) <= result.get(i));
        }


    }
}

