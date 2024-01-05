package java_methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_methods {

	public static void main(String[] args) {
		
	//Add() method in set	
	
		// Demonstrating Set using HashSet 
        // Declaring object of type String  
        Set<String> hash_Set = new HashSet<String>(); 
  
        // Adding elements to the Set 
        // using add() method 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
  
        // Printing elements of HashSet object 
        System.out.println(hash_Set); 
        
        
  //addAll(), retainAll() and removeAll() methods
        
        // Creating an object of Set class  
        // Declaring object of Integer type  
        Set<Integer> a = new HashSet<Integer>(); 
        
        // Adding all elements to List  
        a.addAll(Arrays.asList( 
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 })); 
        
      // Again declaring object of Set class 
      // with reference to HashSet 
        Set<Integer> b = new HashSet<Integer>(); 
          
      b.addAll(Arrays.asList( 
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 })); 
  
          
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
    
        
     //Contains() and set() method
        
        // Elements are added using add() method 
        // Later onwards we will show accessing the same 
        
        System.out.println("---------------HashSet-----------------");
        
        Set<String> hs = new HashSet<String>(); 
      // Custom input elements 
        hs.add("A"); 
        hs.add("B"); 
        hs.add("C"); 
        hs.add("A"); 
  
        // Print the Set object elements size
        System.out.println("Set is " + hs.size()); 
  
        // Declaring a string 
        String check = "D"; 
  
        // Check if the above string exists in 
        // the SortedSet or not 
        // using contains() method 
        System.out.println("Contains " + check + " "
                           + hs.contains(check)); 
        
    //containsAll() method 
        
        System.out.println("---------------LinkedHasSet-----------------");
        
        Set<Integer> data = new LinkedHashSet<Integer>();   
        data.add(31);   
        data.add(21);   
        data.add(41);   
        data.add(51);   
        data.add(11);   
        data.add(81);   
  
        System.out.println("data: " + data);  
          
        Set<Integer> newData = new LinkedHashSet<Integer>();   
        newData.add(31);   
        newData.add(21);   
        newData.add(41);   
          
       System.out.println("\nDoes data contains newData?: "+ data.containsAll(newData));  
        
        
        
   //clear() method
        
        Set<Integer> data1 = new LinkedHashSet<Integer>();   
        
        data1.add(31);   
        data1.add(21);   
        data1.add(41);   
        System.out.println("Set: " + data1);  
          
        data1.clear();   
        System.out.println("The final set: " + data1);   

        
   //hashcode()
        
        Set<Integer> data2 = new LinkedHashSet<Integer>();   
        data2.add(31);   
        data2.add(21);   
        data2.add(41);   
        data2.add(51);   
        data2.add(11);   
        data2.add(81);   
        System.out.println("data: " + data2);  
        System.out.println("\nThe hash code value of set is:"+ data2.hashCode());  
        
   //isEmpty() method
        
        Set<Integer> data3 = new LinkedHashSet<Integer>();   
        data3.add(31);   
        data3.add(21);   
        data3.add(41);   
        data3.add(51);   
        data3.add(11);   
        data3.add(81);   
        System.out.println("data: " + data3);  
       System.out.println("\nIs data empty?: "+ data3.isEmpty());  
        
	}

}
