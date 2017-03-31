package com.cput.tristan;

/**
 * Created by Tristan on 2017/03/29.
 */
public class Name {

    private String name;
    private String surname;

    Name()
    {

    }

    Name(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String toString()
    {
        return (name + " " + surname);
    }

}
