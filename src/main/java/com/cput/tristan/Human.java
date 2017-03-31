package com.cput.tristan;

/**
 * This class demonstrates encapsulation for Question 1
 */
public class Human extends Mammal implements Carnivore {

    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    Human()
    {

    }

    Human(String name, String surname, int day, int month, int year)
    {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    Human(String name, String surname, int day, int month, int year, int noOfLegs)
    {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.noOfLegs = noOfLegs;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString()
    {
        return String.format("My name is %s %s, my birthday is %d/%d/%d", name, surname, day, month, year);
    }
}
