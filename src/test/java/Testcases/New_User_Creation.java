package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseSetup.Basesetup;
import WebElements.SafeLock_New_User;

public class New_User_Creation extends Basesetup {

    SafeLock_New_User NewUser;

    @BeforeClass
    public void beforeClass() {
    	 NewUser = new SafeLock_New_User(driver);
    }

    @Test(priority = 1)
    public void VERIFY_THAT_USER_MENU_IS_CLICKED_SUCCESSFULLY() throws InterruptedException {
        clickElement(NewUser.UserMenu);
        System.out.println("User Menu clicked Successfully");
    }

    @Test(priority = 2)
    public void VERIFY_THAT_USER_IS_NAVIGATED_INTO_ADD_USER_SECTION_WHEN_CLICK_ON_ADD_USER_BUTTON() {
        clickElement(NewUser.Adduser);
        System.out.println("Add user button clicked Successfully");
    }

    @Test(priority = 3)
    public void VERIFY_THAT_USER_ENTER_THE_USERNAME_IN_USERNAME_FIELD() throws Exception {
        clickElement(NewUser.Username);
        String Username = readExcel("Username");
        NewUser.Username.sendKeys(Username);

        System.out.println("UserName Entered Successfully");
    }


	@Test(priority = 4, enabled = true)
	public void VERIFY_THAT_USER_ABLE_TO_ENTER_MAILID_SUCCESSFULLY() throws Exception {
		clickElement(NewUser.Mailid);
		String Mailid = readExcel("Mailid");
		NewUser.Mailid.sendKeys(Mailid);
		System.out.println("Mailid Entered Successfully");
	}

	@Test(priority = 5, enabled = true)
	public void VERIFY_THAT_USER_ABLE_TO_SELECT_THE_INDIA_Dial_CODE() throws IOException, InterruptedException {
		clickElement(NewUser.Dialcode);
		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredCountryCode = "India";
		for (WebElement Option : Options) {
			if (Option.getText().contains(desiredCountryCode)) {
				Option.click();
				System.out.println("Dialcode selected Successfully");
				break; // Exit the loop once the desired option is found and clicked

			}
		}
	}

	@Test(priority = 6, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_ENTER_THE_10_DIGIT_MOBILE_NUMBER_ON_MOBILE_NUMBER_FIELD()
			throws Exception {
		clickElement(NewUser.MobileNumber);
		String MobileNumber = readExcel("MobileNumber");
		NewUser.MobileNumber.sendKeys(MobileNumber);
		System.out.println("MobileNumber Entered Successfully");
	}

	@Test(priority = 7, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_SELECT_THE_ACCESS_ROLE() throws IOException, InterruptedException {
		clickElement(NewUser.Roleselection);
		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredrole = "Mobile";
		for (WebElement Option : Options) {
			if (Option.getText().contains(desiredrole)) {
				Option.click();
				System.out.println("Role selected Successfully");
				break; // Exit the loop once the desired option is found and clicked

			}
		}
	}

	@Test(priority = 8, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_SELECT_THE_LOCATION_LEVEL_AS_COUNTRY_IN_LEVEL_DROPDOWN()
			throws IOException, InterruptedException {
		clickElement(NewUser.LocationLevel);
		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredCountry = "Country";
		for (WebElement Option : Options) {
			if (Option.getText().contains(desiredCountry)) {
				Option.click();
				System.out.println("LocationLevel selected Successfully");
				break; // Exit the loop once the desired option is found and clicked

			}
		}

	}

	@Test(priority = 9, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_SELECT_THE_LOCATION_IN_LOCATION_FIELD()
			throws IOException, InterruptedException {
		clickElement(NewUser.LocationName);
		Thread.sleep(1000);

		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredCountry = "India";
		for (WebElement Option : Options) {
			if (Option.getText().contains(desiredCountry)) {
				Option.click();
				System.out.println("india selected Successfully");
				break; // Exit the loop once the desired option is found and clicked

			}
		}
	}

	@Test(priority = 10, enabled = true)

	public void VERIFY_THAT_DEFAULT_PASSWORD_DISPLAYED_AS_ENCRYPED_FORMAT_IN_PASSWORD_FIELD()
			throws Exception {
		clickElement(NewUser.Password);
		Thread.sleep(1000);
		String Password = readExcel("Password");
		NewUser.Password.sendKeys(Password);
		System.out.println("Password is enetered by encrypted format Successfully");
		clickElement(NewUser.Eyeicon1);
		System.out.println("Password is visble by clicking the Eyeicon");
	}

	@Test(priority = 11, enabled = true)

	public void VERIFY_THAT_CONFIRM_PASSWORD_IS_FILLED_WITH_DEFAULT_PASSWORD()
			throws Exception {
		clickElement(NewUser.Confirmpassword);
		Thread.sleep(1000);
		String Confirmpassword =readExcel("Confirmpassword");
		NewUser.Confirmpassword.sendKeys(Confirmpassword);
		System.out.println("Confirmpassword is enetered Successfully");
		clickElement(NewUser.Eyeicon2);
		System.out.println("Password is visble by clicking the Eyeicon2");
	}

	 @Test(priority = 12)
	    public void VERIFY_THAT_NEW_USER_IS_CREATED_SUCCESSFULLY_BY_CLICKING_THE_SUBMIT_BUTTON() throws IOException, InterruptedException {
	        clickElement(NewUser.SubmitButton);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	        WebElement Successmessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'mantine-Notification-description')]")));
	        String actualsuccessmessage = Successmessage.getText();
	        String expectedmessage = "User created successfully";
	        assertTrue(actualsuccessmessage.contains(expectedmessage), "Popup message does not contain the expected text.");
	        System.out.println(actualsuccessmessage);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
