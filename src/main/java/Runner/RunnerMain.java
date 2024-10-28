package Runner;

import java.util.Properties;

import DriverService.DriverService;

public class RunnerMain {

	
	public static void main(String args[]) {
		
		
		
		  try {
		  
		  System.setProperty("driver.path",
		  "/home/chethan/Desktop/selenium-core/chromedriver"); 
		  }catch(Exception e ) { System.out.println("path is null");
		  e.printStackTrace(); }
		 
		//lsof -i | grep -E 'chrome|chromedriver'
		  //
		
		
	}
}
