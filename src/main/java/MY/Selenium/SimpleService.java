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
import java.util.Properties;

public class SimpleService {
	
	public static void main(String a[]) throws IOException, InterruptedException {
		System.out.println("Learning the working");
		ProcessBuilder builder = new ProcessBuilder();
		builder.command("/home/chethan/Desktop/selenium-core/chromedriver", "--port=9515");
		Process process = builder.start();
		
		
		/*
		 * BufferedReader reader = new BufferedReader(new
		 * InputStreamReader(process.getInputStream())); String line; while ((line =
		 * reader.readLine()) != null) { System.out.println(line); }
		 */
        
        System.out.println("it is non blocking");
        process.destroy();
        Properties myProp = new Properties();
        myProp.setProperty("name", "Chethan");
        System.out.println(myProp.getProperty("name"));
        
	}
	
}