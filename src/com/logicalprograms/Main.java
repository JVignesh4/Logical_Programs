package com.logicalprograms;

import java.util.Scanner;

import static com.logicalprograms.LogicalPrograms.fibonacciSeries;
import static com.logicalprograms.LogicalPrograms.primeNumber;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Fibonacci Series");
        System.out.println("2.Prime Number");
        System.out.println("Enter the choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                fibonacciSeries();
            case 2:
                primeNumber();
        }
    }
}
