package com.mrgnstrn.ch2DataTypesAndOperators.ex6Arrays;

/**
 * Created by mrgns on 22.03.2016.
 */
public class ArrayRunner {
    public static void main(String[] args) {


        int arr[], arrA;
        int arrDyn[] = new int[10];
        String arrStr[] = new String[7];
        int arrInt[] = {1, 2, -4, 5};

        byte arrByte[] = {1, 2, 3};
        Object arObj = new float[5];

        arr = arrDyn;
        arrDyn = arrInt;
        arObj = arrByte;


    }

}
