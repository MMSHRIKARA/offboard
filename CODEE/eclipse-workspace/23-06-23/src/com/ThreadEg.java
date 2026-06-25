package com;
//Java thread eg by implementing thread class
//class Multi extends Thread {
//	public void run() {
//		System.out.println("Thread is running...");
//		
//	}
//	public static void main(String[] args) {
//		Multi m = new Multi();
//		m.start();
//		
//	}
//
//}

//Java thread eg by implementing Runnable Interface
class Multi implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Running.");
		
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		Thread t1 = new Thread(m);
		t1.start();
	}
	
}