package w3Resource.basics.methods;

import java.util.Scanner;

/*
 * Write a Java method to display the middle character of a string.
 * Note: 
 * a) If the length of the string is even there will be two middle characters.
 * b) If the length of the string is odd there will be one middle character.
 */
public class EnElMedio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String: ");
		String word = sc.nextLine();

		System.out.println("The middle character in the String is: " + middle(word));
	}

	private static String middle(String word) {
		int position;
		int length;

		if (word.length() % 2 == 0) {
			// index of the first middle character
			position = word.length() / 2 - 1;
			// we need the two central characters
			length = 2;

		} else {
			position = word.length() / 2;
			length = 1;
		}

		return word.substring(position, position + length);

	}

}
