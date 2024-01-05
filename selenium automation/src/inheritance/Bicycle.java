package inheritance;

//Subclass inheriting from Vehicle class.
class Bicycle extends Vehicle {
	Bicycle(String brand) {
		super(brand);
	}

	void pedal() {
		System.out.println("Pedaling the " + brand + " bicycle");
	}
}