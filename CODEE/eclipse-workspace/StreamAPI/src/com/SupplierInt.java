//package com;
//
//import java.util.function.Supplier;
//
//public class SupplierInt {
//	public static void main(String[] args) {
//		Supplier<String> s= ()-> "Kaizer";
//
//        System.out.println(s.get());
//	}
//
//}


//It represents a function which does not take in any argument but produces a value of type T.
//Suppliers are useful when we don’t need to supply any value and obtain a result at the same time.


package com;
import java.util.function.Supplier;
  
public class SupplierInt {
    public static void main(String args[])
    {
  
        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
  
        // Print the random value using get()
        System.out.println(randomValue.get());
    }
}