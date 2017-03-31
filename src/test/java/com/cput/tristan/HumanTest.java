package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/29.
 */
public class HumanTest {

    Human tristan;

    @Before
    public void setUp()
    {
        tristan  = new Human("Tristan", "Paulus", 9, 4, 1994);
    }

    @Test
    public void testGetName() throws Exception {

        assertEquals("Tristan", tristan.getName());
    }

    @Test
    public void testGetSurname() throws Exception {
        assertEquals("Paulus", tristan.getSurname());
    }

    @Test
    public void testGetDay() throws Exception {
        assertEquals(9, tristan.getDay());
    }

    @Test
    public void testGetMonth() throws Exception {
        assertEquals(4, tristan.getMonth());
    }

    @Test
    public void testGetYear() throws Exception {
        assertEquals( 1994, tristan.getYear());
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("My name is Tristan Paulus, my birthday is 9/4/1994", tristan.toString());
    }

}