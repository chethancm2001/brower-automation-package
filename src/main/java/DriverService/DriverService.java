package DriverService;

import java.io.IOException;
import java.util.Properties;

import apiutill.ExcuteCall;

public class DriverService {
	
	private DriverService() {
		
	}
	
	
	public static String startService() throws Exception {
	
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
		System.out.println("process is started");
		System.out.println("starting the session");
		String sessionId = createSession();
		return sessionId;
		
		
	}
	
   private static String createSession() throws IOException, InterruptedException {
	String sessionId =   ExcuteCall.createSession(getUrl()+"/session");
	return sessionId;
   }
   
	
	public static String getUrl() {
		return "http://localhost:4444";
	}
}
