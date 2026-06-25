package com;

class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Bucket b2 = Bucket.getObj();
            System.out.println(b2.hashCode());
        }
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Bucket b2 = Bucket.getObj();
            System.out.println(b2.hashCode());
        }
    }
}

 

