package com.cput.tristan;

/**
 * Created by Tristan on 2017/03/29.
 */
public class Mammal {

    private String blood = "Warm blooded";
    protected int noOfLegs;

    Mammal()
    {

    }

    Mammal(int noOfLegs)
    {
        this.noOfLegs = noOfLegs;
    }

    public String getDetails()
    {
        return String.format("I am %s, I have %d legs", blood, noOfLegs);
    }

}
