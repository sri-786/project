package java_practice;


class Employee21 {
    private String name;
    private int employeeId;
    private double salary;

    // Constructor
    public Employee21(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter methods
    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Derived class representing a Manager
class Manager1 extends Employee21 {
    private String department;

    // Constructor
    public Manager1(String name,int employeeId,double salary,String department) {
    	super(name,employeeId,salary);
        this.department = department;
    }

    // Additional method specific to managers
    public void manageTeam() {
        System.out.println("Manager " + getName() + " is managing the "+ department + " team.");
    }

	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
}

// Derived class representing a Developer
class Developer extends Employee21 {
    private String programmingLanguage;

    // Constructor
    public Developer(String name,int employeeId,double salary, String programmingLanguage) {
    	super(name,employeeId,salary);
        this.programmingLanguage = programmingLanguage;
        
    }

    // Additional method specific to developers
    public void code() {
        System.out.println("Developer " + getName() + " is coding in " + programmingLanguage + ".");
    }
}

public class Inheritence_debug {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        Manager1 manager = new Manager1("John Manager",101, 80000, "Engineering");
        Developer developer = new Developer("Srikanth", 102, 100000, "Java");

        // Using inheritance to access methods and properties of the superclass
        System.out.println("Manager Information:");
        manager.displayInfo();

        System.out.println("\nDeveloper Information:");
        developer.code();
    }
}