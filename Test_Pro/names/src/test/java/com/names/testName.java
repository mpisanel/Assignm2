package com.names;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.TestCase;

public class testName extends TestCase
{
    tstName tn = new tstName();

    public void testName() throws Exception
    {
        assertSame(tn.names("luxo"), "luxo");
    }
}
