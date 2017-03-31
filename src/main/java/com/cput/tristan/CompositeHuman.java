package com.cput.tristan;

/**
 * This class demonstrates composition for question 2
 */
public class CompositeHuman {

    private Name name;
    private Birthday bday;

    CompositeHuman()
    {

    }

    CompositeHuman(Name name, Birthday bday)
    {
        this.name = name;
        this.bday = bday;
    }

    public String toString()
    {
        return ("My name is " + name.toString() +", my birthday is " + bday.toString());
    }

}
