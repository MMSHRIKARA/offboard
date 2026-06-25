package com;


public class PrimeMinister {

  static String pminister;

    private static PrimeMinister pm;

    private PrimeMinister() {
        System.out.println("pm elected");
    }

    public static PrimeMinister getInstance() {
        if(pm==null) {
        pm=new PrimeMinister();
        }
            return pm;
    }
}