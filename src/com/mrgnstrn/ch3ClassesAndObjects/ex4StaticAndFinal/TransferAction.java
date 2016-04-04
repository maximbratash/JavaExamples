package com.mrgnstrn.ch3ClassesAndObjects.ex4StaticAndFinal;

/**
 * Created by mrgns on 04.04.2016.
 */
public class TransferAction {
    private static int transferAmount = 0;
    private final int id = 1234;

    public void changeId(){
       // id ++;
    }

    public void incStaticAction(){
        transferAmount++;
    }

    public int getTransferAmount() {
        return transferAmount;
    }
}
