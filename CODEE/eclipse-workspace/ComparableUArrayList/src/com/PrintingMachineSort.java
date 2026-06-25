package com;

import java.util.ArrayList;
import java.util.Collections;

public class PrintingMachineSort {
	public static void main(String[] args) {
		ArrayList<PrintingMachine> al = new ArrayList();
		al.add(new PrintingMachine("Heidelberg", 10000));
		al.add(new PrintingMachine("Multilathe", 8000));
		al.add(new PrintingMachine("Autoprint", 6000));
		
		Collections.sort(al);
		
		for(PrintingMachine pm : al) {
			System.out.println(pm);
		}
		
	}

}
