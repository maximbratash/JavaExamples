package com.mrgnstrn.ch3ClassesAndObjects.ex2Constructors;


/**
 * Created by mrgns on 27.03.2016.
 */
public class AccountRunner {

    public static void main(String[] args) {
        Account a = new Account();
        Account b = new Account(12L);
        Account c = new Account(14L, 12.24);
    }
}