package com.cput.tristan.GoodPrinciples;

/**
 * Created by Tristan on 2017/03/31.
 */
public class Snake extends Reptile implements Fight, Fright, Flight {

    private String defense = "Bite";
    private String cry = "Hiss";
    private String movement = "Slither";

    Snake(double height, double weight)
    {
        this.setHeight(height);
        this.setWeight(weight);
    }

    public String defend()
    {
        return ("The snake tried to " + defense);
    }

    public String makeNoise()
    {
        return ("The snake let out a " + cry);
    }

    public String flee()
    {
        return ("The snake began to " + movement + " away");
    }

    public String layEggs()
    {
        return ("A snake can lay more than 7 eggs at a time");
    }

}
