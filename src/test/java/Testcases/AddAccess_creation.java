package Testcases;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseSetup.Basesetup;
import WebElements.AddAccess_Web;

public class AddAccess_creation extends Basesetup {

	public static WebDriver driver;
	AddAccess_Web Newaccess;
	Basesetup setup = new Basesetup();

	@BeforeClass
	public void beforeClass() {
		this.driver = setup.driver;
		Newaccess = new AddAccess_Web(driver);

	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Test(priority = 1, enabled = true)
	public void VERIFY_THAT_ADDACCESS_LINK_IS_CLICKED_BY_THE_USER_AND_NAVIAGTED_INTO_ACCESS_PAGE()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Addaccess);
		System.out.println("Add Access Link clicked successfully");

	}

	@Test(priority = 2, enabled = true)
	public void VERIFY_THAT_USER_IA_NAVIGATED_INTO_ACCESS_CREATION_PAGE_WHEN_CLICK_ON_ADD_ACCESS_BUTTON()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.addaccessbutton);
		System.out.println("Add Access button clicked successfully");

	}

	@Test(priority = 3, enabled = true)
	public void VERIFY_THAT_USER_ENTERING_THE_ACCESS_NAME_ON_ACCESS_FIELD() throws IOException, InterruptedException {

		String Accessname = readExcel("Accessname");
		Newaccess.Accessname.sendKeys(Accessname);
		clickElement(Newaccess.Accessname);
		System.out.println("Access Name entered successfully");

	}

	@Test(priority = 4, enabled = true)
	public void VERIFY_THAT_USER_IS_SELECT_THE_LOCATION_FROM_THE_DROPDOWN() throws IOException, InterruptedException {
		clickElement(Newaccess.Accessname);
		String Locationname = readExcel("Locationname");
		Newaccess.Locationname.sendKeys(Locationname);
		Thread.sleep(2000);
		Actions location = new Actions(driver);
		location.sendKeys(Keys.ARROW_DOWN).build().perform();
		location.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Location Name entered successfully");

	}

	@Test(priority = 5, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_SELECT_THE_NEXT_STEp_BUTTON_ON_ADD_ACCESS_PAGE()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Nextstepbutton);
		System.out.println("Naxt button clicked successfully");

	}
	


	@Test(priority = 6, enabled = true)
	public void VERIFY_THAT_USER_IS_SELECT_THE_LOCK_ID_FROM_THE_LOCKS_DROP_DOWN()
			throws IOException, InterruptedException {
		//format the lockname and lockid
		String lockName = readExcel("EnterLockName");
	    String lockId = readExcel("EnterLockid");    
	    String formattedLockNameandid = lockName + " - " + lockId;
		Thread.sleep(2000);
		clickElement(Newaccess.Locksdropdown);
		System.out.println("Locksdropdown clicked successfully");
		Thread.sleep(2000);
		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		for (WebElement Option : Options) {
	        if (Option.getText().trim().equals(formattedLockNameandid.trim())) {
				Option.click();
				System.out.println("desiredLockid selected Successfully");
				
				break; // Exit the loop once the desired option is found and clicked

			}

		}
	}

	@Test(priority = 7, enabled = true)
	public void VERIFY_THAT_USER_IS_SELECT_THE_USER_NAME_FROM_THE_USERS_DROP_DOWN()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Usersdrop);
		System.out.println("Users selected successfully");
		List<WebElement> Options = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredusername = "Mallikapk - mallikapkk@gamil.com";
		for (WebElement Option : Options) {
			if (Option.getText().contains(desiredusername)) {
				Option.click();
				System.out.println("desiredUser selected Successfully");
				break; // Exit the loop once the desired option is found and clicked
			}
		}
		clickElement(Newaccess.outclick);
	}

	@Test(priority = 8, enabled = true)

	public void VERIFY_THAT_SEND_OTP_TO_USER_EMAIL_PHONE_OPTION_SELECTED_SUCCESSFULLY()
			throws IOException, InterruptedException {
		clickElement(Newaccess.otpcheckbox);
		System.out.println("otp selected successfully");

	}

	@Test(priority = 9, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_SELECT_THE_NEXT_STEP_BUTTON_ON_ADD_ACCESS_PAGE()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.NextStepbutton);
		System.out.println("NextStepbutton selected successfully");
	}

	@Test(priority = 10, enabled = true)
	public void VERIFY_THAT_FROM_DATE_IS_SELECTED_FROM_THE_CURRENT_DATE_OF_SELECTION()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.FromDateSelection);
		Thread.sleep(3000);
		LocalDate today = LocalDate.now();
		// Extract the day component
		String day = String.valueOf(today.getDayOfMonth());
		List<WebElement> alldates = driver
				.findElements(By.xpath("//td[@class='m_8f457cd5 mantine-DatePickerInput-monthCell']"));
		for (WebElement dateElement : alldates) {
			if (dateElement.getText().equals(day)) {
				dateElement.click();
				System.out.println("Desired from date selected successfully");
				break;
			}
		}
	}

	@Test(priority = 11, enabled = true)
	public void VERIFY_THAT_FROM_TIME_IS_SELECTED_SUCCESSFULLY() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Fromtime);
		Actions Fromtime = new Actions(driver);
		Fromtime.sendKeys(Keys.ARROW_DOWN).build().perform();
		Fromtime.sendKeys(Keys.ENTER).build().perform();
		System.out.println("From time entered successfully");
	}

	@Test(priority = 12, enabled = true)
	public void VERIFY_THAT_TO_DATE_IS_SELECTED_AS_ONE_YEAR_FROM_THE_CURRENT_DATE()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.ToDateSelection);
		LocalDate oneYearLater = LocalDate.now().plusYears(1);

		String day = String.valueOf(oneYearLater.getDayOfMonth());
		DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMM");
		String month = oneYearLater.format(monthFormatter);
		String year = String.valueOf(oneYearLater.getYear());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		String formattedDate = oneYearLater.format(formatter);
		System.out.println("One year later: " + formattedDate);

		// Wait and click on the calendar title to open the year and month selectors
		Thread.sleep(2000);
		clickElement(Newaccess.calendartitleclick);
		System.out.println("Calendar title clicked successfully");
		Thread.sleep(2000);
		clickElement(Newaccess.Yearclick);
		System.out.println("Year clicked successfully");

		// Select the desired year
		List<WebElement> yearSelection = driver
				.findElements(By.xpath("//td[@class='m_c5a19c7d mantine-DatePickerInput-yearsListCell']"));
		for (WebElement desiredYear : yearSelection) {
			if (desiredYear.getText().equals(year)) {
				desiredYear.click();
				System.out.println("Desired year selected successfully: " + year);
				break;
			}
		}

		// Select the desired month
		List<WebElement> monthSelection = driver
				.findElements(By.xpath("//td[@class='m_fe27622f mantine-DatePickerInput-monthsListCell']"));
		for (WebElement desiredMonth : monthSelection) {
			if (desiredMonth.getText().equals(month)) {
				desiredMonth.click();
				System.out.println("Desired month selected successfully: " + month);
				break;
			}
		}

		// Wait and select the desired day
		Thread.sleep(2000);
		List<WebElement> allDates = driver
				.findElements(By.xpath("//td[@class='m_8f457cd5 mantine-DatePickerInput-monthCell']"));
		for (WebElement dateElement : allDates) {
			if (dateElement.getText().equals(day)) {
				dateElement.click();
				System.out.println("Desired date selected successfully: " + day);
				break;
			}
		}
	}

	@Test(priority = 13, enabled = true)
	public void VERIFY_THAT_TO_TIME_IS_SELECTED_SUCCESSFULLY() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Totime);
		Thread.sleep(2000);

		List<WebElement> times = driver.findElements(By.xpath("//div[@role='option']"));
		String desiredtime = "11:30 PM";
		for (WebElement Option : times) {
			if (Option.getText().equals(desiredtime)) {
				Option.click();
				System.out.println("desiredtime selected Successfully");
				break; // Exit the loop once the desired option is found and clicked
			}
		}

	}

	@Test(priority = 14, enabled = true)
	public void VERIFY_THAT_EVERY_DATE_CHECK_BOX_IS_SELECTED_SUCCESSFULLY() throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.EveryDaycheckbox);

	}

	@Test(priority = 15, enabled = true)
	public void VERIFY_THAT_SELECTED_DATA_IS_DISPLAYED_ON_NEXT_PAGE_BY_CLICKING_ON_NEXT_STEP_BUTTON()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Nextbuttontwo);

	}

	@Test(priority = 15, enabled = true)
	public void VERIFY_THAT_NEW_ACCESS_IS_CREATED_BY_CLICKING_ON_SUBMIT_BUTTON()
			throws IOException, InterruptedException {
		Thread.sleep(2000);
		clickElement(Newaccess.Submitbutton);
		System.out.println("New Access Created Successfully");

	}

}
