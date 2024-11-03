package com;

import java.io.IOException;

public interface Driver {
	public String sessionId = null;

	void get(String url) throws IOException, InterruptedException;
}
