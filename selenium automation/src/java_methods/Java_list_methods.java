package java_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.stream.Collectors;

public class Java_list_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//size() and clear() method
		
			List<String> strList = new ArrayList<String>();           // Creating a list 
	        //add items to list
	        strList.add("Java");  
	        strList.add("C++");  
	        //print the size of list
	        System.out.println("Size of list:" + strList.size());  
	        //add more items to list
	        strList.add("Ruby"); 
	        strList.add("Python"); 
	        strList.add("C#"); 
	        //print the size of list again
	        System.out.println("Size of list after adding more elements:" + strList.size());  
	        //clear method       
	        strList.clear();
	        
	        System.out.println("List after calling clear() method:" + strList);
        
	    
	    // add and addAll methods of the list
	        
	        List<String> strList1 = new ArrayList<String>();           // Creating a list 
	        strList1.add("Java");  
	        strList1.add("C++");  
	        //print the list
	        System.out.println("List after adding two elements:" + strList);  
	        List<String> llist = new ArrayList<String>();       // Create another list
	        llist.add("Ruby"); 
	        llist.add("Python"); 
	        llist.add("C#"); 
	         // addAll method - add llist to strList 
	        strList1.addAll(llist); 
	        System.out.println("List after addAll:"+ strList1); 
	        
	    //contains and containsAll methods of the list
	        
	        List<String> list = new ArrayList<String>();
	        //initialize list to strings
	        list.add("Java");
	        list.add("Xml");
	        list.add("Python");
	        list.add("Ruby");
	        list.add("JavaScript");
	 
	        //contains method demo
	        if(list.contains("C")==true)
	            System.out.println("Given list contains string 'C'");
	        else if(list.contains("Java")==true)
	        System.out.println("Given list contains string 'Java' but not string 'C'");
	         
	        //containsAll method demo
	        List<String> myList = new ArrayList<String>();
	        myList.add("Ruby");
	        myList.add("Python");
	        if(list.containsAll(myList)==true)
	            System.out.println("List contains strings 'Ruby' and 'Python'");
	        
	  //equals method 
	        //define lists
	        List<Integer> first_list= new LinkedList<>();  
	        List<Integer> second_list = new LinkedList<>();
	        List<Integer> third_list = new LinkedList<>();
	        //initialize lists with values
	        for (int i=0;i<11;i++){  
	            first_list.add(i); 
	             second_list.add(i);  
	              third_list.add(i*i);  
	        }
	        //print each list
	        System.out.println("First list: " + first_list);
	        System.out.println("Second list: " + second_list);
	        System.out.println("Third list: " + third_list);   
	 
			//use equals method to check equality with each list to other
			if (first_list.equals(second_list) == true)
			System.out.println("\nfirst_list and second_list are equal.\n");
			else
			System.out.println("first_list and second_list are not equal.\n");
			 
			if(first_list.equals(third_list))
			System.out.println("first_list and third_list are equal.\n");
			else
			System.out.println("first_list and third_list are not equal.\n");
			if(second_list.equals(third_list))
			System.out.println("second_list and third_list are equal.\n");
			else
			System.out.println("second_list and third_list are not equal.\n");
			         
		
	//get () and set() method
			 //define list
	        List<String> listA = new ArrayList<String>();
	         listA.add("Java");
	        listA.add("C++");
	        listA.add("Python");
	 
	        //access list elements using index with get () method
	        System.out.println("Element at index 0:" + listA.get(0));
	        System.out.println("Element at index 1:" + listA.get(1));
	        System.out.println("Element at index 2:" + listA.get(2));
	        //set element at index 1 to Ruby
	        listA.set(1,"Ruby");
	        System.out.println("Element at index 1 changed to :" + listA.get(1) );
	
	 //hashCode method
	        
	        // Initializing a list of type Linkedlist 
	        List<Integer> mylist = new LinkedList<>(); 
	        mylist.add(1); 
	        mylist.add(3); 
	        mylist.add(5);
	        mylist.add(7);
	        //print the list
	        System.out.println("The list:" + mylist); 
	        //use hashCode() method to find hashcode of list  
	        int hash = mylist.hashCode(); 
	   
	        System.out.println("Hashcode for list:" + hash); 
	        
	        
	  //indexOf and lastIndexOf methods of the list
	        
	        // define an integer array 
	        List<Integer> intList = new ArrayList<Integer>(5); 
	        //add elements to the list
	        intList.add(10); 
	        intList.add(20); 
	        intList.add(30); 
	        intList.add(10); 
	        intList.add(20);
	        //print the list
	        System.out.println("The list of integers:" + intList);
	   
	        // Use indexOf() and lastIndexOf() methods of list to find first and last index
	        System.out.println("first index of 20:"  + intList.indexOf(20)); 
	        System.out.println("last index of 10:" + intList.lastIndexOf(10));
	        
	        
	   // remove and removeAll methods
	        
	        // Creating a list 
	        List<Integer> oddList = new ArrayList<Integer>(); 
	        //add elements to the list
	        oddList.add(1);
	        oddList.add(3);
	        oddList.add(5);
	        oddList.add(7);
	        oddList.add(9);
	        oddList.add(11);
	        //print the original list
	        System.out.println("Original List:" + oddList);
	        // Removes element from index 1 
	        oddList.remove(1); 
	        System.out.println("Oddlist after removing element at index 1:" + oddList);
	         
	        //removeAll method
	        List<Integer> c1 = new ArrayList<Integer>();
	        c1.add(1);
	        c1.add(5);
	        c1.add(11);
	        oddList.removeAll(c1);
	        System.out.println("Oddlist after removing elements {1,5,11}}:" + oddList);
	          
	        
	     //retainall
	        // Creating a list 
	        List<Integer> oddList1 = new ArrayList<Integer>(); 
	        //add elements to the list
	        oddList1.add(1);
	        oddList1.add(3);
	        oddList1.add(5);
	        oddList1.add(7);
	        oddList1.add(9);
	        oddList1.add(11);
	        //print the original list
	        System.out.println("Original List:" + oddList1);
	        
	        //retainAll method
	        List<Integer> c12 = new ArrayList<Integer>();
	        c12.add(1);
	        c12.add(5);
	        c12.add(11);
	        oddList1.retainAll(c12);
	        System.out.println("Oddlist after call to retainAll (1,5,11):" + oddList1);
	        
	    //sublist method
	        
	        // define a string list 
	        List<String> subList = new ArrayList<String>(5); 
	        //add elements to the list
	        subList.add("Java"); 
	        subList.add("Tutorials"); 
	        subList.add("Collection"); 
	        subList.add("Framework"); 
	        subList.add("Series"); 
	        //print the original list
	        System.out.println("The original list=>strList: " + subList);
	        //define another list   
	        List<String> subList1 = new ArrayList<String>(); 
	   
	        // take a sublist of elements from 2 to 4 from strList 
	        subList1 = subList.subList(2, 4); 
	        //print the sublist
	        System.out.println("The sublist of strList:" + subList1); 
	        
	        
	   //sort method
	        
	        //define list
	        List<Integer> intArray = new ArrayList<>();
	        Random random = new Random();
	        //populate the list with random numbers < 20
	        for (int i = 0; i < 10; i++) intArray.add(random.nextInt(20));
	        //display the original list
	        System.out.println("Original List: "+intArray);
	         
	        //natural sorting using Collections.sort () method
	        Collections.sort(intArray);
	        System.out.println("List sorted naturally:\n"+intArray);
	         
	        //Sorting using list.sort with comparator
	        intArray.sort((o1,o2) -> {return (o2-o1);});  //comparator to sort in reverse 
	        System.out.println("Reverse List sorted using comparator:\n"+intArray);
	          
	        
	  // toArray method
	        
	        // create list
	        ArrayList<String> colorsList = new ArrayList<String>(7);
	     
	        // add colors to colorsList
	        colorsList.add("Violet");
	        colorsList.add("Indigo");
	        colorsList.add("Blue");
	        colorsList.add("Green");
	        colorsList.add("Yellow");
	        colorsList.add("Orange");
	        colorsList.add("Red");
	        System.out.println("Size of the colorsList: " + colorsList.size());
	     
	        // Print the colors in the list
	        System.out.println("Contents of colorsList:");
	        for (String value : colorsList){
	          System.out.print(value + " ");
	        }  
	         
	        // Create an array from the list using toArray method
	        String colorsArray[] = new String[colorsList.size()];
	        colorsArray = colorsList.toArray(colorsArray);
	              
	       // Display the contents of the array
	        System.out.println("\n\nPrinting elements of colorsArray:" + Arrays.toString(colorsArray)); 
	        
	        
	   //Iterator method
	        
	        // create list
	        ArrayList<String> colorsList1 = new ArrayList<String>(7);
	     
	        // add colors to colorsList
	        colorsList1.add("Violet");
	        colorsList1.add("Indigo");
	        colorsList1.add("Blue");
	        colorsList1.add("Green");
	        colorsList1.add("Yellow");
	        colorsList1.add("Orange");
	        colorsList1.add("Red");
	        System.out.println("ColorList using iterator:");
	        //define iterator for colorsList
	        Iterator<String> iterator = colorsList1.iterator();
	        //iterate through colorsList using iterator and print each item
	        while(iterator.hasNext()){
	            System.out.print(iterator.next() + " ");
	        }
	        
	  //listIterator method
	        
	        //define list & add items to list
	        List<String> nameList = new LinkedList<>();
	        nameList.add("Java");
	        nameList.add("C++");
	        nameList.add("Python");
	        // get listIterator for the list
	        ListIterator<String> namesIterator = nameList.listIterator();
	         
	        // Traverse list using listiterator and print each item
	        System.out.println("Contents of list using listIterator:");
	        while(namesIterator.hasNext()){
	           System.out.print(namesIterator.next() + " ");            
	        }   
	        
	  //copies the contents of one list to another
	        
	        //create first ArrayList object
	        List<String> aList_1 = new ArrayList<String>();
	        
	        //Add elements to first ArrayList
	        aList_1.add("R");
	        aList_1.add("G");
	        aList_1.add("B");
	        //print the List
	        System.out.println("The first list:" + aList_1);
	        
	        //create second ArrayList object
	        List<String> aList_2 = new ArrayList<String>();
	         
	        //Add elements to second Arraylist
	        aList_2.add("Red");
	        aList_2.add("Green");
	        aList_2.add("Blue");
	        aList_2.add("Yellow");
	        aList_2.add("Brown");
	       
	        System.out.println("The second list: " + aList_2);
	        
	        //use Collections.copy() method to copy elements of first list to second list.
	        Collections.copy(aList_2,aList_1);
	        
	        //print the resultant second Arraylist
	        System.out.println("\n\nThe second list after copying first list to second list: " + aList_2);
	        
	        
	  // distinct () method
	        
	     // original list 
	        List<Integer> intlist = new ArrayList<>( 
	            Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5,6,5,3,4)); 
	        // Print the list 
	        System.out.println("Original ArrayList: "
	                           + intlist); 
	   
	        // using distinct() method of Java 8 stream remove duplicates from original List
	        //and generate a new list without duplicates
	        List<Integer> distinct_list = intlist.stream().distinct().collect(Collectors.toList()); 
	   
	        // Print the new list 
	        System.out.println("ArrayList after removing duplicates: "+ distinct_list); 
	         
		
		
		
	}

}
