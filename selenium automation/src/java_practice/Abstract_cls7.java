

//7. Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
//Create subclasses Car and Motorcycle that extend the Vehicle class 
//implement the respective methods to start and stop the engines for each vehicle type.
package java_practice;
abstract class Vehicle {
	abstract void startEngine();

	abstract void stopEngine();
}

class Car extends Vehicle {

	void startEngine() {
		System.out.println("Car engine start");

	}

	void stopEngine() {
		System.out.println("Car engine stop");

	}

}

class Motorcycle extends Vehicle {

	void startEngine() {

		System.out.println("Motorcycle start");
	}

	void stopEngine() {
		System.out.println("Motorcycle stop");

	}

}

public class Abstract_cls7 {
	public static void main(String[] args) {
		Vehicle cr = new Car();
		cr.startEngine();
		cr.stopEngine();

		Vehicle mr = new Motorcycle();
		mr.startEngine();
		mr.stopEngine();
	}
}