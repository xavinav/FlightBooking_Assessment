package projScripts;

import genericLibrary.Base_ClassFB;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageFactory.POM_BookFlight_Page;
import pageFactory.POM_FlightConfirmation_Page;
import pageFactory.POM_FlightFinder_Page;
import pageFactory.POM_SelectFlight_Page;
import pageFactory.POM_UserLogin_Page;

public class Flight_Booking extends Base_ClassFB {
	
	
	@Test(dataProvider="dp_Booking",dataProviderClass=dataProvider.DataProviderFB.class)
	public void testFlightBook(Map<String,String> book) throws IOException
	{
		
		// Accessing test data from external excel sheet 
		String Uname = book.get("Uname");
		String Pwd = book.get("Pwd");
		String fname = book.get("Firstname");
		String lname = book.get("Lastname");
		String cnumber = book.get("Cardnumber");
		String expmsg = book.get("SuccessMSG");
		
		
		// Accessing UserLogin_Page POM
		POM_UserLogin_Page ulogin = new POM_UserLogin_Page(driver);
		
		ulogin.Site_login(Uname, Pwd);
		
		
		// Accessing FlightFinder_Page POM
		POM_FlightFinder_Page ffinder = new POM_FlightFinder_Page(driver);
		
		// FlightFinder page validation
		if((ffinder.img_hbanner).isEnabled()){
			
			System.out.println("Home_Page loaded successfully");
			
		}else{
			
			System.out.println("Home_Page not loaded successfully");
			
		}
		
		
		ffinder.Radioicon_Oneway.click();
		Select dropdown = new Select(ffinder.Drpwn_fromPort);
		dropdown.selectByValue("Sydney");
		Select dropdown2 = new Select(ffinder.Drpwn_toPort);
		dropdown2.selectByValue("London");
		ffinder.Radioicon_firstclass.click();
		ffinder.Btn1_Continue.click();
		
		// Accessing SelectFlight_Page POM
		POM_SelectFlight_Page sflight = new POM_SelectFlight_Page(driver);
		
		// Select_Flight Page validation
		if((sflight.img_sfbanner).isEnabled()){
			
			System.out.println("Select_Flight Page loaded successfully");
			
		}else{
			
			System.out.println("Select_Flight Page not loaded successfully");
			
		}
		
		sflight.Btn2_Continue.click();
		
		// Accessing BookFlight_Page POM
		POM_BookFlight_Page bflight = new POM_BookFlight_Page(driver);
		
		// BookFlight_Page validation
		if((bflight.img_bfbanner).isEnabled()){
			
			System.out.println("Book_flight Page loaded successfully");
			
		}else{
			
			System.out.println("Book_flight Page not loaded successfully");
			
		}
			
		
		bflight.txt_firstname.sendKeys(fname);
		bflight.txt_lastname.sendKeys(lname);
		bflight.txt_creditnumber.sendKeys(cnumber);
		bflight.chkbox_ticketless.click();
		bflight.Btn_securepurchase.click();
		
		// Accessing FlightConfirmation_Page POM
		POM_FlightConfirmation_Page fconfirm = new POM_FlightConfirmation_Page(driver);
		
		String ACT_OTP = fconfirm.txtlbl_flightconf.getText();

		// FlightConfirmation_Page validation
		if(ACT_OTP.equals(expmsg))
		{
			System.out.println("Successful flight booking");
			
		}
		else 
		{
			System.out.println("Failure during flight booking");
			
		}



	}
}
	
