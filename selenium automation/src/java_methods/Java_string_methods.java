package java_methods;



public class Java_string_methods {

	public static void main(String[] args) {
/*
	String s="Sri kanth";
		String s1=" Sri ";
		
		//toUpperCase
		System.out.println(s.toUpperCase());     //converts this String into uppercase letter 
		
		//toLowerCase
		System.out.println(s.toLowerCase());     //converts this String into lowercase letter. 
		
		//trim
		System.out.println(s1.trim());          //eliminates white spaces before and after the String
		
		//startsWith
		System.out.println(s.startsWith("S"));  //the String starts with the letters passed as arguments 
		
		//endsWith
		System.out.println(s.endsWith("h"));   //the String ends with the letters passed as arguments
		
		//charAt
		System.out.println(s.charAt(0));       //returns a character at specified index.
		System.out.println(s.charAt(4));
		
		//length
		System.out.println(s.length());         //returns length of the specified String.
		
		//replace
		System.out.println(s.replace("kanth", "Ram"));
		
		//compareTo 
		System.out.println(s.compareTo(s1));
		
		// Concat method
		System.out.println(s.concat(s1));
	
		//Contains method
		String name="what do you know about me";  
		System.out.println(name.contains("do you know"));  
	
		//equals
		String s11="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		System.out.println(s11.equals(s2));           //true because content and case are same  
		System.out.println(s1.equals(s3));
		
		//equalsIgnoreCase
		System.out.println(s11.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s11.equalsIgnoreCase(s3));//true because case is ignored  

		//indexOf 
        String ss = "This is indexOf method";         
        // Passing Substring    
        int index = ss.indexOf("method"); //Returns the index of this substring  
        System.out.println("index of substring "+index);          

       //lastIndex
        String last_index="this is index of example";//there are 2 's' characters in this sentence  
        int index1=last_index.lastIndexOf('s');//returns last index of 's' char value  
        System.out.println(index1);//6  

        //split
        String split_m="java string split method by javatpoint";  
        String[] words=split_m.split("\\s");//splits the string based on whitespace  
        //using java foreach loop to print elements of string array  
        for(String w:words){  
        System.out.println(w);  
        }  

       //Substring
        String sub_string="javat point ja";  
        System.out.println(sub_string.substring(2,4));//returns va  
        System.out.println(sub_string.substring(2));//returns vatpoint  */

	String st="My name is Khan. My name is Bob. My name is Sonoo.";
       System.out.println(st.replace('M','l' ));
//     
      System.out.println(st.replaceAll("i", "l"));
	}

}
