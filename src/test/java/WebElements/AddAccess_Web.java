package WebElements;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import BaseSetup.Basesetup;

public class AddAccess_Web extends Basesetup {

	@FindBy(xpath="//a[@href='/access']")
	public WebElement Addaccess;
	
	
	
	
	
	
	
	
	
	public AddAccess_Web( WebDriver  driver)
	{
		//it will pass the driver value as global (this)
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
}
