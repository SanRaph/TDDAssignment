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

    }





}