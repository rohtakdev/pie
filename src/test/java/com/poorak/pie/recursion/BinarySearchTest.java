package com.poorak.pie.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch binarySearch ;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void find() {
        assertEquals(3, binarySearch.find(new int[]{10, 20, 30, 40, 50}, 40));
        assertEquals(-2, binarySearch.find(new int[]{600, 20, 30, 40, 50}, 40));
        assertEquals(-1, binarySearch.find(new int[]{}, 40));

    }
}