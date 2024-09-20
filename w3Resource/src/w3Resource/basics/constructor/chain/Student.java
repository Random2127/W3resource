package w3Resource.basics.constructor.chain;

public class Student {
	private String studentID;
	private String studentName;
	private double grade;

	public Student() {
		// We call the parameterized constructor with default values
		this("noID", "noName", 0.0);
	}

	public Student(String studentID, String studentName, double grade) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.grade = grade;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}
