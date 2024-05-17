package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import page.Stock_Lock_pages;
import utilities.Basesetup;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class Stock_Lock_cases {
	
	public static WebDriver driver;
	public static Properties prop;
	Basesetup setup = new Basesetup();


	 @BeforeClass
	  public void beforeClass() {
		  this.driver = setup.driver;
				  this.prop = setup.prop;
	  

	}
    
  @Test(priority = 1,enabled= true)
  public void addlock() throws IOException, InterruptedException   {
	  
	 
	  if(driver == null) {
		  System.out.println("WebDriver is not initialized. Please check setup.");
		  return; // Exit the test method if driver is null
	  }
	    	  
	  String urlname = prop.getProperty("url");
	  driver.get(urlname);
	  System.out.println("Current URL:"+urlname);
	  driver.manage().window().maximize();
	  //take screen shot
	  File screen = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\1url.png"));

	  Stock_Lock_pages stockpage = new Stock_Lock_pages(driver);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 
	  stockpage.settings.click();
	  Thread.sleep(2000);
	  File screen1 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen1, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\2settings.png"));

	  stockpage.stocks.click();
	  Thread.sleep(2000);
	  File screen2 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen2, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\3stocks.png"));
      
	  stockpage.addstock.click();
	  File screen3 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen3, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\4addstock.png"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
	  //Zone selection
	  
	  Actions zone = new Actions(driver);
		zone.sendKeys(Keys.TAB).perform();
	  List<WebElement> zonevalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[37]"));
		
		for(WebElement singlevalue : zonevalue)
		{
			String zonename = singlevalue.getText();
			if(zonename.contains("ZoneOCT"))
			{
				String Expectedname = "ZoneOCT";
				if(Expectedname.equals(zonename))
					System.out.println("Zone Matched and Selected Successfully "
							+ " Zone name is:"+zonename);			
				singlevalue.click();
			}
		
		}	
		File screen4 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen4, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\5zone.png"));
		
		
		//TERMINAL SELECTION
		//action key  used to click the zone field
		Actions Terminal = new Actions(driver);
		Terminal.sendKeys(Keys.TAB).perform();	
		//selected the specific value from the drop down
		List<WebElement> terminalvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[71]"));
		
		for(WebElement singlevalue1 : terminalvalue)
		{
			String terminalname = singlevalue1.getText();
			if(terminalname.contains("OCTTT"))
			{
				String Expectedname = "OCTTT";
				if(Expectedname.equals(terminalname))
					System.out.println("Terminal Matched and Selected Successfully "
							+ " Terminal name is:"+terminalname);			
				singlevalue1.click();
			}
		
		}
		File screen5 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen5, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\6terminal.png"));
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ASSET TYPE SELECTION
			//action key  used to click the zone field
			Actions assettype = new Actions(driver);
			assettype.sendKeys(Keys.TAB).perform();	
			//selected the specific value from the drop down
			List<WebElement> assetvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[74]"));
			
			for(WebElement singlevalue : assetvalue)
			{
				String assetname = singlevalue.getText();
				if(assetname.contains("Lock"))
				{
					String Expectedname = "Lock";
					if(Expectedname.equals(assetname))
						System.out.println("Assetname Matched and Selected Successfully "
								+ " Asset name is:"+assetname);			
					singlevalue.click();
				}
			
			}
			File screen6 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screen6, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\7asserts.png"));
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			//ASSETS TYPE SELECTION
			//action key  used to click the zone field
			Actions assets = new Actions(driver);
			assets.sendKeys(Keys.TAB).perform();	
			//lock assert selection
			
			 stockpage.firstOption.click();
			 stockpage.SecondOption.click();
				System.out.println("Lock Selected and Matched Successfully");

				File screen7 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
			      FileUtils.copyFile(screen7, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\8assertselect.png"));
			
			       //submit button
			       assets.sendKeys(Keys.TAB)
			       .sendKeys(Keys.ENTER).perform();
			 	  Thread.sleep(2000);
			 	  File screen8 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
				      FileUtils.copyFile(screen8, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\9submit.png"));
				      System.out.println("Lock successfully added under respective zone and termainl");				 	  

				      Thread.sleep(2000);
					 	String successmsg = driver.findElement(By.xpath("//div[@class='m-3d733a3a mantine-Notification-description']")).getText();
					 	
					 	System.out.println(successmsg); 
					 	 Thread.sleep(2000);
					 	
						System.out.println("*******Lock Added successfully*********");
						System.out.println(                                         );
						

  }
  
 
  
  
  @Test(priority = 2,enabled= true)

  public void addkey() throws IOException, InterruptedException   {
	  // Check if driver is initialized
	  if(driver == null) {
		 Reporter.log("WebDriver is not initialized. Please check setup.");
		  return; // Exit the test method if driver is null
	  }
	    	  
	  String urlname = prop.getProperty("url");
	  driver.get(urlname);
	  System.out.println("Current URL:"+urlname);
	  driver.manage().window().maximize();
	  //take screen shot
	  File screen8 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen8, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\1url.png"));

	  Stock_Lock_pages stockpage = new Stock_Lock_pages(driver);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 
	  stockpage.settings.click();
	  Thread.sleep(2000);
	  File screen9 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen9, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\2settings.png"));

	  stockpage.stocks.click();
	  Thread.sleep(2000);
	  File screen10 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen10, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\3stocks.png"));
      
	  stockpage.addstock.click();
	  File screen11 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen11, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\4addstock.png"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
	  //Zone selection
	  
	  Actions zone = new Actions(driver);
		zone.sendKeys(Keys.TAB).perform();
	  List<WebElement> zonevalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[37]"));
		
		for(WebElement singlevalue : zonevalue)
		{
			String zonename = singlevalue.getText();
			if(zonename.contains("ZoneOCT"))
			{
				String Expectedname = "ZoneOCT";
				if(Expectedname.equals(zonename))
					System.out.println("Zone Matched and Selected Successfully "
							+ " Zone name is:"+zonename);			
				singlevalue.click();
			}
		
		}	
		File screen12 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen12, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\5zone.png"));
		
		
		//TERMINAL SELECTION
		//action key  used to click the zone field
		Actions Terminal = new Actions(driver);
		Terminal.sendKeys(Keys.TAB).perform();	
		//selected the specific value from the drop down
		List<WebElement> terminalvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[71]"));
		
		for(WebElement singlevalue1 : terminalvalue)
		{
			String terminalname = singlevalue1.getText();
			if(terminalname.contains("OCTTT"))
			{
				String Expectedname = "OCTTT";
				if(Expectedname.equals(terminalname))
					System.out.println("Terminal Matched and Selected Successfully "
							+ " Terminal name is:"+terminalname);			
				singlevalue1.click();
			}
		
		}
		File screen13 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen13, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\6terminal.png"));
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ASSET TYPE SELECTION
			//action key  used to click the zone field
			Actions assettype = new Actions(driver);
			assettype.sendKeys(Keys.TAB).perform();	
			//selected the specific value from the drop down   
			List<WebElement> assetvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[75]"));
			
			for(WebElement singlevalue : assetvalue)
			{
				String assetname = singlevalue.getText();
				if(assetname.contains("Key"))
				{
					String Expectedname = "Key";
					if(Expectedname.equals(assetname))
						System.out.println("Assetname Matched and Selected Successfully "
								+ " Asset name is:"+assetname);			
					singlevalue.click();
				}
			
			}
			File screen15 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screen15, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\7asserts.png"));
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			//ASSETS TYPE SELECTION
			//action key  used to click the zone field
			Actions assets = new Actions(driver);
			assets.sendKeys(Keys.TAB).perform();	
			//lock assert selection
			
			 stockpage.firstOption.click();
			 stockpage.SecondOption.click();
				System.out.println("Key Selected and Matched Successfully");

				File screen16 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
			      FileUtils.copyFile(screen16, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\8assertselect.png"));
			
			 
	        //submit button
	       assets.sendKeys(Keys.TAB)
	       .sendKeys(Keys.ENTER).perform();
	 	  Thread.sleep(2000);
	 	  File screen17 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screen17, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\9submit.png"));
		      System.out.println("Key successfully added under respective zone and termainl");
		 	  

		      Thread.sleep(2000);
			 	String successmsg = driver.findElement(By.xpath("//div[@class='m-3d733a3a mantine-Notification-description']")).getText();
			 	
			 	System.out.println(successmsg); 
			 	
				System.out.println("******** Key Added successfully*********");
				System.out.println(                                            );

}
  
  @Test(priority = 3,enabled= true)
  public void addwallpd() throws IOException, InterruptedException   {
	  // Check if driver is initialized
	  if(driver == null) {
		  System.out.println("WebDriver is not initialized. Please check setup.");
		  return; // Exit the test method if driver is null
	  }
	    	  
	  String urlname = prop.getProperty("url");
	  driver.get(urlname);
	  System.out.println("Current URL:"+urlname);
	  driver.manage().window().maximize();
	  //take screen shot
	  File screen18 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen18, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\1url.png"));

	  Stock_Lock_pages stockpage = new Stock_Lock_pages(driver);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 
	  stockpage.settings.click();
	  Thread.sleep(2000);
	  File screen19 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen19, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\2settings.png"));

	  stockpage.stocks.click();
	  Thread.sleep(2000);
	  File screen20 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen20, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\3stocks.png"));
      
	  stockpage.addstock.click();
	  File screen21 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen21, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\4addstock.png"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
	  //Zone selection
	  
	  Actions zone = new Actions(driver);
		zone.sendKeys(Keys.TAB).perform();
	  List<WebElement> zonevalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[37]"));
		
		for(WebElement singlevalue : zonevalue)
		{
			String zonename = singlevalue.getText();
			if(zonename.contains("ZoneOCT"))
			{
				String Expectedname = "ZoneOCT";
				if(Expectedname.equals(zonename))
					System.out.println("Zone Matched and Selected Successfully "
							+ " Zone name is:"+zonename);			
				singlevalue.click();
			}
		
		}	
		File screen22 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen22, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\5zone.png"));
		
		
		//TERMINAL SELECTION
		//action key  used to click the zone field
		Actions Terminal = new Actions(driver);
		Terminal.sendKeys(Keys.TAB).perform();	
		//selected the specific value from the drop down
		List<WebElement> terminalvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[71]"));
		
		for(WebElement singlevalue1 : terminalvalue)
		{
			String terminalname = singlevalue1.getText();
			if(terminalname.contains("OCTTT"))
			{
				String Expectedname = "OCTTT";
				if(Expectedname.equals(terminalname))
					System.out.println("Terminal Matched and Selected Successfully "
							+ " Terminal name is:"+terminalname);			
				singlevalue1.click();
			}
		
		}
		File screen23 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen23, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\6terminal.png"));
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ASSET TYPE SELECTION
			//action key  used to click the zone field
			Actions assettype = new Actions(driver);
			assettype.sendKeys(Keys.TAB).perform();	
			//selected the specific value from the drop down   
			List<WebElement> assetvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[76]"));
			
			for(WebElement singlevalue : assetvalue)
			{
				String assetname = singlevalue.getText();
				if(assetname.contains("WallPD"))
				{
					String Expectedname = "WallPD";
					if(Expectedname.equals(assetname))
						System.out.println("Assetname Matched and Selected Successfully "
								+ " Asset name is:"+assetname);			
					singlevalue.click();
				}
			
			}
			File screen24 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screen24, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\7asserts.png"));
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			//ASSETS TYPE SELECTION
			//action key  used to click the zone field
			Actions assets = new Actions(driver);
			assets.sendKeys(Keys.TAB).perform();	
			//lock assert selection
			
			 stockpage.firstOption.click();
				System.out.println("Wallpd Selected and Matched Successfully");

				File screen25 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
			      FileUtils.copyFile(screen25, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\8assertselect.png"));
			
			 
	        //submit button
	       assets.sendKeys(Keys.TAB)
	       .sendKeys(Keys.ENTER).perform();
	 	  Thread.sleep(2000);
	 	  File screen26 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screen26, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\9submit.png"));
		      System.out.println("Wallpd successfully added under respective zone and termainl");
		 	  

		      Thread.sleep(2000);
			 	String successmsg = driver.findElement(By.xpath("//div[@class='m-3d733a3a mantine-Notification-description']")).getText();
			 	
			 	System.out.println(successmsg); 
  
			 	System.out.println("******** WallPD Added successfully*********");
				System.out.println(                                             );
				
}
  
  
  @Test(priority = 4,enabled= true)

  public void addkeybox() throws IOException, InterruptedException   {
	  // Check if driver is initialized
	  if(driver == null) {
		  System.out.println("WebDriver is not initialized. Please check setup.");
		  return; // Exit the test method if driver is null
	  }
	    	  
	  String urlname = prop.getProperty("url");
	  driver.get(urlname);
	  System.out.println("Current URL:"+urlname);
	  driver.manage().window().maximize();
	  //take screen shot
	  File screen27 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen27, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\1url.png"));

	  Stock_Lock_pages stockpage = new Stock_Lock_pages(driver);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 
	  stockpage.settings.click();
	  Thread.sleep(2000);
	  File screen28 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen28, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\2settings.png"));

	  stockpage.stocks.click();
	  Thread.sleep(2000);
	  File screen29 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen29, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\3stocks.png"));
      
	  stockpage.addstock.click();
	  File screen30 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen30, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\4addstock.png"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  
	  //Zone selection
	  
	  Actions zone = new Actions(driver);
		zone.sendKeys(Keys.TAB).perform();
	  List<WebElement> zonevalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[37]"));
		
		for(WebElement singlevalue : zonevalue)
		{
			String zonename = singlevalue.getText();
			if(zonename.contains("ZoneOCT"))
			{
				String Expectedname = "ZoneOCT";
				if(Expectedname.equals(zonename))
					System.out.println("Zone Matched and Selected Successfully "
							+ " Zone name is:"+zonename);			
				singlevalue.click();
			}
		
		}	
		File screen31 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen31, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\5zone.png"));
		
		
		//TERMINAL SELECTION
		//action key  used to click the zone field
		Actions Terminal = new Actions(driver);
		Terminal.sendKeys(Keys.TAB).perform();	
		//selected the specific value from the drop down
		List<WebElement> terminalvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[71]"));
		
		for(WebElement singlevalue1 : terminalvalue)
		{
			String terminalname = singlevalue1.getText();
			if(terminalname.contains("OCTTT"))
			{
				String Expectedname = "OCTTT";
				if(Expectedname.equals(terminalname))
					System.out.println("Terminal Matched and Selected Successfully "
							+ " Terminal name is:"+terminalname);			
				singlevalue1.click();
			}
		
		}
		File screen32 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screen32, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\6terminal.png"));
		
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ASSET TYPE SELECTION
			//action key  used to click the zone field
			Actions assettype = new Actions(driver);
			assettype.sendKeys(Keys.TAB).perform();	
			//selected the specific value from the drop down   
			List<WebElement> assetvalue = driver.findElements(By.xpath("(//div[@class='m-92253aa5 mantine-Select-option m-390b5f4'])[77]"));
			
			for(WebElement singlevalue : assetvalue)
			{
				String assetname = singlevalue.getText();
				if(assetname.contains("KeyBox"))
				{
					String Expectedname = "KeyBox";
					if(Expectedname.equals(assetname))
						System.out.println("Assetname Matched and Selected Successfully "
								+ " Asset name is:"+assetname);
					
					singlevalue.click();
				}
			
			}
			File screen33 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		      FileUtils.copyFile(screen33, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\7asserts.png"));
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			//ASSETS TYPE SELECTION
			// Action key is used to click the zone field
			Actions assets = new Actions(driver);
			assets.sendKeys(Keys.TAB).perform();

			// Lock asset selection
			stockpage.firstOption.click();
			stockpage.SecondOption.click();
			assets.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			File screen34 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screen34, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\9submit.png"));
			System.out.println("Keybox successfully added under respective zone and terminal");
			  Thread.sleep(2000);
			 	String successmsg = driver.findElement(By.xpath("//div[@class='m-3d733a3a mantine-Notification-description']")).getText();
			 	
			 	System.out.println(successmsg); 
			 	
				System.out.println("******** Keybox  Added successfully*********");
				System.out.println(                                      );
		
			//List<WebElement> options = driver.findElements(By.xpath("(//input[@class='mantine-MultiSelect-inputField m-45c4369d mantine-PillsInputField-field'])[1]"));
/*
 * boolean isValuePresent = false;

			for (WebElement option : options)
			{
			    if (option.getText().equals("4465")) {
			        isValuePresent = true;
			        option.click();
			        break;
			    }
			    else {
			    	}
			    	
		  
			    }

 */
									
			   
		    
}

  
  @Test(priority= 5 ,enabled = true)
  public void Mandatoryfieldscheck() throws IOException, InterruptedException   {
	  // Check if driver is initialized
	  if(driver == null) {
		  System.out.println("WebDriver is not initialized. Please check setup.");
		  return; // Exit the test method if driver is null
	  }
	    	  
	  String urlname = prop.getProperty("url");
	  driver.get(urlname);
	  System.out.println("Current URL:"+urlname);
	  driver.manage().window().maximize();
	  //take screen shot
	  File screen35 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen35, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\1url.png"));

	  Stock_Lock_pages stockpage = new Stock_Lock_pages(driver);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 
	  stockpage.settings.click();
	  Thread.sleep(2000);
	  File screen36 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen36, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\2settings.png"));

	  stockpage.stocks.click();
	  Thread.sleep(2000);
	  File screen37 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen37, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\3stocks.png"));
      
	  stockpage.addstock.click();
	  File screen38 = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(screen38, new File("C:\\Users\\Mallika\\Pictures\\screenshots\\add_stocks\\4addstock.png"));
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  stockpage.Submit.click();
	  System.out.println("********Mandatory fields displayed with error messages*********");
		System.out.println(                                           );
		driver.quit();
  }

	  
  
  @AfterMethod
  public void afterMethod() {
	  
	  
  }
}
 
