package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basesetup {

	
	public static WebDriver driver;
	public static Properties prop;

	
static 
{
	try
	{
	System.setProperty( "webdriver.chrome.driver","C:\\Users\\Mallika\\eclipse-workspace\\U3_Project\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	File f=new File("C:\\Users\\Mallika\\eclipse-workspace\\U3_Project\\inputproperties");
	FileInputStream fis=new FileInputStream(f);
	prop=new Properties();
	prop.load(fis);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}

}
