package com.mrgnstrn.ch3ClassesAndObjects.ex3Methods;

import com.mrgnstrn.ch3ClassesAndObjects.ex2Constructors.Account;

/**
 * Created by mrgns on 27.03.2016.
 */
public class TransferActionRunner {
    public static void main(String[] args) {
        Account accFrom = new Account(1234567L, 1495.4);
        Account accTo = new Account(8546323L, 124);
        TransferAction transferAction = new TransferAction(100);
        boolean complete =transferAction.transferIntoAccount(accFrom,accTo);

        if(complete){
            System.out.println("Summ: " + transferAction.getTransactionAmoun() + " succes" );
            System.out.println("To client id " + accTo.getId() + "now has " + accTo.getAmount());
        }else{

            System.out.println("Failure." + accFrom.getId() + " has no money");
        }
    }
}
