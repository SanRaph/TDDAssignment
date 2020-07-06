package com.account;

import org.w3c.dom.ls.LSOutput;

public class Account {

    private int accountBalance;
    static int PIN = 1564;


    public void depositMoney(int moneyToBeDeposited) {
        if(0 < moneyToBeDeposited) {
            accountBalance += moneyToBeDeposited;
        }

    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void withdrawMoney(int withdrawalAmount) {
        if(withdrawalAmount <= accountBalance-1000){
            accountBalance -= withdrawalAmount;
        }
        else{
            System.out.println("SORRY! Amount Out of Bound.");
        }
    }

    public void withdrawWithPin(int pin, int amountToWithdraw) {
        if (this.PIN == pin) {
            withdrawMoney(amountToWithdraw);
        } else {
            System.out.println("Invalid Pin");
        }
    }

    public void wrongPinTrial(int pin){
        int count = 3;
        boolean cardLocked = false;
        if(this.PIN != pin){
            cardLocked = true;
            count --;

            if (cardLocked) {
                System.out.print("Card Locked");
            } else {
                System.out.print("Try Again" + count);
            }
        }else {
            System.out.println("Balance:" + getAccountBalance());
        }
    }
}
