
//12. Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). 
//Create subclasses Triangle and Square that extend the GeometricShape class 
//implement the respective methods to calculate the area and perimeter of each shape.

package java_practice;


abstract class GeometricShape {
	abstract void area();

	abstract void perimeter();
}

class Triangle1 extends GeometricShape {

	void area() {
		int b = 20;
		int h = 20;
		System.out.println("Area of the Triangle : " + (b * h) / 2); // 1/2 *bh

	}

	void perimeter() {
		int a = 12;
		int b = 16;
		int c = 22;
		System.out.println("Perimeter of the Triangle : " + (a + b + c));// a+b+c
	}

}

class Square extends GeometricShape {

	void area() {
		int b = 3;
		int h = 4;
		System.out.println("Area of the Square : " + b * h);// bh
	}

	void perimeter() {
		int a = 12;
		System.out.println("Perimeter of the Square : " + 4 * a); // 4a
	}

}

public class Abstract_cls12 {
	public static void main(String[] args) {
		GeometricShape tri = new Triangle1();
		tri.area();
		tri.perimeter();

		GeometricShape squr = new Square();
		squr.area();
		squr.perimeter();
	}
}