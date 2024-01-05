package inheritance;

//Base class
class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}

	void honk() {
		System.out.println("Honk honk!");
	}
}