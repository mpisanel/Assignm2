package com.addingnums;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.TestCase;

public class TestAdding extends TestCase
{
    Adding ad = new Adding();

    public void testNums() throws Exception
    {
        assertEquals(ad.nums(15,6),21);

    }
}
