package java_practice;

class Rectangle12 {
// Declare instance variables as private in the class. 
	private int length;
	private int breadth;

// Declare a constructor Rectangle and define parameters of constructor. 
	Rectangle12(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void re() {
		System.out.println(" Length: " + length);
		System.out.println(" Breadth :" + breadth);
	}

// Create a getter method for each private variable. 
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

//2 privete constuctor find the squre of numbers

// Create a setter method for each private variable and define parameter. 
	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle12 rt = new Rectangle12(30, 40);
		rt.re();

		float lth = rt.getLength();
		int bth = rt.getBreadth();

		float Area = lth * bth;
		System.out.println("Area: " + Area);

		rt.setLength(24);
		rt.setBreadth(66);

		int ln = rt.getLength();
		int br = rt.getBreadth();
		int newArea = ln * br;
		System.out.println("New area: " + newArea);
	}
}