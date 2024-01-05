//5.Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
//Create subclasses Manager and Programmer that extend the Employee class 
//implement the respective methods to calculate salary and display information for each role.


package java_practice;

abstract class Employee {
	abstract void calculteSalary(int a, int b);

	abstract void displayInfo(String name);

}

class Manager extends Employee {
	void calculteSalary(int a, int b) {
		System.out.println("salary :" + (a + b));
	}

	void displayInfo(String name) {
		System.out.println("info :" + name);
	}
}

class Programmer extends Employee {
	void calculteSalary(int a, int b) {
		System.out.println("salary :" + (a + b));
	}

	void displayInfo(String name) {
		System.out.println("info :" + name);
	}

}

public class Abstract_cls5 {
	public static void main(String[] args) {
		Employee mangr = new Manager();
		mangr.calculteSalary(13700, 1300);
		mangr.displayInfo("Srikanth");

		Employee Progmr = new Programmer();
		Progmr.calculteSalary(40000, 10000);
		Progmr.displayInfo("Ram");
	}
}