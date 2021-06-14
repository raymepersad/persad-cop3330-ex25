/*
 *  UCF COP3330 Summer 2021 Assignment 26 Solution
 *  Copyright 2021 RAYME PERSAD
 */

/*Write a program that will help you determine how many months it will take to pay off a credit card balance. The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment. The program should then return the number of months needed (rounded up to the next integer value).

The formula for this is

n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
where

n is the number of months.
i is the daily rate (APR divided by 365).
b is the balance.
p is the monthly payment.
 */




package org.example;

import java.util.Scanner;

public class cardBalance {
    public static void main(String[] args) {

        // create object for user input
        Scanner in = new Scanner(System.in);

        // prompt user to enter balance, apr, and monthly payment
        System.out.print("What is your balance? ");
        double b = Double.parseDouble(in.nextLine());

        System.out.print("What is the APR in the card (as a percent)? ");
        double apr = Double.parseDouble(in.nextLine());

        System.out.print("What is the monthly payment you can make? ");
        double p = Double.parseDouble(in.nextLine());

        // find daily rate
        double i = apr/(365*100);

        // calculate b/p
        double temp = b/p;

        // calculate (1+i)^30
        double temp1 = Math.pow((1+i),30);

        // calculate log(1+i)
        double temp2 = Math.log(1+i);

        // calculate log(1 + b/p * (1 - (1+i)^30))
        double temp3 = Math.log(1 + temp *(1 - temp1));

        // find ceiling value of -(1/30) * log(1 + b/p * (1 - (1+i)^30)) / log(1+i)
        int n = (int)Math.ceil((-1 * temp3) / (temp2*30));

        // display result
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}
