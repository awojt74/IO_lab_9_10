package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MainTest {

    @Test
    @DisplayName("Test dodawania dwóch liczb")
    void add_shouldReturnCorrectSum() {
        // Given
        int a = 2;
        int b = 3;
        int expected = 5;

        // When
        int result = Main.add(a, b);

        // Then
        assertEquals(expected, result, "2 + 3 powinno równać się 5");
    }

    @Test
    @DisplayName("Test dodawania liczb przeciwnych")
    void add_shouldReturnZeroForOppositeNumbers() {
        assertEquals(0, Main.add(-1, 1), "-1 + 1 powinno równać się 0");
    }

    @ParameterizedTest
    @CsvSource({
        "10, 2, 5.0",
        "20, 4, 5.0",
        "15, 3, 5.0"
    })
    @DisplayName("Test poprawnego dzielenia")
    void divide_shouldReturnCorrectResult(int a, int b, double expected) {
        assertEquals(expected, Main.divide(a, b), 
            () -> String.format("%d / %d powinno równać się %f", a, b, expected));
    }

    @Test
    @DisplayName("Test dzielenia przez zero")
    void divide_shouldThrowArithmeticExceptionWhenDividingByZero() {
        assertThrows(ArithmeticException.class, () -> Main.divide(10, 0),
            "Dzielenie przez zero powinno rzucać wyjątek ArithmeticException");
    }

    @ParameterizedTest
    @CsvSource({
        "-5, Negative",
        "0, Zero",
        "50, Positive",
        "101, Large"
    })
    @DisplayName("Test klasyfikacji liczb")
    void checkNumber_shouldReturnCorrectClassification(int number, String expected) {
        assertEquals(expected, Main.checkNumber(number),
            () -> String.format("Liczba %d powinna być klasyfikowana jako '%s'", number, expected));
    }
   
}
