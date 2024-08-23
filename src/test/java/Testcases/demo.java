package test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class demo {
  @Test
  public void f() {
	  System.out.println("hi");
	  System.out.println("hi");
	  System.out.println("hi");
	  
  }
  @AfterMethod
  public void afterMethod() {
  } @AfterMethod
  public void afterMethod1() {
  }
  @AfterMethod
  public void afterMethod2() {
  }

  @BeforeClass
  public void beforeClass() {
  }

}
