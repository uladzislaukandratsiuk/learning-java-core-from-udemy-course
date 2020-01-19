package com.challenge.unit.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class UtilitiesTest {

    private Utilities utilities;

    @BeforeEach
    void setup() {
        utilities = new Utilities();
    }

    @Test
    void everyNthChar() {
        fail("Test not implemented");
    }

    @Test
    void shouldRemovePairs() {
        assertEquals("", utilities.removePairs(""));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("ABCDEF", utilities.removePairs("AAABBCDEEFFF"));
        assertEquals("ABCABDEF", utilities.removePairs("AABCABBDEEF"));
    }

    @Test
    void converter() {
        fail("Test not implemented");
    }

    @Test
    void nullIfOddLength() {
        fail("Test not implemented");
    }
}