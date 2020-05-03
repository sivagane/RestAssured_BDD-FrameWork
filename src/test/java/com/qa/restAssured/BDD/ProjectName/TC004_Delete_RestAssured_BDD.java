package com.qa.restAssured.BDD.ProjectName;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC004_Delete_RestAssured_BDD {

	@Test
	public void deleteRequest() {

		RestAssured.baseURI = "http://localhost:3030";
		RestAssured.basePath = "products/9999686";

		Response jsonresponse = given()

				.when().delete().then().statusCode(404).log().all().extract().response();

		String stringresponse = jsonresponse.asString();
		Assert.assertEquals(stringresponse.contains("No record found for id '9999686'"), true);

	}

}
