package com.challenge.unit.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    private static final int SECOND_CHAR = 2;
    private static final int SIXTH_CHAR = 6;
    private static final String ODD_LENGTH_STRING = "Odd String!";
    private static final String EVEN_LENGTH_STRING = "Even String!";
    private static final String SOURCE_STRING = "A";
    private static final String STRING_WITHOUT_PAIRS = "ABCDEF";
    private static final String STRING_WITH_PAIRS = "AAABBCDEEFFF";
    private static final int ARGUMENT_A = 10;
    private static final int ARGUMENT_B = 5;
    private static final int CONVERT_OUTPUT = 300;
    private static final int ZERO = 0;

    private Utilities utilities;
    private char[] sourceArray;
    private char[] resultArray;

    @BeforeEach
    void setup() {
        utilities = new Utilities();
        sourceArray = new char[] {'h', 'e', 'l', 'l', 'o'};
        resultArray = new char[] {'e', 'l'};
    }

    @ParameterizedTest
    @MethodSource("sourceStrings")
    void shouldRemovePairsParameterized(String input, String output) {
        assertEquals(output, utilities.removePairs(input));
    }

    static Stream<Arguments> sourceStrings() {
        return Stream.of(
                Arguments.of("ABCDEFF", "ABCDEF"),
                Arguments.of("AB88EFFG", "AB8EFG"),
                Arguments.of("112233445566", "123456"),
                Arguments.of("ZYZQQB", "ZYZQB"),
                Arguments.of("A", "A")
        );
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
    void shouldConvert() {
        assertEquals(CONVERT_OUTPUT, utilities.converter(ARGUMENT_A, ARGUMENT_B));
    }

    @Test
    void shouldThrowArithmeticException() {
        Exception exception = assertThrows(ArithmeticException.class,
                () -> utilities.converter(ARGUMENT_A, ZERO));

        String exceptionMessage = "/ by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(exceptionMessage));
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