package com.sheridancollege;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins!");
    }

    // Method to check if a number is even or odd
    public static String isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is even.";
        } else {
            return number + " is odd.";
        }
    }
}