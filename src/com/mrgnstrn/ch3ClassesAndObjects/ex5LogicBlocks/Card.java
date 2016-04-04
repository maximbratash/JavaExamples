package com.mrgnstrn.ch3ClassesAndObjects.ex5LogicBlocks;

/**
 * Created by mrgns on 04.04.2016.
 */
public class Card {
    {
        System.out.println("Logic block id = " + this.id);
    }
    static{
        System.out.println("Static logic");
    }


    private int id = 0;

    Card(int id){
        this.id = id;
        System.out.println("constructor id = " + this.id);
    }

    public int getId() {
        return id;
    }
}
