package com.poorak.pie.arraystrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonRepeatedTest {
    private NonRepeated nonRepeated;

    @BeforeEach
    void setUp() {
        nonRepeated = new NonRepeated();
    }

    @Test
    void find() {
        assertEquals('r', nonRepeated.find("teeter"));
        assertEquals('o', nonRepeated.find("total"));
        assertEquals('t', nonRepeated.find("tamarind"));
        assertEquals(' ', nonRepeated.find("nirmal kashyapnirmmmmaallll"));
    }
}