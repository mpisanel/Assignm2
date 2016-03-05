package com.exercises;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.TestCase;
//import java.util.Arrays;
public class TestExe extends TestCase
{
    ExeUtils exeT = new ExeUtils();

    public void testDece() throws Exception
    {
        assertEquals(exeT.dece(2.0,3.0), 6.0);
    }

    public void testInt() throws Exception
    {
        assertEquals(exeT.tstInt(4,4), 8);
    }

    public void testEquality() throws Exception
    {
        String a = new String("a");
        String b = new String("a");

        assertEquals(a,"a");
    }

    public void testIdentity() throws Exception
    {
        String a = new String("a");
        String b = a;

        assertSame(a, b);
    }

    public void testTrue() throws Exception
    {
        assertEquals(exeT.tstTrue(), true);
    }
    public void testFalse() throws Exception
    {
        assertEquals(exeT.tstFalse(),false);
    }

    public void testNull() throws Exception
    {
       assertNull(exeT.tstNull());
    }

    public void testNonNull() throws Exception
    {
        assertNotNull(exeT.tstNonNull());
    }

    public void testFailing() throws Exception
    {
       assertEquals(exeT.tstFailling(), 16);
    }

    public void testTimeOut() throws Exception
    {
        exeT.tstTimeOut(7,02);
    }

    public void testDisabling() throws Exception
    {
        System.out.println(" ");
        //assertEquals(12.0, exeT.tstDisabling());
    }

    public void testArrays() throws Exception
    {
        int[] arrayNum= new int[2];
        arrayNum[1] = 45;

        assertEquals(arrayNum[1], 45);
    }

}
