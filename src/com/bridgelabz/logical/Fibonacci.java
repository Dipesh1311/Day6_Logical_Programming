package com.bridgelabz.logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter a limit up to which fibonacci series will print : ");
        Scanner sc = new Scanner(System.in);
        int fibonacciLimit = sc.nextInt();
        int previousNumber = 0;
        System.out.print(" " + previousNumber);
        int currentNumber = 1;
        System.out.print(" " + currentNumber);
        int nextNumber;

        for (int index = 3; index <= fibonacciLimit; index++) {
            nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            System.out.print(" " + nextNumber);
        }
    }
}
