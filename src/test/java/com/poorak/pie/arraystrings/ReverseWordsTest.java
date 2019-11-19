package com.poorak.pie.arraystrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {
    private ReverseWords reverseWords;

    @BeforeEach
    void setUp() {
        reverseWords = new ReverseWords();
    }

    @Test
    void reverse() {
        assertEquals("try. no is there not, do or Do", reverseWords.reverse("Do or do not, there is no try."));
    }

    @Test
    void reverse2() {
        assertEquals("try. no is there not, do or Do", new String(reverseWords.reverse2("Do or do not, there is no try.")));
    }
}