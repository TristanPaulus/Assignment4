package com.cput.tristan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/29.
 */
public class NameTest {

    Name name;

    @Before
    public void setUp()
    {
        name = new Name("Tristan", "Paulus");
    }

    @Test
    public void tesToString() throws Exception {
        assertEquals("Tristan Paulus", name.toString());
    }

}