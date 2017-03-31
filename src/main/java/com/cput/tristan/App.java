package com.cput.tristan;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //This demonstrates encapsulation (Q1)
        Mammal mammal = new Mammal(4);
        System.out.println(mammal.getDetails());

        press(scan);

        //Implements inheritance (Q1)
        Human tristan  = new Human("Tristan", "Paulus", 9, 4, 1994, 2);
        System.out.println(tristan.toString());
        System.out.println(tristan.getDetails());

        press(scan);

        //Implements polymorphism (Q1)
        Carnivore c = tristan;
        System.out.println(c.diet);

        press(scan);

        //Implements Composition (Q2)
        Name name = new Name("Matthew", "Long");
        Birthday bday = new Birthday(9, 4, 1994);
        CompositeHuman matt = new CompositeHuman(name, bday);
        System.out.println(matt.toString());

    }

    public static void press(Scanner scan)
    {
        System.out.println("\nPress enter to continue\n");
        String y = scan.nextLine();
    }

}
