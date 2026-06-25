package com;

 

public class PrimeSolution {


    public static void main(String[] args) {


        PrimeMinister pm=PrimeMinister.getInstance();
//        System.out.println(PrimeMinister.pminister);

        System.out.println(pm);
        System.out.println(pm.pminister);


        System.out.println("-------------------------------");

//        PrimeMinister pm1=PrimeMinister.getInstance();

//        System.out.println(pm1);

        PrimeMinister.pminister="Rahul Gandhi";

        System.out.println(pm.pminister);


    }

 

}
