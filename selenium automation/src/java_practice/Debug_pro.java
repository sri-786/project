package java_practice;

//Abstract class representing a university person
abstract class UniversityPerson {
	String name;
	int id;

// Constructor
	UniversityPerson(String name, int id) {
		this.name = name;
		this.id = id; //
	}

// Abstract method to display information about the person
	abstract void display();
}

//Concrete class representing a professor
class Professor extends UniversityPerson {
	String department;

// Constructor
	public Professor(String name, int id, String department) {
		super(name, id);
		this.department = department;
	}

// Implementation of the abstract method to display professor information
	void display() {
		System.out.println("Professor - Name: " + name + ", ID: " + id + ", Department: " + department);
	}
}

//Concrete class representing an administrative staff
class AdministrativeStaff extends UniversityPerson {
	String role;

// Constructor
	public AdministrativeStaff(String name, int id, String role) {
		super(name, id);
		this.role = role;
	}

// Implementation of the abstract method to display staff information
	@Override
	void display() {
		System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
	}
}

//Concrete class representing a student
class Studentt extends UniversityPerson {
	String major;

// Constructor
	public Studentt(String name, int id, String major) {
		super(name, id);
		this.major = major;
	}

// Implementation of the abstract method to display student information
	void display() {
		System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
	}
}

public class Debug_pro {
	public static void main(String[] args) {
		// Creating objects of concrete classes
		UniversityPerson professor = new Professor("Syam", 123, "Computer");
		UniversityPerson staff = new AdministrativeStaff("amit", 201, "Admin Assistant");
		UniversityPerson student = new Studentt("Sri", 9343, "Major");

		// Using abstraction to display information about university persons
		professor.display();
		staff.display();
		student.display();
	}
}