package com.challenge.unit.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    public static final int SECOND_CHAR = 2;
    public static final int SIXTH_CHAR = 6;

    private Utilities utilities;
    private char[] source;
    private char[] result;

    @BeforeEach
    void setup() {
        utilities = new Utilities();
        source = new char[] {'h', 'e', 'l', 'l', 'o'};
        result = new char[] {'e', 'l'};
    }

    @Test
    void shouldReturnEveryNthChar() {
        assertArrayEquals(result, utilities.everyNthChar(source, SECOND_CHAR));
    }

    @Test
    void shouldReturnSourceForEveryNthChar() {
        assertArrayEquals(source, utilities.everyNthChar(source, SIXTH_CHAR));
    }

    @Test
    void shouldReturnNullForEveryNthChar() {
        assertNull(utilities.everyNthChar(null, SECOND_CHAR));
    }

    @Test
    void shouldReturnNullForRemovePairs() {
        assertNull(utilities.removePairs(null));
    }

    @Test
    void shouldReturnSourceForRemovePairs() {
        assertEquals("A", utilities.removePairs("A"));
    }

    @Test
    void shouldRemovePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AAABBCDEEFFF"));
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