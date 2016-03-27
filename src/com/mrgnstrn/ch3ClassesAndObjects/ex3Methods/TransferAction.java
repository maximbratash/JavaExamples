package com.mrgnstrn.ch3ClassesAndObjects.ex3Methods;

import com.mrgnstrn.ch3ClassesAndObjects.ex2Constructors.Account;

/**
 * Created by mrgns on 27.03.2016.
 */
public class TransferAction {
    private double transactionAmount;
    public TransferAction (double amount){
        if (amount > 0) {
            this.transactionAmount = amount;
        }else {
            throw new IllegalArgumentException();
        }

    }

    public boolean transferIntoAccount(Account accFrom, Account accTo){

        double demand = accFrom.getAmount() - transactionAmount;
        if(demand >= 0) {
            accFrom.setAmount(demand);
            accTo.addAmount(transactionAmount);
            return true;
        }else{
            return false;
        }


        }
    public double getTransactionAmoun(){
        return transactionAmount;
    }
    }

