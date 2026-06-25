package com.customexception.bankeg;

import java.util.Scanner;

public class ATM {
	Scanner sc = new Scanner(System.in);
	int balance = 10000;

	public void withdraw() {
		System.out.println("Enter amount to withdraw : ");
		int amount = sc.nextInt();
		if (amount <= balance) {
			System.out.println("Withdraw Successfull");
			balance = balance - amount;
			System.out.println("Current balance : " + balance);
		} else {
			try {

				throw new InsufficientBalance();
			} catch (InsufficientBalance e) {
				System.out.println("Insufficient Balance :(");
				System.out.println("Current balance : " + balance);

			}
		}

	}

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.withdraw();

	}

}
