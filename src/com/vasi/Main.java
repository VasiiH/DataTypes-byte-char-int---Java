package com.vasi;

public class Main {

    public static void main(String[] args) {
	// write your code here


        //8 bits
        byte maxByte = 127;
        byte minByte = -128;
        byte i =(byte) (maxByte/2);// casting
        System.out.println(i);

        //16 bits
        short minShort = -32768;
        short maxShort = 32767;
        short j = (short) (maxShort/2);// casting
        System.out.println(j);

        //32 bits
        int maxInt= 2_147_483_647;
        int minInt= -2_147_483_648;
        System.out.println(minInt/2);

        //64 bits
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        long k = maxLong/2;// here no casting needed
        System.out.println(k);

        long longTotal = 20000L + 4000L * (maxByte+maxInt+maxShort);
        System.out.println("long : "+ longTotal);

        short shortTotal =(short) (200 + 3 * (maxByte));
        System.out.println("short : "+ shortTotal);

    }
}
