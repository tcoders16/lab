package com.sheridancollege;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testEvenNumber() {
        assertEquals("2 is even.", Main.isEvenOrOdd(2), "2 should be even");
        assertEquals("100 is even.", Main.isEvenOrOdd(100), "100 should be even");
    }

    @Test
    void testOddNumber() {
        assertEquals("1 is odd.", Main.isEvenOrOdd(1), "1 should be odd");
        assertEquals("99 is odd.", Main.isEvenOrOdd(99), "99 should be odd");
    }

    @Test
    void testNegativeNumber() {
        assertEquals("-2 is even.", Main.isEvenOrOdd(-2), "-2 should be even");
        assertEquals("-99 is odd.", Main.isEvenOrOdd(-99), "-99 should be odd");
    }
}