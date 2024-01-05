package java_practice;
class Rectangle1 
	{
	// Declare instance variables as private in the class. 
	   private int length; 
	   private int breadth; 

	// Declare a constructor Rectangle and define parameters of constructor. 
	 Rectangle1(int breadth)
	 { 
	  this.breadth = breadth; 
	 } 
	 
	 
	// Create a getter method for each private variable. 
	
	public int getBreadth()
	{ 
	 return breadth; 
	} 
	public int getLength() {
		return length;
	}
//	2 privete constuctor find the squre of numbers
	
	// Create a setter method for each private variable and define parameter. 
	public void setLength(int length)
	{ 
	 this.length = length; 
	} 
	
	}
 
 public class Debug_triangle
 { 
 public static void main(String[] args)
 { 
   Rectangle1 rt = new Rectangle1(30); 

   float lth = rt.getLength(); 
   int bth = rt.getBreadth(); 


   float Area = lth * bth; 
   System.out.println("Area: " +Area); 

  rt.setLength(66);

   int ln = rt.getLength(); 
   int br = rt.getBreadth(); 
   int newArea = ln * br; 
  System.out.println("New area: " +newArea); 
  } 
 }