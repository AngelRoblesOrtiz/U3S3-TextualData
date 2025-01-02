package com.codedifferently.labs.partB;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.List;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Your Starting Currency:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        System.out.println("Type below: ");

        String startingNum = scanner.next();
        String startingCurrency = "None";
        double usdAmount = 0.0;

        if (Objects.equals(startingNum, "1")) { //switched conversion rates to updated ones
            startingCurrency = "Dollars";
            usdAmount = 1;
        } else if (Objects.equals(startingNum, "2")) {
            startingCurrency = "Euros";
            usdAmount = 0.97;
        } else if (Objects.equals(startingNum, "3")) {
            startingCurrency = "Pounds";
            usdAmount = 0.81;
        } else if (Objects.equals(startingNum, "4")) {
            startingCurrency = "Rupees";
            usdAmount = 85.81;
        } else if (Objects.equals(startingNum, "5")) {
            startingCurrency = "Yens";
            usdAmount = 157.73;
        } else if (Objects.equals(startingNum, "6")) {
            startingCurrency = "Renminbis";
            usdAmount = 7.30;
        }

        System.out.println("Please enter the amount in " + startingCurrency);
        double moneyAmount = scanner.nextDouble();
        usdAmount *= moneyAmount;

        System.out.println("Please Select Currency to transfer to:");
        System.out.println("1: Dollar");
        System.out.println("2: Euro");
        System.out.println("3: Pound");
        System.out.println("4: Rupee");
        System.out.println("5: Yen");
        System.out.println("6: Renminbi");
        System.out.println("Type below: ");

        String transferNum = scanner.next();
        String transferCurrency = "None";
        double newMoney = 0.0;

        if (Objects.equals(transferNum, "1")) {
            transferCurrency = "Dollars";
            newMoney = usdAmount;
        } else if (Objects.equals(transferNum, "2")) {
            transferCurrency = "Euros";
            newMoney = usdAmount * 0.97;
        } else if (Objects.equals(transferNum, "3")) {
            transferCurrency = "Pounds";
            newMoney = usdAmount * 0.81;
        } else if (Objects.equals(transferNum, "4")) {
            transferCurrency = "Rupees";
            newMoney = usdAmount * 85.81;
        } else if (Objects.equals(transferNum, "5")) {
            transferCurrency = "Yen";
            newMoney = usdAmount * 157.73;
        } else if (Objects.equals(transferNum, "6")) {
            transferCurrency = "Renminbi";
            newMoney = usdAmount * 7.30;
        }

        System.out.println(moneyAmount + " " + startingCurrency + " --> " + newMoney + " " + transferCurrency);

    }
}
