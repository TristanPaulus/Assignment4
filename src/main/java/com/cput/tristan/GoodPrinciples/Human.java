package com.cput.tristan.GoodPrinciples;

import com.cput.tristan.*;

/**
 * Created by Tristan on 2017/03/31.
 */
public class Human extends Mammal implements Fight, Flight, Fright{

    private String defense = "Raise fists";
    private String cry = "Scream";
    private String movement = "Run";

    private String name;
    private String ethnicity;

    Human(double height, double weight, String name, String ethnicity)
    {
        this.setHeight(height);
        this.setWeight(weight);

        this.name = name;
        this.ethnicity = ethnicity;
    }

    public String defend()
    {
        return (name + " started to " + defense);
    }

    public String makeNoise()
    {
        return (name + " began to " + cry);
    }

    public String flee()
    {
        return (name + " wanted to " + movement + " away");
    }

    public String giveBirth()
    {
        return ("A human can have between 1 and 4 children per pregnancy");
    }

    public String getName()
    {
        return name;
    }

    public String getEthnicity()
    {
        return ethnicity;
    }

}
