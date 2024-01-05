package java_methods;

public class Counting_words {

	public static void main(String[] args) {
		
	      String msg = "Welcome To Charani infotech ";
	     
	      // initial count of the words
	      int total = 0;
	     
	      // loop variable
	      int i = 0; 
	      // while loop to count the number of words
	      while (i < msg.length()) { 
	         // checking if the current character is space or not
	         if ((msg.charAt(i) == ' ') )  {
	            total++;  // incrementing the word count
	         }
	         i++; // incrementing loop variable
	      } 
	      // printing the result
	      System.out.println("Number of words in the given string: " +  total);
	   }
	}