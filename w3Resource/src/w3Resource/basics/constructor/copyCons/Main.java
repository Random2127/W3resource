package w3Resource.basics.constructor.copyCons;

/**
 * Write a Java program to create a class called Rectangle with instance
 * variables length and width. Implement a parameterized constructor and a copy
 * constructor that initializes a new object using the values of an existing
 * object. Print the values of the variables.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rectangleOriginal = new Rectangle(15.4, 5.6);
		System.out.println("Original rectangle length: " + rectangleOriginal.getLength());
		System.out.println("Original rectangle width: " + rectangleOriginal.getWidth());

		Rectangle rectangleCopy = new Rectangle(rectangleOriginal);
		System.out.println("Copy rectangle length: " + rectangleCopy.getLength());
		System.out.println("Copy rectangle width: " + rectangleCopy.getWidth());
	}

}
