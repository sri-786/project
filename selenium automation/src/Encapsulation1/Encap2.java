package Encapsulation1;

public class Encap2 {

	public static void main(String[] args)
	{ 
	// Create an object of class Rectangle and assign values of the parameter used in constructor. 
	  Encap1 rt = new Encap1(20,30); 

	// Call getter method to read value of variable because we cannot read the value directly due to privacy. 
	  int lth = rt.getLength(); 
	  int bth = rt.getBreadth(); 

	// Calculate area of the rectangle and print it on the console. 
	  int Area = lth * bth; 
	  System.out.println("Area: " +Area); 

	// Let's update the new value of variable using setter method. 
	  rt.setLength(50); 
	  rt.setBreadth(60); 

	// Call getter method to read the updated value. 
	  int ln = rt.getLength(); 
	  int br = rt.getBreadth(); 
	  int newArea = ln * br; 
	 System.out.println("New area: " +newArea); 
 } 
}