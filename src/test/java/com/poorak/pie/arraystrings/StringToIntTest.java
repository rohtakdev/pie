package com.poorak.pie.arraystrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntTest {
    private StringToInt stringToInt;

    @BeforeEach
    void setUp() {
        stringToInt = new StringToInt();
    }

    @Test
    void parseInt() {
        assertEquals(367, stringToInt.parseInt("367"));
    }

    @Test
    void toInteger() {
        assertEquals("367", stringToInt.toInteger(367));
        assertEquals("-367", stringToInt.toInteger(-367));
    }
}