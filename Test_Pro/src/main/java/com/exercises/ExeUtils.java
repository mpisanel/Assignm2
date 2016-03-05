package com.exercises;

/**
 * Created by student on 2016/03/05.
 */
public class ExeUtils
{
    public static double dece(double a, double b)
    {
        return a * b;
    }

    public static int tstInt(int a, int b)
    {
        return a + b;
    }

   public static String tstEqualty()
    {
        String a = new String("a");
        String b = new String("b");

        return a + " " + b;
    }

    public static String tstIdentity()
    {
        String a = new String("c");

        return a;
    }

    public static boolean tstTrue()
    {
        return true;
    }

    public static boolean tstFalse()
    {
        return false;
    }

    public static String tstNull()
    {
        return null;
    }

    public static String tstNonNull()
    {
        //return null;
        return "Luxolo";
    }

    public static int tstFailling()
    {
        return 16;
    }

    public static int tstTimeOut(int a, int b)
    {
        return a/b;
    }

    public static float tstDisabling()
    {
        return 12;
    }
}
