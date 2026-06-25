package com;

public class Bucket {

	 

    // 1.Eager initialization

 

//    private static Bucket b = new Bucket();
//
//    public static Bucket getObj() {
//        return b;
//    }

 

    private Bucket() {
    }

 

    // Lazy initialization
//    private static Bucket b;
//
//    public static  Bucket getObj() {
//        if (b == null) {
//            b = new Bucket();
//        }
//        return b;
//    }

    private static Bucket b;

 

    public static synchronized Bucket getObj() {
        if (b == null) {
            b = new Bucket();
        }
        return b;
    }

 

}