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
  }

  @BeforeClass
  public void beforeClass() {
  }

}
