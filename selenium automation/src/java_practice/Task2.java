package java_practice;

class Task {

	// Declare instance variables as private in the class.
	private String name;
	private int number;

	// Create a getter method for each private variable.
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	// Create a setter method for each private variable and define parameter.
	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

class Task11 extends Task {

	// Declare instance variables as private in the class.
	private String newName;
	private int newNumber;
	
	private String re;
	public String se;
	
	Task11(String re,String se){
		
		this.re=re;
		this.se=se;
	}
	public void st() {
	System.out.println("print name  :"+re);
	System.out.println("print  name1 :"+se);
}
	// Create a getter method for each private variable.
	public String getName1() {
		return newName;
	}

	public int getNewNumber1() {
		return newNumber;
	}

	// Create a setter method for each private variable and define parameter.
	public void setName1(String newName) {
		this.newName = newName;
	}

	public void setNewNumber1(int newNumber) {
		this.newNumber = newNumber;
	}
}

public class Task2 {

	public static void main(String[] args) {
		
		Task11 rt = new Task11("Srikanth","pavan");
		rt.st();

		// the value of variable using setter method.
		rt.setName("Sri");
		rt.setNumber(1346);

		String s = rt.getName();
		int i = rt.getNumber();
		
		System.out.println("name :" + s + "  number :" + i);

		rt.setName1("Kanth");
		rt.setNewNumber1(4321);

		String s1 = rt.getName1();
		int i1 = rt.getNewNumber1();
		// Call getter method to read the updated value.
		System.out.println("new Name :" + s1 + " new Number :" + i1);

		// Addition
		int add = i + i1;

		System.out.println("Addition values :" + add);
	}
}
