package com;

import java.io.IOException;

import DriverService.DriverService;
import apiutill.ExcuteCall;

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
	
	public void get(String url) throws IOException, InterruptedException {
		String apiUrl = DriverService.getUrl()+"/session/"+sessionId +"/url";
		ExcuteCall.getUrl(apiUrl, url);
	}


	

}
