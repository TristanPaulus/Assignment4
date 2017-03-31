package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/29.
 */
public class MammalTest {

    Mammal m;

    @Before
    public void setUp()
    {
        m = new Mammal(4);
    }

    @Test
    public void getDetails() throws Exception {
        assertEquals("I am Warm blooded, I have 4 legs", m.getDetails());
    }

}