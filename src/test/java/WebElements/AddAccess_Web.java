package WebElements;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import BaseSetup.Basesetup;

public class AddAccess_Web extends Basesetup {

	@FindBy(xpath = "//a[@href='/access']")
	public WebElement Addaccess;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement addaccessbutton;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-TextInput-input']")
	public WebElement Accessname;

	@FindBy(xpath = "//input[@class='m_8fb7ebe7 mantine-Input-input mantine-Select-input']")
	public WebElement Locationname;

	@FindBy(xpath = "//button[@class='mantine-focus-auto mantine-active w-full max-w-[130px] m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root']")
	public WebElement Nextstepbutton;

	@FindBy(xpath = "(//input[@class='mantine-MultiSelect-inputField m_45c4369d mantine-PillsInputField-field'])[1]")
	public WebElement Locksdropdown;

	@FindBy(xpath = "(//input[@class='mantine-MultiSelect-inputField m_45c4369d mantine-PillsInputField-field'])[2]")
	public WebElement Usersdrop;

	@FindBy(xpath = "//div[@class='m_46b77525 mantine-InputWrapper-root mantine-MultiSelect-root']")
	public WebElement outclick;

	@FindBy(xpath = "(//input[@class='mantine-focus-auto m_8a3dbb89 mantine-Radio-radio'])[8]")
	public WebElement otpcheckbox;

	@FindBy(xpath = "(//button[@class='mantine-focus-auto mantine-active w-full max-w-[130px] m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root'])[2]")
	public WebElement NextStepbutton;

	@FindBy(xpath = "(//div[@class='m_6c018570 mantine-Input-wrapper mantine-DatePickerInput-wrapper'])[1]")	
	public WebElement FromDateSelection;

	@FindBy(xpath = "(//div[@class='m_6c018570 mantine-Input-wrapper mantine-Select-wrapper'])[1]")
	public WebElement Fromtime;

	@FindBy(xpath = "(//div[@class='m_6c018570 mantine-Input-wrapper mantine-DatePickerInput-wrapper'])[2]")
	public WebElement ToDateSelection;

	@FindBy(xpath = "//button[@class=\"mantine-focus-auto m_f6645d97 mantine-DatePickerInput-calendarHeaderLevel m_87cf2631 mantine-UnstyledButton-root\"]")
	public WebElement calendartitleclick;

	@FindBy(xpath = "//button[@class=\"mantine-focus-auto m_f6645d97 mantine-DatePickerInput-calendarHeaderLevel m_87cf2631 mantine-UnstyledButton-root\"]")
	public WebElement Yearclick;

	@FindBy(xpath = "(//div[@class='m_6c018570 mantine-Input-wrapper mantine-Select-wrapper'])[2]")
	public WebElement Totime;

	@FindBy(xpath = "(//input[@class='mantine-focus-auto m_26063560 mantine-Checkbox-input'])[9]")
	public WebElement EveryDaycheckbox;

	@FindBy(xpath = "(//button[@class='mantine-focus-auto mantine-active w-full max-w-[130px] m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root'])[2]")
	public WebElement Nextbuttontwo;

	@FindBy(xpath = "(//button[@class='mantine-focus-auto mantine-active w-full max-w-[130px] m_77c9d27d mantine-Button-root m_87cf2631 mantine-UnstyledButton-root'])[2]")
	public WebElement Submitbutton;

	public AddAccess_Web(WebDriver driver) {
		// it will pass the driver value as global (this)
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
