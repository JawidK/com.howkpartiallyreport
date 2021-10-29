package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceeTwo {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("It is befoe test case");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("It is after test case");
	}
	
  @Test
  public void testCaseOne() {
	  System.out.println("It is before test case");
	 
  }

  @Test
  public void testCaseTwo() {
	  System.out.println("It is after test case");
	 
  }
  @Test
  public void testCaseThree() {
	  System.out.println("Print by Green Sign");
	 
  }
  @Test
  public void testCaseFour() {
	  System.out.println("Print by Green sign");
	 
  }
  @Test
  public void testCaseFive() {
	  System.out.println("Print by Blue sign");
  }
  @Test
  public void parametrizedMethod(String a, String b, String c, String d) {
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(c);
	  System.out.println(d);
	  
  }
}
