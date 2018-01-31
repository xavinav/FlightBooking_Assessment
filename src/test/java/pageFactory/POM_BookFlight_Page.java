package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_BookFlight_Page {
	
	@FindBy(name="passFirst0")
	public WebElement txt_firstname;
	
	@FindBy(name="passLast0")
	public WebElement txt_lastname;
	
	@FindBy(name="creditnumber")
	public WebElement txt_creditnumber;
	
	@FindBy(name="ticketLess")
	public WebElement chkbox_ticketless;
	
	@FindBy(name="buyFlights")
	public WebElement Btn_securepurchase;
	
	@FindBy(xpath="//img[contains(@src,'book')]")
	public WebElement img_bfbanner;
	
	public POM_BookFlight_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	
	}


}
