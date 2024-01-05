package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_class {
	
  @AfterTest
  public void f() {
	  System.out.println("Working on TestNG");//7
  }
  @Test
  public void f1() {
	  System.out.println("Testing testng");//4
  }
  @BeforeTest
  public void f2() {
	  System.out.println("Welcome to TestNG");//1
  }
  @BeforeMethod
  public void Before() {
	  System.out.println("Before  method TestNG");//3
  }
  @AfterMethod
  public void After() {
	  System.out.println("After  method TestNG");//5
  
  }
  
  @AfterClass
  public void AfterClas() {
	  System.out.println("After  class TestNG");//6
  
  }
  
  @BeforeClass
  public void BeforeClas() {
	  System.out.println("After  class TestNG");//2
  
  }
  
}
