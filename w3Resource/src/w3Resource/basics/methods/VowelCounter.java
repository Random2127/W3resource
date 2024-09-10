package w3Resource.basics.methods;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Write down a word: ");
		String input = sc.nextLine().toLowerCase();
		String vocales = "aeiou";
		int counter = 0;

		for (int i = 0; i < input.length(); i++) {
			if (vocales.contains(String.valueOf(input.charAt(i)))) { // if (vocales.contains("" + input.charAt(i))) {
				counter++;
			}
		}
		System.out.println("This word has " + counter + " vowels");

	}

}
