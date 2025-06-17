package org.example;

/**
 * Główna klasa aplikacji demonstrująca różne funkcjonalności.
 */
public class Main {

    private static final int LARGE_NUMBER_THRESHOLD = 100;
    private static final int PRINT_NUMBERS_LIMIT = 5;

    private Main() {
        // Prywatny konstruktor aby zapobiec instancjonowaniu klasy
    }

    /**
     * Dodaje dwie liczby całkowite.
     * @param a pierwsza liczba
     * @param b druga liczba
     * @return suma podanych liczb
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Dzieli dwie liczby całkowite.
     * @param a dzielna
     * @param b dzielnik (musi być różny od zera)
     * @return wynik dzielenia
     * @throws ArithmeticException jeśli dzielnik jest równy zero
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Dzielnik nie może być zerem");
        }
        return (double) a / b;
    }

    /**
     * Wyświetla liczby od 0 do określonego limitu.
     */
    public static void printNumbers() {
        for (int i = 0; i < PRINT_NUMBERS_LIMIT; i++) {
            System.out.println("Number: " + i);
        }
    }

    /**
     * Klasyfikuje liczbę na podstawie jej wartości.
     * @param num liczba do sklasyfikowania
     * @return klasyfikacja liczby
     */
    public static String checkNumber(int num) {
        if (num < 0) {
            return "Negative";
        }
        if (num == 0) {
            return "Zero";
        }
        return num > LARGE_NUMBER_THRESHOLD ? "Large" : "Positive";
    }

    /**
     * Główna metoda uruchamiająca aplikację.
     * @param args argumenty wejściowe
     */
    public static void main(String[] args) {
        System.out.println("Hello, CI!");
        System.out.println("2 + 3 = " + add(2, 3));
        
        printNumbers();
        System.out.println("Number check: " + checkNumber(42));
        
        try {
            System.out.println("10 / 2 = " + divide(10, 2));
        } catch (ArithmeticException e) {
            System.err.println("Błąd arytmetyczny: " + e.getMessage());
        }
    }
}
