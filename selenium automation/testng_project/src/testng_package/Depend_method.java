package testng_package;

import org.testng.annotations.Test;



public class Depend_method {
  @Test
  public void f() {
	  System.out.println("Hi Srikanth");
	  }
  
  @Test(dependsOnMethods = "f")
  public void f2() {
	  System.out.println("Welcome to TestNG");
	  
  }
  @Test
  public void f3() {
	 System.out.println("This is an test method"); 
  }
}
