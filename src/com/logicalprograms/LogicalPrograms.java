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

    static void perfectNumber() {
        int n;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = input.nextInt();
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        String result = (sum == n) ? (n + " is Perfect Number") : (n + " not Perfect Number");
        System.out.println(result);
    }

    static void reverseNumber() {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int reverse = 0;
        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }

    public static int couponNumber(int number) {
        int[] arr = new int[number];
        int a = 0;
        int count = 0;
        while (arr[number - 1] == 0) {
            int random = 100 + (int) (Math.random() * 900);
            boolean value = true;
            int i;
            for (i = 0; i <= a; i++) ;
            if (random == arr[i]) {
                value = true;
            }
            if (!value) {
                arr[a] = random;
                a++;
                count++;
            } else if (value)
                count++;
        }
        System.out.println("Total random Number needed " + count);
        return 0;
    }
}