package com.mrgnstrn.chapter2.Example5;

import java.util.Random;

/**
 * Created by mrgns on 21.03.2016.
 */
public class FlowControlRunner {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){

            if(i < 4){
                System.out.println( i + " i < 4");
            } else {
                if( (i >= 4) && i < 7){
                    System.out.println(i + " 4 <= i < 7");
                } else {
                    System.out.println(i + " 7 <= i ");
                }
            }

        }
        for (int i = 0; i <= 10; i++){

            switch (i){
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                case 3:
                case 4:
                case 5:
                    System.out.println(3);

            }
        }



    }

}
