package com.bridgelabz.functional;

import java.util.Scanner;

public class SquareRoot {
    public static double sqrt(int number) {
        double sqrtValue = number;
        double epsilon = 1e-15;
        while (Math.abs(sqrtValue - number / sqrtValue) > epsilon * sqrtValue) {
            sqrtValue = (number / sqrtValue + sqrtValue) / 2;
        }
        return sqrtValue;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number : " );
        int number = sc.nextInt();
        double sqrt = sqrt(number);
        System.out.println("The Square Root of " + number + " is: " + sqrt);
    }
}
