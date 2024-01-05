package polymorphism;

public class Overloading {
	
	public  void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
 public static void main(String args[]) {
	 
	 Overloading Calculations = new Overloading();
	 
	 Calculations.add(4, 6);
	 Calculations.add(4.1, 5.9);
	 Calculations.add(4, 6, 10);
	 
}
}
