package com.bridgelabz.logical;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;

         for(i=2; i<=num;i++){

             if(num%i == 0)
                 break;
             }
             if (num == i) {
                 System.out.print("Number is prime");
             }
             else{
                     System.out.print("Number is not prime");
                 }
    }
}
