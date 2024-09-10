package w3Resource.basics.methods;

import java.util.Scanner;

/*
 * 2. Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 */
public class AverageOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the a number: ");
		double x = Double.parseDouble(sc.nextLine());
		System.out.println("Input the a number: ");
		double y = Double.parseDouble(sc.nextLine());
		System.out.println("Input the a number: ");
		double z = Double.parseDouble(sc.nextLine());

		average(x, y, z);

	}

	private static double average(double x, double y, double z) {

		return (x + y + z) / 3;
	}

}
