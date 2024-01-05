package Abstarctclass;

public class Mainclass{
public static void main(String[] args) 
{ 
 // Declaring abstract class reference equal to subclass object. 
    Identity i = new Person(); 
     i.getName("DEEPAK"); 
     i.getGender("MALE"); 
     i.getCity("DHANBAD"); 

 // This statement will generate a compile-time error because 
 // we cannot access newly added method in subclass using superclass reference. 
 //i.getCountry("INDIA"); 
 } 
}