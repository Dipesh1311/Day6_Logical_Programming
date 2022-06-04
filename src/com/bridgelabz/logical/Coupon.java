package com.bridgelabz.logical;

import java.util.Scanner;

public class Coupon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Lucky Draw !!");
        System.out.println("Please enter the number of coupons to be generated!!!");
        int N = sc.nextInt();
        Coupon.findCoupon(N);
        sc.close();
    }
    public static void findCoupon(int N) {
        int distinctnumber = 0;
        int random = 0;
        for(int i = 1; i <= N; i++) {
            random=(int)(Math.random()*900+100);  //Generating 3-digit distinct coupon numbers
            if(random == distinctnumber) {
                System.out.println("TRY NEXT!!");
            }										//checking that the numbers generated should be distinct
            else {
                System.out.println("Coupon numbers are " + random);
            }
            distinctnumber = random;
        }
    }
}
