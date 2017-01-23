package org.moro.pages;

import java.util.Scanner;

/**
 * Created by eyal on 06/11/2016.
 */
public class AccountTest {
    public static void main(String [] args){

        Account account = new Account("Abba Ganoov", 5.05);
        Account account2 = new Account("DODA", -13.03);
        //Display the names

        System.out.println(account.getName() + " balance: $" + account.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account.deposit(depositAmount);

        // display balances
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
