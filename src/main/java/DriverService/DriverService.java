package DriverService;

import java.util.Properties;

public class DriverService {
	
	private DriverService() throws Exception {
	
		String path = System.getProperty("driver.path");
		System.out.println("driver path " + path);
		
		if(path == null) {
			throw new Exception("Driver path is null");
		}
		
		// path validation 
		
		//process start
		ProcessBuilder builder = new ProcessBuilder();
		builder.command(path, "--port=4444");
		Process process = builder.start();
		System.out.print("process is started");
		
	}
	
	public static String getUrl() {
		return "http://localhost:4444";
	}
}
