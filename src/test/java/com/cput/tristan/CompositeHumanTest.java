package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/29.
 */
public class CompositeHumanTest {

    Name name;
    Birthday bday;
    CompositeHuman jack;

    @Before
    public void setUp()
    {
        name = new Name("Jack", "Smith");
        bday = new Birthday(21, 8, 2001);
        jack = new CompositeHuman(name, bday);
    }

    @Test
    public void testToString()
    {
        assertEquals("My name is Jack Smith, my birthday is 21/8/2001", jack.toString());
    }

}