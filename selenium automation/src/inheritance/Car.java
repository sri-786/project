package inheritance;

//Subclass inheriting from Vehicle class.
class Car extends Vehicle {
	String model;

	Car(String brand, String model) {
		super(brand);
		this.model = model;
	}

	void drive() {
		System.out.println("Driving the " + brand + " " + model);
	}
}
