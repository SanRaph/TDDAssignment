package com.account;

public class Account {

    private int accountBalance;


    public void depositMoney(int moneyToBeDeposited) {
        if(0 < moneyToBeDeposited) {
            accountBalance += moneyToBeDeposited;
        }

    }

    public int getAccountBalance() {
        return accountBalance;
    }
}
