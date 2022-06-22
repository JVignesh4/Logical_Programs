package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {

    static void fibonacciSeries() {
        int termOne = 0;
        int termTwo = 1;
        int term_N = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        term_N = input.nextInt();
        System.out.println("Fibonacci Series till " + term_N + " terms:");
        int i = 1;
        while (i <= term_N) {
            System.out.printf(termOne + ", ");
            int termThree = termOne + termTwo;
            termOne = termTwo;
            termTwo = termThree;
            i++;
        }
    }

    static void primeNumber() {
        int i = 2;
        int n;
        boolean prime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check :");
        n = input.nextInt();
        while (i < n) {
            if (n % i == 0) {
                System.out.println(n + " the number is not prime ");
                prime = false;
                i++;
            }
        }
        if (prime = true) {
            System.out.println(n + " the number is prime");
        }
    }
}
