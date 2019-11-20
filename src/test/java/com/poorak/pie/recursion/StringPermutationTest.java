package com.poorak.pie.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPermutationTest {
    private StringPermutation stringPermutation;

    @Test
    void print() {
        stringPermutation.print("hat");
    }

    @BeforeEach
    void setUp() {
        stringPermutation = new StringPermutation();

    }
}