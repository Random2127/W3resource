package w3Resource.basics.methods;

import java.util.Scanner;

//Write a Java method to count all the words in a string.
public class WordCounter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// I should ask for input though I'm lazy today
		String input = "one two three";

		System.out.println("This sentence has " + wordCounter(input) + " words");

	}

	private static int wordCounter(String input) {
		int wordCounter = input.split("\\s+").length;
		return wordCounter;
	}

}
