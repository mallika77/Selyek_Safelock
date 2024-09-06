package BaseSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import WebElements.SafeLock_Login_Web;

public class Basesetup {

	public static WebDriver driver;
	SafeLock_Login_Web loginpage;

	@BeforeTest
	public void VERIFY_THAT_SAFELOCK_CUSTOMER_URL_LAUNCHED_SUCCESSFULLY() throws Exception {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mallika\\eclipse-workspace\\Safelock\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			loginpage = new SafeLock_Login_Web(driver);

		} catch (Exception e) {
			System.out.println(e);
		}

		String urlname = readExcel("url");
		driver.get(urlname);
		driver.manage().window().maximize();
		System.out.println("Current URL:" + urlname);
		System.out.println("SelYek Customer portal launched successfully");

		String Email = readExcel("Email");
		loginpage.Email.sendKeys(Email);

		String Password = readExcel("Password");
		loginpage.Password.sendKeys(Password);

		loginpage.LoginUsingPassword.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("https://s4rapp-test.sternaemlock.com/dashboard")); // Ensure URL
																										// contains
																										// expected
																										// value
	}

	public String readExcel(String expkey) throws IOException {
		String excelPath = "C:\\Users\\mallika\\eclipse-workspace\\Worksbook\\safelock1.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		HashMap<String, String> map = new HashMap<>();

		// Use DataFormatter to format the cell value as it appears in Excel
		DataFormatter formatter = new DataFormatter();
		for (Row row : sheet) {
			Cell headerColumn = row.getCell(0);
			Cell inputColumn = row.getCell(1);
			if (headerColumn != null && inputColumn != null) {

				String headerValue = headerColumn.getStringCellValue();

				String inputValue;

				switch (inputColumn.getCellType()) {
				case STRING:
					inputValue = formatter.formatCellValue(inputColumn);
					break;
				case NUMERIC:
					// Format the numeric value to string
					inputValue = formatter.formatCellValue(inputColumn);
					break;
				default:
					inputValue = "";
					break;
				}
				map.put(headerValue, inputValue);

			}
		}
		workbook.close();
		fis.close();
		return map.get(expkey);
	}

	public void clickElement(WebElement clickfunction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(clickfunction)).click();
	}
	
	
}