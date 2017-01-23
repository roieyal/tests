package org.moro.pages;

/**
 * Created by eyal on 06/11/2016.
 */
public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;

        if (balance > 0.0) // if the balance is valid
            this.balance = balance;
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0) // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
