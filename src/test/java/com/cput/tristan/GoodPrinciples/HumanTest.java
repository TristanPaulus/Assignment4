package com.cput.tristan.GoodPrinciples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/31.
 */
public class HumanTest {

    Human person;

    @Before
    public void setUp()
    {
        person = new Human(1.4, 75, "Tristan Paulus", "Coloured");
    }

    @Test
    public void testDefend() throws Exception {
        assertEquals("Tristan Paulus started to Raise fists", person.defend());
    }

    @Test
    public void testMakeNoise() throws Exception {
        assertEquals("Tristan Paulus began to Scream", person.makeNoise());
    }

    @Test
    public void testFlee() throws Exception {
        assertEquals("Tristan Paulus wanted to Run away", person.flee());
    }

    @Test
    public void testGiveBirth() throws Exception {
        assertEquals("A human can have between 1 and 4 children per pregnancy", person.giveBirth());
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals("Tristan Paulus", person.getName());
    }

    @Test
    public void testGetEthnicity() throws Exception {
        assertEquals("Coloured", person.getEthnicity());
    }

}