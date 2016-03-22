package com.mrgnstrn.ch1Introduction.ex4;

/**
 * Created by mrgns on 06.03.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Coin coinOne = new Coin();
        coinOne.setDiameter(-0.12);
        coinOne.setDiameter(12);
        coinOne.setWeight(150);

        Coin coinTwo = new Coin();
        coinTwo.setDiameter(12);
        coinTwo.setWeight(170);

        CoinsComparator coinsComparator= new CoinsComparator();

        coinsComparator.compareDiameter(coinOne,coinTwo);







    }
}
