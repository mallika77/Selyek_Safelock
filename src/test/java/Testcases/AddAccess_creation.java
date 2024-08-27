package Testcases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseSetup.Basesetup;
import WebElements.AddAccess_Web;

public class AddAccess_creation extends Basesetup {
	
	 public static WebDriver driver;
	    public static Properties prop;
	    AddAccess_Web Newaccess;
Basesetup setup = new Basesetup();

	
	@BeforeClass
	  public void beforeClass() {
		  this.driver = setup.driver;
	        this.prop = setup.prop;
	        Newaccess= new  AddAccess_Web(driver);

	}
	        
	    @Test(priority =1, enabled =true)
	    public void VERIFY_THAT_USER_IA_NAVIGATED_INTO_ACCESS_CREATION_PAGE_WHEN_CLICK_ON_ADD_ACCESS_BUTTON()throws IOException, InterruptedException
	    {
	        	clickElement(Newaccess.Addaccess);
	        	System.out.println("Add Access Link clicked successfully");
	        	
	        }
	        	        
	
	
	
}
