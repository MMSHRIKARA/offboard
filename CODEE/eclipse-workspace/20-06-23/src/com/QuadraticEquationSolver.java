//package com;
//
//import java.util.Scanner;
//
//	public class QuadraticEquationSolver {
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.println("Quadratic Equation Solver");
//	        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
//
//	        System.out.print("Enter coefficient a: ");
//	        double a = scanner.nextDouble();
//
//	        System.out.print("Enter coefficient b: ");
//	        double b = scanner.nextDouble();
//
//	        System.out.print("Enter coefficient c: ");
//	        double c = scanner.nextDouble();
//
//	        double root1, root2;
//
//	        double determinant = b * b - 4 * a * c;
//
//	        if (determinant > 0) {
//	            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
//	            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
//	            System.out.println("Two distinct real roots:");
//	            System.out.println("Root 1: " + root1);
//	            System.out.println("Root 2: " + root2);
//	        } else if (determinant == 0) {
//	            root1 = -b / (2 * a);
//	            System.out.println("One real root:");
//	            System.out.println("Root: " + root1);
//	        } else {
//	            double realPart = -b / (2 * a);
//	            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
//	            System.out.println("No real roots. The equation has complex roots:");
//	            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
//	            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
//	        }
//
//	        scanner.close();
//	    }}	


package com;

import java.util.Scanner;

public class QuadraticEquationSolver{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quadratic Eqn Solver : ");
		System.out.println("Enter the co-efficients of ax^2+bx+c = 0 : ");
		System.out.println("Enter co-efficient of a : ");
		double a = scan.nextDouble();
		System.out.println("Enter co-efficient of b : ");
		double b = scan.nextDouble();
		System.out.println("Enter co-efficient of c : ");
		double c = scan.nextDouble();
		
		double root1, root2;
		double determinant = b*b-4*a*c;
		
		if(determinant > 0) {
			System.out.println("There are two real roots");
			root1 = (-b + Math.sqrt(determinant))/(2*a);
			root2 = (-b - Math.sqrt(determinant))/(2*a);
			System.out.println("Root 2 : "+root2);
		}
		else if(determinant == 0) {
			System.out.println("There is one real root");
			root1 = -b/2*a;
			System.out.println("Root 1 : "+root1);
		}
		else {
			System.out.println("No real roots, The equation has complex roots");
			double realpart = -b/(2*a);
			double imaginarypart= Math.sqrt(-determinant)/(2*a);
			System.out.println("Root 1 : "+realpart+" + "+imaginarypart+" i");
			System.out.println("Root 2 : "+realpart+" - "+imaginarypart+" i");
			
		}
		
	}
	
}