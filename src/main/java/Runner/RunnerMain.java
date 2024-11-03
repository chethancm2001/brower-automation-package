package Runner;

import java.util.Properties;

import com.ChromeDriver;
import com.Driver;

public class RunnerMain {

	
	public static void main(String args[]) throws Exception {
		
		 System.setProperty("driver.path","/home/chethan/Desktop/selenium-core/chromedriver");
		Driver webDriver = new ChromeDriver();	
		webDriver.get("https://www.google.com/");
	
		
	}
}
