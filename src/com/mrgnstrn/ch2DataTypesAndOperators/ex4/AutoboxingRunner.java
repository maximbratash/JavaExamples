package com.mrgnstrn.ch2DataTypesAndOperators.ex4;

/**
 * Created by mrgns on 14.03.2016.
 */
public class AutoboxingRunner {
    public static void main(String[] args) {
        Integer i = 1;
        Float f = 2f;
        i++;

        System.out.println(i.getClass());


        i = 111;
        int j = 111;
        Integer a = j;
        Integer b = i;
        System.out.println("a == b =>" + (a == b) );
        System.out.println("a == i =>" + (a == i) );
        System.out.println("b == i =>" + (i == b) );

    }
}
