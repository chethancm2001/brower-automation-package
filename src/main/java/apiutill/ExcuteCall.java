package apiutill;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

public class ExcuteCall {

	public static String createSession(String  url) throws IOException, InterruptedException {
		System.out.println("Url is " + url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json").POST(HttpRequest.BodyPublishers.ofString("{\n    \"capabilities\":{\n    \n    }\n}")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("Status code " + response.statusCode());
		System.out.println("response body " + response.body());
		if(response.statusCode() == 200) {
			System.out.println("Created the session sucessfully");
			 JSONObject jsonResponse = new JSONObject(response.body());
		     String sessionId = jsonResponse.getJSONObject("value").getString("sessionId");
		     return sessionId;
		}else {
			System.out.println("Failed to crate the session");
			return null;
		}
		
	}
	
	
}
