package w3Resource.basics.recursive;

import java.util.Scanner;

public class RecursiveMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an int: ");
		int number = Integer.parseInt(sc.nextLine());

		System.out.println("Result: " + recursive(number));
	}

	private static int recursive(int number) {

		if (number == 0 || number == 1) {
			return 1;
		} else {
			return number * recursive(number - 1);
		}
	}

}
