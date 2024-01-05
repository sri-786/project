

//8. Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
//Create subclasses Athlete and LazyPerson that extend the Person class
//implement the respective methods to describe how each person eats and exercises.
package java_practice;

abstract class Person {
	abstract void eat();

	abstract void exercise();
}

class Athlete extends Person {

	void eat() {
		System.out.println("Athlete eats healthy food");

	}

	void exercise() {

		System.out.println("Athlete daily exercise");
	}

}

class LazyPerson extends Person {

	void eat() {
		System.out.println("Lazy Person eats junk food");

	}

	void exercise() {
		System.out.println("Lazy Person no exercise");

	}

}

public class Abstract_cls8 {
	public static void main(String[] args) {
		Person at = new Athlete();
		at.eat();
		at.exercise();

		Person Lp = new LazyPerson();
		Lp.eat();
		Lp.exercise();
	}

}
