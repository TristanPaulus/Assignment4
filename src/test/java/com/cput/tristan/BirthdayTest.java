package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/29.
 */
public class BirthdayTest {

    Birthday bday;

    @Before
    public void setUp()
    {
        bday = new Birthday(9,4,1994);
    }

    @Test
    public void tesToString() throws Exception {

        assertEquals("9/4/1994", bday.toString());
    }

}