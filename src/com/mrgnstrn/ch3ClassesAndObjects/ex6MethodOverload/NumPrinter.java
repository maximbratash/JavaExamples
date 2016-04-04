package com.mrgnstrn.ch3ClassesAndObjects.ex6MethodOverload;

/**
 * Created by mrgns on 04.04.2016.
 */
public class NumPrinter {
    static void printNum(int i){
        System.out.println("int " + i);
    }
    static void printNum(double d){
        System.out.println("double " + d);
    }
    static void printNum(float f){
        System.out.println("float " + f);
    }
    static void printNum(Number n){
        System.out.println("number " + n);
    }

    public static void main(String[] args) {
        printNum(1);
        printNum(2.1);
        printNum(1f);

        Number num[] = {23, 54f, 123.2};
        for(Number n: num){
            printNum(n);
        }
    }


}
