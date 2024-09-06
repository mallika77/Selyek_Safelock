package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafeLock_Add_New_Location {

	public WebDriver driver;

	@FindBy(xpath = "//a[@href='/location']")
	public WebElement Location;

	@FindBy(xpath = "//span[@class='m_8d3afb97 mantine-ActionIcon-icon']")
	public WebElement Plusicon;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input']")
	public WebElement Country;

	@FindBy(xpath = "//div[@class='m_92253aa5 mantine-Select-option m_390b5f4']")
	public WebElement Countryvalues;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input']")
	public WebElement LocationName;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-full m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement SubmitButton;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active m_220c80f2 m_919a4d88 mantine-Notification-closeButton m_86a44da5 mantine-CloseButton-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement toastmessage;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active m_220c80f2 m_606cb269 mantine-Modal-close m_86a44da5 mantine-CloseButton-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement closeicon;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input']")
	public WebElement Search;

	@FindBy(xpath = "//div[@class='flex flex-col']")
	public WebElement Locationclick;

	@FindBy(xpath = "//span[@class='m_80f1301b mantine-Button-inner']")
	public WebElement LockMapbutton;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input']")
	public WebElement EnterLockName;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input']")
	public WebElement EnterLockid;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-full mt-8 m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement Submitbutton;

	// declare the webdriver driver
	public SafeLock_Add_New_Location(WebDriver driver) {
		// it will pass the driver value as global (this)
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
