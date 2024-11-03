package com;

import DriverService.DriverService;

public class ChromeDriver implements Driver {
	
	String sessionId;
	
	public ChromeDriver() throws Exception {
		String id = DriverService.startService();
		if(id != null) {
			this.sessionId = id;
		}
		else {
			// trough the error
		}
	}
	
	public void get(String url) {
		
	}


	

}
