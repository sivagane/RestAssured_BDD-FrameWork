package com.qa.restAssured.BDD.ProjectName;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class TC005_Validations_RestAssured_BDD {

	// GetRequest
	@Test(priority = 1)
	public void response() {

		given()

				.when().get("http://jsonplaceholder.typicode.com/posts/5").then().statusCode(200);

	}

	@Test(priority = 2)
	public void logResponse() {

		given()

				.when().get("http://localhost:3030/products/9999687").then().statusCode(200);
		// .log().all();
	}

	@Test(priority = 3)
	public void getSingleResponse() {

		given()

				.when().get("http://localhost:3030/products/9999687").then().statusCode(200)
				.body("name", equalTo("Maggi Noodles"));
		// .log().all();

	}

	@Test(priority = 4)
	public void getMultipleReponse() {

		given()

				.when().get("http://dummy.restapiexample.com/api/v1/employees").then()
				.body("data.id", hasItems("1", "2", "3")).log().all();
	}

	@Test(priority=5)
	public void getHeadersAndParams() {
		
		given()
		 .params("MyParam","Parameter")
		 .header("MyHeader", "Header")
	    .when()
		 .get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		 .statusCode(200);
		 
	}

}
