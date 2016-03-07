package com.mrgnstrn.chapter1.example4;

/**
 * Created by mrgns on 06.03.2016.
 */
public class Coin {
    private double diameter;
    private double weight;

    public void setDiameter(double value){
        if(value > 0){
            diameter = value;
        }else{
            System.out.println("Wrong value!!!");
        }
    }
    public double getDiameter(){
        return diameter;
    }
    public void setWeight(double value){
        weight = value;
    }

    public double getWeight(){
        return weight;
    }

}
