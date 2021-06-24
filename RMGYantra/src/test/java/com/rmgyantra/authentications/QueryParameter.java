package com.rmgyantra.authentications;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class QueryParameter {
	
	@Test
	public void getAllRepoQuery() {
		
		given()
			.queryParam("q", "NitheshHS")
		.when()
			.get("https://api.github.com/search/users")
		.then()
			.log().all();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test 
	public void githubQueryParamTest() {
		//https://api.github.com/search/repositories?q=BDDCucumberSDET8
		given()
			.queryParam("q", "BDDCucumberSDET8")
		.when()
			.get("https://api.github.com/search/repositories")
		.then()
			.log().all();
	}

}
