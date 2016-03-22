package com.mrgnstrn.ch2DataTypesAndOperators.ex5FlowControl;

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
        int i = 0;

        System.out.println("While");

        while(i <= 10){
            System.out.println(i);
            i++;

        }

        i = 0;

        System.out.println("Do while");

        do{
            System.out.println(i);
            i++;

        }while (i == 5);

        System.out.println("For");

        for(i = 0;i <= 10;i++){
            System.out.println(i);

        }


        int[] arr = {5,4,3,2,1};

        System.out.println("foreach");

        for(int item:arr){
            System.out.println(item);
        }



    }

}
