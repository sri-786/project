package polymorphism;

//Overriding main class to create objects and call the methods  
public class Overriding_main {
	public static void main(String args[]) {
		
	Overriding_sbi s=new Overriding_sbi();
	Overriding_icici i=new Overriding_icici();
	Overriding_axis a=new Overriding_axis();
	
	
	
	System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
	System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
	System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
	
	}
}