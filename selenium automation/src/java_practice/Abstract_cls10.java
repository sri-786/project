

//10. Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
//Create subclasses Rectangle and Circle that extend the Shape2D class 
//implement the respective methods to draw and resize each shape
package java_practice;

abstract class Shape2D {
	abstract void draw();

	abstract void resize();

}

class Rectangle extends Shape2D {

	void draw() {
		int width = 240;
		int length = 250;
		System.out.println("drawing the rectangle shape : " + width + "*" + length);

	}

	void resize() {
		int width = 340;
		int length = 350;
		System.out.println("resize of the rectangle : " + width + "*" + length);
	}

}

class Circle1 extends Shape2D {

	void draw() {

		System.out.println("drawing the circle shape ");

	}

	void resize() {
		System.out.println("resize of the circle");

	}

}

public class Abstract_cls10 {
	public static void main(String[] args) {
		Shape2D re = new Rectangle();
		re.draw();
		re.resize();

		Shape2D ci = new Circle1();
		ci.draw();
		ci.resize();
	}
}