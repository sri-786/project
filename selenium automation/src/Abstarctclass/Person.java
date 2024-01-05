package Abstarctclass;

public class Person extends Identity 
{ 
  void getName(String name) 
  { 
     System.out.println("Name : " +name); 
  } 
  void getGender(String gender) 
  { 
     System.out.println("Gender : " +gender); 
  } 
  void getCity(String city)
  { 
     System.out.println("City: " +city); 
  } 

// Newly added method in subclass. 
   void getCountry(String country)
   { 
      System.out.println("Country: " +country); 
   } 
 } 