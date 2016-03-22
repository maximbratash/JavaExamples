package com.mrgnstrn.ch1Introduction.ex4;

/**
 * Created by mrgns on 06.03.2016.
 */
public class CoinsComparator {
    public void compareDiameter(Coin firstCoin, Coin secondCoin){
        double delta;

        delta = firstCoin.getDiameter() - secondCoin.getDiameter();
        if(delta > 0) {
            System.out.println("First coin larger by " + delta);
        }else if(delta == 0){
            System.out.println("Coin are equal");
        }else{
            System.out.println("Second coin larger by " + -delta);
        }
    }
}

