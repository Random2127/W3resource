package w3Resource.basics.constructor.validation;

/**
 * Constructor with Validation Write a Java program to create a class called
 * Account with instance variables accountNumber and balance. Implement a
 * parameterized constructor that initializes these variables with validation:
 * 
 * accountNumber should be non-null and non-empty. balance should be
 * non-negative. Print an error message if the validation fails.
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account testEmpty = new Account("", 123.6);
		//Account testNeg = new Account("123456", -123.6);
		
		Account valid = new Account("123456A", 123.6);
		System.out.println("Account data: "+ valid.getAccNum()+ " "+ valid.getBalance()+ "€");
		
		
	}

}
