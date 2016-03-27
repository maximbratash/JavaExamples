package com.mrgnstrn.ch3ClassesAndObjects.ex2Constructors;

/**
 * Created by mrgns on 27.03.2016.
 */
public class Account {
    private long id;
    private double amount;

    public Account(){ //default. Useless
        super();
    }
    public Account(long id){
        this.id = id;
    }
    public Account(long id, double amount){
        this.id = id;
        this.amount = amount;
    }

    public void setId(long id) {
        //validity check here
        this.id = id;
    }

    public void setAmount(double amount) {
        //validity check here
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void addAmount(double amount){
        this.amount += amount;
    }

}
