package ch01.sec01;

import java.math.BigInteger;

public class ExpDatatype {

    public static void main(String[] args) {

        // ----------- Number ---------------

        // Messing around
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.isNaN(Double.NaN));
        System.out.println(Double.isInfinite(Double.POSITIVE_INFINITY));

        // Suit yourself :)
        int lin_one = 0;
        int lin_two = 100;
        long min_one = 0;
        long min_two = 100L;
        BigInteger bin_one = BigInteger.ZERO;
        BigInteger bin_two = BigInteger.valueOf(100);

        // Just use double
        double flt = 7.654321;

        // Casting
        char A = (char) ('B' - 1);

        // ----------- String ---------------

        StringBuilder mt_str = new StringBuilder();
        mt_str.append("Hello");

        String imt_str = "Hello";

        imt_str.equals("Hello");
        "Hello".equals(imt_str); // better, more explicit

        System.out.println(Integer.parseInt("11111111"));
        System.out.println(Integer.parseInt("11111111", 2));

    }
}