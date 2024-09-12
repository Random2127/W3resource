package w3Resource.basics.recursive;

import java.util.Scanner;

public class RecursiveAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an int: ");
		int number = Integer.parseInt(sc.nextLine());

		System.out.println("Result: " + recursiveAdd(number));
	}

	private static int recursiveAdd(int number) {
		if (number == 0) {
			return 0;
		} else {
			return number + recursiveAdd(number - 1);
		}
	}

}
