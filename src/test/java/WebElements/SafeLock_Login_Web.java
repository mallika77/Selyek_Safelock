package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafeLock_Login_Web {

	public WebDriver driver;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input']")
	public WebElement Email;

	@FindBy(xpath = "//input[@class='m_f2d85dd2 mantine-PasswordInput-innerInput']")
	public WebElement Password;

	@FindBy(xpath = "//span[@class='m_811560b9 mantine-Button-label'][1]")
	public WebElement LoginUsingPassword;

	// declare the webdriver driver
	
	
	  // Constructor that initializes the web elements
    public SafeLock_Login_Web(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
