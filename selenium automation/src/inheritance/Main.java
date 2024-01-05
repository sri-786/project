package inheritance;

public class Main {
	public static void main(String[] args) {
		Car myCar = new Car("Toyota", "Corolla");
		Bicycle myBicycle = new Bicycle("Schwinn");

		myCar.drive();
		myCar.honk();
		System.out.println();

		myBicycle.pedal();
		myBicycle.honk();
	}
}