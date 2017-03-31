package com.cput.tristan.GoodPrinciples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/03/31.
 */
public class SnakeTest {

    Snake cobra;

    @Before
    public void setUp()
    {
        cobra = new Snake(0.05, 1);
    }

    @Test
    public void testDefend() throws Exception {
        assertEquals("The snake tried to Bite",  cobra.defend());
    }

    @Test
    public void testMakeNoise() throws Exception {
        assertEquals("The snake let out a Hiss", cobra.makeNoise());
    }

    @Test
    public void testFlee() throws Exception {
        assertEquals("The snake began to Slither away", cobra.flee());
    }

    @Test
    public void testLayEggs() throws Exception {
        assertEquals("A snake can lay more than 7 eggs at a time", cobra.layEggs());
    }

}