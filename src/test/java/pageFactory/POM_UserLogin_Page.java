package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_UserLogin_Page {
	
    //Entering credentials and clicking Sign-in button - UserLogin_Page
	@FindBy(name="userName")
	public WebElement txt_Uname;
    
	@FindBy(name="password")
	public WebElement txt_pwd;
    
    
	@FindBy(name="login")
	public WebElement btn_Signin;
	
	
	public POM_UserLogin_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
		  
}

	public void Site_login(String Uname, String Pwd)
	{
	
		txt_Uname.sendKeys(Uname);
		txt_pwd.sendKeys(Pwd);
		btn_Signin.click();
	}
}
