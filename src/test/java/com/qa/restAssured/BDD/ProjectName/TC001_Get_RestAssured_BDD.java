package com.qa.restAssured.BDD.ProjectName;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; 

public class TC001_Get_RestAssured_BDD {

	@Test
	public void getRequest() {
	given()
	.when()
	    .get("http://restapi.demoqa.com/utilities/weather/city/Pondicherry")
	.then()
	    .statusCode(200)
	    .statusLine("HTTP/1.1 200 OK")
	    .assertThat().body("City",equalTo("Puducherry"))
	    .header("Content-Type", "application/json");
	}
}
