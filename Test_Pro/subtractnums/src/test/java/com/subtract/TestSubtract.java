package com.subtract;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.TestCase;

public class TestSubtract extends TestCase
{
    public void testNums() throws Exception
    {
        Subtract su = new Subtract();
        assertEquals(su.nums(7,5),2);

    }
}
