package org.moro.pages;

import java.util.Scanner;

/**
 * Created by eyal on 06/11/2016.
 */
public class Welcome {
    public static void main (String[]Args){
        int num1, num2, num3;
        Scanner input1 = new Scanner(System.in);

        System.out.println("The following program will sum 2 numbers and present the total");
        System.out.println("Enter first num to sum");
        num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second num to sum");
        num2 = input2.nextInt();

        num3 = num1 + num2;
        System.out.println("the sum of both numbers is:" + num3);

    }
}
