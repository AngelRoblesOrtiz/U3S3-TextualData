package com.codedifferently.labs.partA;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName + " wants to purchase a " + itemDesc ;

        double price = 19.50;
        double tax = 1.05;
        int quantity = 2;
        double totalPrice = (price * tax) * quantity;
        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        System.out.println(message);
        message = "Total cost with tax is: " + totalPrice;
        System.out.println(message);
    }
}
