

//11. Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
//Create subclasses Eagle and Hawk that extend the Bird class 
//implement the respective methods to describe how each bird flies and makes a sound.
package java_practice;

abstract class Bird {
	abstract void fly();

	abstract void makeSound();
}

class Eagle extends Bird {
	void fly() {
		System.out.println("Eagle  Flying high in the sky.");
	}

	void makeSound() {
		System.out.println("Eagle Make Sound : Screech!");
	}
}

class Hawk extends Bird {

	void fly() {

		System.out.println("Hawk  Soaring through the air.");
	}

	void makeSound() {
		System.out.println("Hawk Make Sound Caw!");

	}
}

public class Abstract_cls11 {
	public static void main(String[] args) {

		Bird Eg = new Eagle();
		Eg.fly();
		Eg.makeSound();

		Bird Hk = new Hawk();
		Hk.fly();
		Hk.makeSound();
	}
}
