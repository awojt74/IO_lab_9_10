package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Main class with examples of various code patterns for SonarCloud analysis.
 */
public class Main {
    // Simple method - will check for proper unit test coverage
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with potential bug (division by zero)
    public static double divide(int a, int b) {
        return a / b; // SonarCloud will flag this as a bug
    }

    // Unused method - will be flagged by SonarCloud
    private static String unusedMethod() {
        return "This method is never used";
    }

    // Method with duplicate code - will be flagged by SonarCloud
    public static void printNumbers() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
        }
        
        // Duplicate block
        for (int i = 0; i < 5; i++) {
            System.out.println("Number: " + i);
        }
    }

    // Complex method with multiple exit points
    public static String checkNumber(int num) {
        if (num < 0) {
            return "Negative";
        }
        else if (num == 0) {
            return "Zero";
        }
        else if (num > 100) {
            return "Large";
        }
        else {
            return "Positive";
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, CI!");
        System.out.println("2 + 3 = " + add(2, 3));
        
        // Call methods to demonstrate various cases
        printNumbers();
        System.out.println("Number check: " + checkNumber(42));
        
        // This will throw ArithmeticException if args.length == 0
        System.out.println("10 / 2 = " + divide(10, 2));
    }
}
