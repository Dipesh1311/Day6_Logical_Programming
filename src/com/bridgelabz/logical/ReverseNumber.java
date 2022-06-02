package com.bridgelabz.logical;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, rev = 0;
        System.out.print("Enter the number to be reversed : ");
        int num = sc.nextInt();

        while (num > 0) {

            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }

        System.out.print("The reversed Number is: " + rev);
    }
}
