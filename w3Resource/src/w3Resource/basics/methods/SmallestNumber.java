package w3Resource.basics.methods;

import java.util.Scanner;

/*
 * 1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
 */
public class SmallestNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the a number: ");
		double x = Double.parseDouble(sc.nextLine());
		System.out.println("Input the a number: ");
		double y = Double.parseDouble(sc.nextLine());
		System.out.println("Input the a number: ");
		double z = Double.parseDouble(sc.nextLine());

		System.out.println("The smallest value is: " + smallest(x, y, z));

	}

	private static double smallest(double x, double y, double z) {

		return Math.min(Math.min(x, y), z);

	}

}
