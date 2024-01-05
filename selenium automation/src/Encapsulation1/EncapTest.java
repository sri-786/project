package Encapsulation1;

public class EncapTest { 
public static void main(String[] args)
{ 
// Step 4: Create the object of class Student by using new keyword. 
   Student obj = new Student(); // Here, obj is reference variable of class Student and pointing to objects of class Student. 

// Step 5: Call setter method and set the value of variables. 
   obj.setStdName("Kiran"); 
   obj.setStdRollNo(4); 
   obj.setStdId(12345);
   

// Step 6: Call getter method to read the value of variables and print it on console. 
   System.out.println("Student's Name: " +obj.getStdName()); 
   System.out.println("Student's Roll no.: " +obj.getStdRollNo()); 
   System.out.println("Student's Id: " +obj.getStdId()); 
  } 
}