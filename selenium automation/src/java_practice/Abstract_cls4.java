//4.Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
//Create subclasses Lion, Tiger, and Deer that extend the Animal class 
//implement the eat() and sleep() methods differently based on their specific behavior.


package java_practice;

abstract class Animal1 {
	abstract void eat();

	abstract void sleep();
}

class Lion1 extends Animal1 {
	void eat() {
		System.out.println("Lion eat");
	}

	void sleep() {
		System.out.println("Lion sleep");
	}
}

class Tiger1 extends Animal1 {
	void eat() {
		System.out.println("Tiger eat");
	}

	void sleep() {
		System.out.println("Tiger sleep");
	}
}

class Deer extends Animal1 {
	void eat() {
		System.out.println("Deer eat");
	}

	void sleep() {
		System.out.println("Deer sleep");
	}
}

public class Abstract_cls4 {
	public static void main(String[] args) {
		Animal1 l = new Lion1();
		l.eat();
		l.sleep();

		Animal1 t = new Tiger1();
		t.eat();
		t.sleep();

		Animal1 d = new Deer();
		d.eat();
		d.sleep();
	}
}
