package WebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafeLock_New_User {

	public WebDriver driver;

	@FindBy(xpath = "//a[@href='/user']")
	public WebElement UserMenu;

	@FindBy(xpath = "(//button[@class='mantine-focus-auto mantine-active m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root'])[1]")
	public WebElement Adduser;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input'])[1]")
	public WebElement Username;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input'])[2]")
	public WebElement Mailid;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input'])[1]")
	public WebElement Dialcode;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input'])[3]")
	public WebElement MobileNumber;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input'])[2]")
	public WebElement Roleselection;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input'])[3]")
	public WebElement LocationLevel;

	@FindBy(xpath = "(//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input'])[4]")
	public WebElement LocationName;

	@FindBy(xpath = "(//input[@class='m_f2d85dd2 mantine-PasswordInput-innerInput'])[1]")
	public WebElement Password;

	@FindBy(xpath = "(//button[@class='mantine-focus-auto mantine-active m_b1072d44 mantine-PasswordInput-visibilityToggle m_8d3f4000 mantine-ActionIcon-root m_87cf2631 mantine-UnstyledButton-root'])[1]")
	public WebElement Eyeicon1;

	@FindBy(xpath = "(//input[@class='m_f2d85dd2 mantine-PasswordInput-innerInput'])[2]")
	public WebElement Confirmpassword;

	@FindBy(xpath = "(//button[@class='mantine-focus-auto mantine-active m_b1072d44 mantine-PasswordInput-visibilityToggle m_8d3f4000 mantine-ActionIcon-root m_87cf2631 mantine-UnstyledButton-root'])[2]")
	public WebElement Eyeicon2;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-full m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement SubmitButton;

	@FindBy(xpath = "(//div[@class='m_3feedf16 mantine-Notification-title']")
	public WebElement Successmessage;

	// declare the webdriver driver
	public SafeLock_New_User(WebDriver driver) {
		// it will pass the driver value as global (this)
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
