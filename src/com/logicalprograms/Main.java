package com.logicalprograms;

import java.util.Scanner;

import static com.logicalprograms.LogicalPrograms.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Fibonacci Series");
        System.out.println("2.Prime Number");
        System.out.println("3.Perfect Number");
        System.out.println("4.Reverse Number");
        System.out.println("5.Coupon Number ");
        System.out.println("Enter the choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                fibonacciSeries();
            case 2:
                primeNumber();
            case 3:
                perfectNumber();
            case 4:
                reverseNumber();
            case 5:
                couponNumber(5);
        }
    }
}
