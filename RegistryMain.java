package org.moro.pages.Maman11;

import java.util.Scanner;

/**
 * Created by eyal on 20/11/2016.
 */
public class RegistryMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int action;
        String itemName;
        double price;
        double amount;
        double payment;
        boolean anotherAction = true;

        CashBox client1 = new CashBox(100);

        while (anotherAction == true) {
            System.out.println("Welcome to the best reg in the world, what would you like to do?");
            System.out.println("click 1 to add an item to your cart.");
            System.out.println("click 2 to print your shopping cart items.");
            System.out.println("click 3 to print the total charge of your cart.");
            System.out.println("click 4 for payment.");
            System.out.println("click 5 to see how much cash is in the cashBox.");
            action = scan.nextInt();
            switch (action) {
                case 1:
                    System.out.println("please enter the information by the following order: \nitem name, \namount, \nprice");
                    itemName = scan.next();
                    amount = scan.nextDouble();
                    price = scan.nextDouble();
                    client1.addToShoppingCart(itemName, amount, price);
                    break;
                case 2:
                    System.out.println("your shopping cart items are:");
                    System.out.println(client1.accountDetails().toString());
                    break;
                case 3:
                    System.out.println("your total is: " + client1.total());
                    break;
                case 4:
                    System.out.println("the total is: " + client1.getTotalCharge());
                    System.out.println("\nreceived cash: ");
                    payment = scan.nextDouble();
                    client1.payment(payment);
                    break;
                case 5:
                    System.out.println("your total in the cashBox is :" + client1.getTotalSum());
                    break;
            }

            System.out.println("would you like to do anything else? type y/n ");
            anotherAction = scan.next().equals("y")  ? true : false;
            System.out.println(anotherAction);
        }
        System.out.println("Thank you for using our registry...");
    }
}