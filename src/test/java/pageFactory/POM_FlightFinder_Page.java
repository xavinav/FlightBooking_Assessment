package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_FlightFinder_Page {
	
	@FindBy(xpath="//input[@name='tripType' and @value='oneway']")
	public WebElement Radioicon_Oneway;
	
	@FindBy(name="fromPort")
	public WebElement Drpwn_fromPort;
	
	
	@FindBy(name="toPort")
	public WebElement Drpwn_toPort;
	
	
	@FindBy(name="servClass")
	public WebElement Radioicon_firstclass;
	
	@FindBy(name="findFlights")
	public WebElement Btn1_Continue;
	
	@FindBy(xpath="//img[contains(@src,'flightfinder')]")
	public WebElement img_hbanner;
	
	
	public POM_FlightFinder_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}
}
