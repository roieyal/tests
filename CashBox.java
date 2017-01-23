package org.moro.pages.Maman11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eyal on 20/11/2016.
 */
public class CashBox {

    double initialAmount;
    double totalCharge;
    double change;
    double totalSum;

    List <AccountItem> accountItems = new ArrayList<>();

    public CashBox(){
        setInitialAmount(0);
    }

    public CashBox(double initialAmount){
        setInitialAmount(initialAmount);
        setTotalSum(getInitialAmount());
    }

    public void addToShoppingCart(String itemNAme, double amount, double price){

        AccountItem item = new AccountItem(itemNAme, amount ,price);
        accountItems.add(item);
    }

    public List accountDetails(){

        return accountItems;
    }

    public double total(){

        double current=0;
        for (int i = 0; i < accountItems.size(); i++) {

            current+= (accountItems.get(i).getAmount()*accountItems.get(i).getPrice());
            setTotalCharge(current);
        }
        return getTotalCharge();
    }

    public double payment(double payment){

        if(payment<getTotalCharge()){
            setTotalCharge(getTotalCharge() - payment);
            System.out.println("payment is not enough please pay more: " + getTotalCharge());
            setChange(0);
            setTotalSum(getTotalSum() + payment);
        }

        else{
            setChange(payment - getTotalCharge());
            setTotalCharge(0);
            accountItems.clear();
            setTotalSum(getTotalSum() + payment - getChange());
            System.out.println("Thank you for your payment... \n your change is: " + getChange());
        }
        return getChange();
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }
}
