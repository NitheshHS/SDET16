package com.rmgyntra.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class RunParamters {
	String baseUri=System.getProperty("uri");
	@Test
	public void runParamterTest() {
		
		given()
		.baseUri(baseUri)
		.get("api/users?page=2")
		.then()
		.log().all();
	}

}
