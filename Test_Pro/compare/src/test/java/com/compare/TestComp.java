package com.compare;
/**
 * Created by student on 2016/03/05.
 */
import junit.framework.TestCase;
//import org.junit.Test;
public class TestComp extends TestCase
{
    Comp tc = new Comp();

    public void testIsEvenNum() throws Exception
    {
        assertTrue(tc.isEvenNum(4));
    }


}
