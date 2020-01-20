package com.challenge.unit.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private static final int SECOND_CHAR = 2;
    private static final int SIXTH_CHAR = 6;
    private static final String ODD_LENGTH_STRING = "Odd String!";
    private static final String EVEN_LENGTH_STRING = "Even String!";
    private static final String SOURCE_STRING = "A";
    private static final String STRING_WITHOUT_PAIRS = "ABCDEF";
    private static final String STRING_WITH_PAIRS = "AAABBCDEEFFF";

    private Utilities utilities;
    private char[] sourceArray;
    private char[] resultArray;

    @BeforeEach
    void setup() {
        utilities = new Utilities();
        sourceArray = new char[] {'h', 'e', 'l', 'l', 'o'};
        resultArray = new char[] {'e', 'l'};
    }

    @Test
    void shouldReturnEveryNthChar() {
        assertArrayEquals(resultArray, utilities.everyNthChar(sourceArray, SECOND_CHAR));
    }

    @Test
    void shouldReturnSourceForEveryNthChar() {
        assertArrayEquals(sourceArray, utilities.everyNthChar(sourceArray, SIXTH_CHAR));
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
        assertEquals(SOURCE_STRING, utilities.removePairs(SOURCE_STRING));
    }

    @Test
    void shouldRemovePairs() {
        assertEquals(STRING_WITHOUT_PAIRS, utilities.removePairs(STRING_WITH_PAIRS));
    }

    @Test
    void converter() {
        fail("Test not implemented");
    }

    @Test
    void shouldReturnNullIfOddLength() {
        assertNull(utilities.nullIfOddLength(ODD_LENGTH_STRING));
        assertNotNull(utilities.nullIfOddLength(EVEN_LENGTH_STRING));
    }

    @Test
    void shouldReturnSourceIfEvenLength() {
        assertEquals(EVEN_LENGTH_STRING, utilities.nullIfOddLength(EVEN_LENGTH_STRING));
    }
}