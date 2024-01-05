package java_methods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
		
		System.out.println("---------------HashMap-----------------");
		
		 Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
		
			    
			    
			    System.out.println("---------------LinkedHasMap-----------------"); 
			   
			    Map<String, String> capitalCities1 = new LinkedHashMap<String, String>();
			    capitalCities1.put("England", "London");
			    capitalCities1.put("Germany", "Berlin");
			    capitalCities1.put("Norway", "Oslo");
			    capitalCities1.put("USA", "Washington DC");
			    	    
			    	    for (String i : capitalCities1.keySet()) {
			    	      System.out.println("key: " + i + " value: " + capitalCities1.get(i));
			    	    }
			    	    
			        
			   System.out.println("---------------TreeMap-----------------"); 	  

			    // Create a HashMap object called people
			   Map<String, Integer> people = new TreeMap<String, Integer>();


			    // Add keys and values (Name, Age)
			    people.put("John", 30);
			    people.put("Steve", 33);
			    people.put("Angie", 32);

			    for (String i : people.keySet()) {
			    	 System.out.println("key: " + i + " value: " + people.get(i));
			    	        }
		
			    
			    
			    
			    
		}
	}
			  




























