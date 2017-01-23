package org.moro.pages.Maman11;

/**
 * Created by eyal on 20/11/2016.
 */
public class AccountItem {

    String itemName;
    double amount;
    double price;

    public AccountItem(String itemName, double amount, double price){
        setItemName(itemName);
        setAmount(amount);
        setPrice(price);
    }

    @Override
    public String toString(){

        return (" The item name is: " + getItemName() + "\n The amount is: " + getAmount() + "\n The price is: " + getPrice());
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
