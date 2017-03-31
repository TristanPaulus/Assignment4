package com.cput.tristan;

/**
 * Created by Tristan on 2017/03/29.
 */
public class Birthday {

    private int day;
    private int month;
    private int year;

    Birthday()
    {

    }

    Birthday(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString()
    {
        return String.format("%d/%d/%d", day, month, year);
    }

}
