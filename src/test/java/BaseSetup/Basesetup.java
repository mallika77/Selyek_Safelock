package BaseSetup;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebElements.SafeLock_Login_Web;

public class Basesetup {

	
	public static WebDriver driver;
	public static Properties prop;
    SafeLock_Login_Web lockpage;
    // Initialize lockpage here

	
static 
{
	try
	{
	System.setProperty( "webdriver.chrome.driver","C:\\Users\\mallika\\eclipse-workspace\\Safelock\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	File f=new File("C:\\Users\\mallika\\eclipse-workspace\\Safelock\\inputproperties");
	FileInputStream fis=new FileInputStream(f);
	prop=new Properties();
	prop.load(fis);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
	
@BeforeTest
public void VERIFY_THAT_SAFELOCK_CUSTOMER_URL_LAUNCHED_SUCCESSFULLY() throws IOException, InterruptedException {
	lockpage = new SafeLock_Login_Web(driver); 
    String urlname = prop.getProperty("url");
    driver.get(urlname);
    System.out.println("Current URL:" + urlname);
    System.out.println("SelYek Customer portal launched successfully");
    driver.manage().window().maximize();	
    Thread.sleep(2000);  

   String Email = prop.getProperty("Email");
    lockpage.Email.sendKeys(Email);

   String Password = prop.getProperty("Password");
    lockpage.Password.sendKeys(Password);  // Corrected field

   lockpage.LoginUsingPassword.click();
	Thread.sleep(3000);  
}


// Common click function
public void clickElement(WebElement clickfunction ) {
	
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait up to 10 seconds
    wait.until(ExpectedConditions.elementToBeClickable(clickfunction)); // Wait until the element is clickable
    clickfunction.click();
}



}
