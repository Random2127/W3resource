package w3Resource.basics.constructor.chain;

/**
 * Chaining Constructors Write a Java program to create a class called Student
 * with instance variables studentId, studentName, and grade. Implement a
 * default constructor and a parameterized constructor that takes all three
 * instance variables. Use constructor chaining to initialize the variables.
 * Print the values of the variables.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Build two Students with default and chosen values

		Student studentDef = new Student();
		Student studentPar = new Student("23", "Motoko", 9.8);

		System.out.println("StudentDef Id: " + studentDef.getStudentID());
		System.out.println("StudentDef name: " + studentDef.getStudentName());
		System.out.println("StudentDef grade: " + studentDef.getGrade());

		System.out.println("StudentPar Id: " + studentPar.getStudentID());
		System.out.println("StudentDef name: " + studentPar.getStudentName());
		System.out.println("StudentDef grade: " + studentPar.getGrade());

	}

}
