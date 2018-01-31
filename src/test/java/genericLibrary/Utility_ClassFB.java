package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_ClassFB {

	public String Reading_properties(String skey) throws IOException  {
		
	     FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\Settings.properties");
			
	     Properties prop = new Properties();	
	     prop.load(fis);	
	     return prop.getProperty(skey);	
	}

}
