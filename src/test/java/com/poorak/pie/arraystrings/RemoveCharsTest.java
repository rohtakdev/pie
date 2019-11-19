package com.poorak.pie.arraystrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharsTest {
    private RemoveChars removeChars;

    @BeforeEach
    void setUp() {
        removeChars = new RemoveChars();
    }

    @Test
    void remove() {
        assertEquals("Bttl f th Vwls: Hw vs. Grzny", removeChars.remove("Battle of the Vowels: Hawaii vs. Grozny", "aeiou"));
    }

    @Test
    void remove2() {
        StringBuilder sb = new StringBuilder("Battle of the Vowels: Hawaii vs. Grozny");
        removeChars.remove(sb, "aeiou");
        assertEquals("Bttl f th Vwls: Hw vs. Grzny", sb.toString());
    }
}