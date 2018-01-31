package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_ClassFB {
	
	public WebDriver driver;
	//Accessing utility class for URL and browsertype
	Utility_ClassFB c1 = new Utility_ClassFB();

	@BeforeMethod
	public void launchApp() throws Exception{
		
        String browsertype = c1.Reading_properties("BTYPE");
        if (browsertype.equals("firefox"))
        {
        driver =new FirefoxDriver();
        }
        else if(browsertype.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
        	driver =new ChromeDriver();
        	}
        else if(browsertype.equals("ie"))
        {
        System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\IEDriverServer.exe");
        driver =new InternetExplorerDriver();
        }
		
		driver.get(c1.Reading_properties("URL"));
		driver.manage().window().maximize();
		
}
	
	@AfterMethod
	public void tearDown(){		
		driver.quit();
		
	}
}
