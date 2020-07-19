package com.account;

import org.w3c.dom.ls.LSOutput;

public class Account {

    private int accountBalance;
    //@todo Mr Raph, Pin numbers are not constants, users are allowed to change their pins when they wish. Create methods for them to change their pins
    static int PIN = 1564;


    public void depositMoney(int moneyToBeDeposited) {
        if(0 < moneyToBeDeposited) {
            accountBalance += moneyToBeDeposited;
        }

    }

    public int getAccountBalance() {
        return accountBalance;
    }

    //@todo Mr Raph, I think you should integrate the withdrw with pin and withdrw money method together, it is a security risk having them differently in my opinion or don't you think so?
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

    //@todo Mr Raph i think i will need an explanation for this method and what it actually does, i understand the code but i need to understand the rationale behind the code
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
//@todo Nice Job so far though, see you at the Village ... Chibuzo Ekejiuba ....Semicolon Africa