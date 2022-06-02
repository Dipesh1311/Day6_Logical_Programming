package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        int sumOfDivisors = 0;
        System.out.print("Enter a number to check : ");
        Scanner sc = new Scanner(System.in);
        int numberToCheck = sc.nextInt() ;

        for (int index = 1; index <= numberToCheck / 2; index++) {
            if (numberToCheck % index == 0) {
                sumOfDivisors += index;
            }
        }
        if (sumOfDivisors == numberToCheck) {
            System.out.println(numberToCheck + " is a Perfect Number");
        } else {
            System.out.println(numberToCheck + " is not a Perfect Number");
        }
    }
}
