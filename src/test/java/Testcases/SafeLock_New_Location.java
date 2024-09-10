package Testcases;

import org.testng.annotations.Test;
import BaseSetup.Basesetup;
import WebElements.SafeLock_Add_New_Location;
import java.io.IOException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class SafeLock_New_Location extends Basesetup {

	public static WebDriver driver;
	Basesetup setup = new Basesetup();
	SafeLock_Add_New_Location NewLocation;

	@BeforeClass
	public void beforeClass() {
		this.driver = setup.driver;
		NewLocation = new SafeLock_Add_New_Location(driver); // Initialize lockpage here

	}

	@Test(priority = 2, enabled = true)
	public void VERIFY_USER_NAVIGATED_INTO_LOCATION_PAGE() throws IOException, InterruptedException {
		clickElement(NewLocation.Location);
		System.out.println("SafeLock Location page Test Page");
	}

	@Test(priority = 3, enabled = true)
	public void VERIFY_THAT_ADD_LOCATION_PAGE_IS_NAVIGATED_BY_CLICKING_ON_PLUS_ICON()
			throws IOException, InterruptedException {
		clickElement(NewLocation.Plusicon);
		System.out.println("SafeLock New Location Page Appeared Successfully");
	}

	@Test(priority = 4, enabled = true)
	public void VERIFY_THAT_ABLE_TO_SELECT_THE_COUNTRY_ON_THE_ADD_LOCATION_POPUP()
			throws IOException, InterruptedException {
		clickElement(NewLocation.Country);
		clickElement(NewLocation.Countryvalues);
		System.out.println("Country India selected Successfully");
	}

	@Test(priority = 5, enabled = true)
	public void VERIFY_THAT_ABLE_TO_ENTER_THE_LOCATION_NAME_ALONG_WITH_STATE_NAME()
			throws IOException, InterruptedException {
		String LocationName = readExcel("LocationName");
		NewLocation.LocationName.sendKeys(LocationName);
		System.out.println("LocationName entered Successfully"+LocationName);
	}

	@Test(priority = 6, enabled = true)
	public void VERIFY_THAT_NEW_LOCATION_ADDED_SUCCESSFULLY_BY_CLICK_ON_SUBMIT()
			throws IOException, InterruptedException {
		clickElement(NewLocation.SubmitButton);
		System.out.println("Location Added Successfully");
		clickElement(NewLocation.toastmessage);
		System.out.println("toast closed success");
		
	}

	@Test(priority = 7, enabled = true)

	public void VERIFY_THAT_CREATED_LOCATION_DISPLAYED_IN_LOCATION_GRID_SECTION()
			throws IOException, InterruptedException {
		Actions Search = new Actions(driver);
		Search.sendKeys(Keys.TAB).perform();
		System.out.println("tab success");
		String search = readExcel("LocationName");
		NewLocation.Search.sendKeys(search);
		Thread.sleep(5000);
		clickElement(NewLocation.Locationclick);
		System.out.println("clicked");

		/*
		 * if (search != null && !search.isEmpty()) {
		 * NewLocation.Search.sendKeys(search);
		 * System.out.println("Search term entered: " + search);
		 * 
		 * } else { System.out.println("Search term is null or empty"); // Handle the
		 * error case, e.g., by logging or throwing an exception }
		 */

	}

	@Test(priority = 8, enabled = true)

	public void VERIFY_THAT_LOCK_MAPPING_POPOUP_APPEARED_BY_CLICK_ON_LOCK_MAPPING_BUTTON()
			throws IOException, InterruptedException {
		Thread.sleep(5000);
		clickElement(NewLocation.LockMapbutton);
		System.out.println("Lock mapping button clicked Successfully");

	}

	@Test(priority = 9, enabled = true)

	public void VERIFY_THAT_USER_IS_ENTER_THE_LOCK_NAME_SUCCESSFULLY() throws IOException, InterruptedException {
		String EnterLockName = readExcel("EnterLockName");
		NewLocation.EnterLockName.sendKeys(EnterLockName);
		System.out.println("Lock Name Entered Successfully");

	}

	@Test(priority = 10, enabled = true)
	public void VERIFY_THAT_USER_IS_ABLE_TO_SELECT_THE_LOCK_ID_FROM_THE_DROP_DOWN_SUCCESSFULLY()
			throws IOException, InterruptedException {

		Actions lockid = new Actions(driver);
		lockid.sendKeys(Keys.TAB).perform();
		String EnterLockid = readExcel("EnterLockid");
		NewLocation.EnterLockid.sendKeys(EnterLockid);
		lockid.sendKeys(Keys.ARROW_DOWN).build().perform();
		lockid.sendKeys(Keys.ENTER).build().perform();

		System.out.println("lockid selected Successfully");
		 

	}

	@Test(priority = 11, enabled = true)
	public void VERIFY_THAT_LOCK_MAPPED_WITH_SELECTED_LOCATION_BY_CLICK_ON_SUBMIT()
			throws IOException, InterruptedException {
		Actions submit = new Actions(driver);
		submit.sendKeys(Keys.TAB).perform();
		Thread.sleep(4000);
		clickElement(NewLocation.Submitbutton);
		System.out.println("Lock added successfully");

	}

	@AfterMethod
	public void afterMethod() {
		// Add any cleanup code here if needed
	}
}
