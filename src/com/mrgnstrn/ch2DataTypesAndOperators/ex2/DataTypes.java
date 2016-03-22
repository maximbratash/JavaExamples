package com.mrgnstrn.ch2DataTypesAndOperators.ex2;

/**
 * Created by mrgns on 14.03.2016.
 */
public class DataTypes {
    public static void main(String[] args) {
        byte b = 1, b1 = 1+2;
        final byte B = 1 + 2;
        b = (byte)(b1 + 1);
        b = B + 1;

        int i = 3;
        b = (byte)i;

        final int I = 2;
        b = I;

        b = 127;
        System.out.println(b) ;
        i = b + 12;

        System.out.println(i);

       i  = 4 > 5 ? 1 : 0;
        System.out.println(i);
        i  = 4 > 3 ? 1 : 0;
        System.out.println(i);


    }


}
