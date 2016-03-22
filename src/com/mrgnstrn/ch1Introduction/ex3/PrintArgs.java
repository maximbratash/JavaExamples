package com.mrgnstrn.ch1Introduction.ex3;

/**
 * Created by mrgns on 06.03.2016.
 */
public class PrintArgs {
    public static void main(String[] args) {
        for(String str: args){
            System.out.println("Argument -> " + str);
        }
    }
}
