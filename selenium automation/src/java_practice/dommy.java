package java_practice;

public class dommy  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//Java Program to Illustrate Do-while Loop

//Class

		// Declaring and initializing integer values
		int x = 21, sum = 0;

		// Do-while loop
		do {

			// Execution statements(Body of loop)

			// Here, the line will be printed even
			// if the condition is false
			sum += x;
			x--;
			System.out.println("sum "+sum);
			System.out.println("x value "+x);
		}

		// Now checking condition
		while (x > 10);

		// Summing up
		System.out.println("Summation: " + sum);
	}
}
