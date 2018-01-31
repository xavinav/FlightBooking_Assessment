package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_FlightConfirmation_Page {
	

	@FindBy(xpath="/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")
	public WebElement txtlbl_flightconf;
	
	
	public POM_FlightConfirmation_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
		  
}
	
	
}
