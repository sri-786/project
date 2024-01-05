//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().

//Create subclasses Circle and Triangle that extend the Shape class 
//implement the respective methods to calculate the area and parameter of each shape.

package java_practice;
abstract class Shape {
	abstract void calculateArea();

	abstract void calculatePerimeter();
}

class Circle extends Shape {
	void calculateArea() {
		int radius = 5;
		double pi = Math.PI;
		System.out.println("Circle Area : " + pi * radius * radius);

	}

	void calculatePerimeter() {
		int r = 8;
		double pi = Math.PI;
		System.out.println("Circle Perimeter : " + 2 * pi * r);// 2pi r

	}
}

class Triangle extends Shape {
	void calculateArea() { // 1/2*b*h
		int b = 4;
		int h = 6;
		System.out.println("Triangle Area : " + (b * h) / 2);

	}

	void calculatePerimeter() {
		int a = 5;
		int b = 6;
		int c = 9;
		System.out.println("Triangle Perimeter : " + (a + b + c));

	}
}

public class Abstract_cls2 {
	public static void main(String[] args) {
		Shape c = new Circle();
		c.calculateArea();
		c.calculatePerimeter();
		Shape t = new Triangle();
		t.calculateArea();
		t.calculatePerimeter();
	}
}
