package inheritance;

public class Number2 extends Number 
{ 
   int x = 50; 
   void display() 
   { 
      System.out.println("X = " +super.x); // Accessing superclass instance variable using super keyword. 
      System.out.println("X = " +x); 
   } 
 } 