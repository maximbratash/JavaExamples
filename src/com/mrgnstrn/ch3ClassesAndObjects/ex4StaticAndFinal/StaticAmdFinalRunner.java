package com.mrgnstrn.ch3ClassesAndObjects.ex4StaticAndFinal;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by mrgns on 04.04.2016.
 */
public class StaticAmdFinalRunner {

    public static void main(String[] args) {
        TransferAction taOne = new TransferAction();
        TransferAction taTwo = new TransferAction();

        System.out.println(taOne.getTransferAmount());
        System.out.println(taTwo.getTransferAmount());
        taOne.incStaticAction();
        System.out.println(taOne.getTransferAmount());
        System.out.println(taTwo.getTransferAmount());

    }
}
