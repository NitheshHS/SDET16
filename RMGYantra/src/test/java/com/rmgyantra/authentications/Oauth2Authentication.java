package com.rmgyantra.authentications;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2Authentication {
	
	@Test
	public void oauth2Test() {
		
	Response response=given()
			.formParam("client_id", "SDET16")
			.formParam("client_secret", "ee4303816d295520ee2a5fe2683fd61d")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "http://example.com")
		.when()
			.post("http://coop.apps.symfonycasts.com/token");
		
//	response.then()
//			.log().all();
		
	String token=response.jsonPath().get("access_token");
			
	System.out.println(token);		
			
			given()
			.contentType(ContentType.JSON)
			.auth().oauth2(token)
			.when()
				.post("http://coop.apps.symfonycasts.com/api/1301/chickens-feed")
			.then()
				.log().all();
	}

}
