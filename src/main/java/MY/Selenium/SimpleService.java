/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package MY.Selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class SimpleService {
	
	public static void main(String a[]) throws IOException, InterruptedException {
			
		// http client 
		HttpClient client = HttpClient.newHttpClient();
		
		// build the request 
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://example.com")).GET().build();
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Status Code: " + response.statusCode());
		
		
		
	}
	
}
