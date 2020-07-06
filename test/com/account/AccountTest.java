package com.account;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    void setUp() {
        account = new Account();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void accountObjectIsNotNullTest(){
        assertNotNull(account);
    }

    @Test
    void accountObjectCanReceiveDepositTest(){
       account.depositMoney(2500);
       assertEquals(2500, account.getAccountBalance());

       account.depositMoney(5_000);
        assertEquals(7500, account.getAccountBalance());
    }

    @Test
    void accountWillNotTakeNegativeAmountTest(){
        account.depositMoney(5000);
        account.depositMoney(-1500);

        int accountBalance = account.getAccountBalance();
        assertEquals(5000, accountBalance);
    }

    @Test
    void withdrawWithPinTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(1564, 1000);
        assertEquals(4000, account.getAccountBalance());

    }

    @Test
    void withdrawCashWithinBalanceTest(){
        account.depositMoney(5000);
        account.withdrawMoney(6000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void accountWithdrawWithinBalanceAndPinTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(1564, 6000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void minimumBalanceWithPinTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(1564, 7000);
        assertEquals(5000, account.getAccountBalance());
    }

    @Test
    void minimumBalanceTest(){
        account.depositMoney(5000);
        account.withdrawMoney(8000);
        assertEquals(5000, account.getAccountBalance());
    }



    @Test
    void withdrawNotWithinBalanceDisplayMessageTest(){
        account.depositMoney(5000);
        account.withdrawWithPin(1564, 7000);
    }

    @Test
    void wrongPinTrialTest(){
        account.wrongPinTrial(1564);
        account.wrongPinTrial(0000);

    }


}