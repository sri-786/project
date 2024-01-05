
//9. Write a Java program to create an abstract class Instrument with abstract methods play() and tune().

//Create subclasses for Glockenspiel and Violin that extend the Instrument class 
//implement the respective methods to play and tune each instrument.
package java_practice;

abstract class Instrument {
	abstract void play();

	abstract void tune();

}

class Glockenspiel extends Instrument {

	void play() {
		System.out.println("Glockenspiel playing the notes on the metal bars");

	}

	void tune() {
		System.out.println("Glockenspiel tuning the metal bars to the correct pitch");

	}

}

class Violin extends Instrument {

	void play() {
		System.out.println("Violin playing the strings with  fingers");

	}

	void tune() {
		System.out.println("Violin tuning the strings to the correct pitch");

	}

}

public class Abstract_cls9 {
	public static void main(String[] args) {
		Instrument Glo = new Glockenspiel();
		Glo.play();
		Glo.tune();

		Instrument Vio = new Violin();
		Vio.play();
		Vio.tune();
	}
}