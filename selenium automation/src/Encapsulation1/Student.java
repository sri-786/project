package Encapsulation1;

public class Student {
// Step 1: Declare variables private in the class. 
	private String stdName; // private field.
	private int stdRollNo;
	private int stdId;

// Step 2: Apply public getter method for each private variable in the class. 
	public String getStdName() {
		return stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public int getStdId() {
		return stdId;
	}

// Step 3: Apply public setter method for each private variable in the class. 
	public void setStdName(String name) {
		this.stdName = name;
	}

	public void setStdRollNo(int rollNo) {
		this.stdRollNo = rollNo;
	}

	public void setStdId(int id) {
		this.stdId = id;
	}
}