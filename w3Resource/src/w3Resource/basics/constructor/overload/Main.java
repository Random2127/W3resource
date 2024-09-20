package w3Resource.basics.constructor.overload;

/*
 * Write a Java program to create a class called "Book" with instance variables title, author, and price. 
 * Implement a default constructor and two parameterized constructors:
 * One constructor takes title and author as parameters.
 * The other constructor takes title, author, and price as parameters.
 * Print the values of the variables for each constructor.
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(); // Default constructor explicitly built for it to work
		Book book2 = new Book("Harry Potter Series", "J.K.Rowling");
		Book book3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 35.50);

		System.out.println("Book 1 title: " + book1.getTitle());
		System.out.println("Book 1 author: " + book1.getAuthor());
		System.out.println("Book 1 price: " + book1.getPrice());

		System.out.println("Book 2 title: " + book2.getTitle());
		System.out.println("Book 2 author: " + book2.getAuthor());
		System.out.println("Book 2 price: " + book2.getPrice());

		System.out.println("Book 3 title: " + book3.getTitle());
		System.out.println("Book 3 author: " + book3.getAuthor());
		System.out.println("Book 3 price: " + book3.getPrice());

	}

}
