package com.rmgyantra.authentications;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class PathParameters {
	
	@Test
	public void gitHubPathParam() {
		
		List<String> usernames=new ArrayList<String>();
		usernames.add("NitheshHS");
		
		for(String username:usernames) {
		given()
			.contentType(ContentType.JSON)
			.pathParam("username", username)
		.when()
			.get("https://api.github.com/users/{username}/repos")
		.then()
			.log().all();
		
		}
	}

}
