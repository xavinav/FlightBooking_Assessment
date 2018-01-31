package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_SelectFlight_Page {
	
	
	@FindBy(name="reserveFlights")
	public WebElement Btn2_Continue;
	
	@FindBy(xpath="//img[contains(@src,'selectflight')]")
	public WebElement img_sfbanner;
	
	public POM_SelectFlight_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}

}
