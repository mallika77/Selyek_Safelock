package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stock_Lock_pages {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//a[@href='/settings']")
    public WebElement settings;	
	
	@FindBy(xpath="//a[@href='/settings/stocks']")
    public WebElement stocks;	

	@FindBy(xpath="//button[@class='mantine-focus-auto mantine-active m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']")
    public WebElement addstock;		
	
	@FindBy(xpath="(//div[@class='m-92253aa5 mantine-MultiSelect-option m-390b5f4'])[1]")
	public WebElement firstOption;
	
	@FindBy(xpath="(//div[@class='m-92253aa5 mantine-MultiSelect-option m-390b5f4'])[1]")
	public WebElement SecondOption;
	
	
	@FindBy(xpath=("//div[@class='m-3d733a3a mantine-Notification-description']"))
	public WebElement successmesg;	
	
	@FindBy(xpath=("//button[@class='mantine-focus-auto mantine-active w-full m-77c9d27d mantine-Button-root m-87cf2631 mantine-UnstyledButton-root']"))
	public WebElement Submit;
	
	
	
	//declare the webdriver driver
	public Stock_Lock_pages( WebDriver  driver)
	{
		//it will pass the driver value as global (this)
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
}

