package com.qa.restAssured.BDD.ProjectName;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC_006_BasicValidations_XML_RestAssured_BDD {

	@Test(priority = 1)
	public void basicResponse() {

		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then().statusCode(200)
				.body("CUSTOMER.FIRSTNAME", equalTo("Bill"));
		// .log().all();
	}

	// To check multiple responses
	@Test(priority = 2)
	public void checkingMultipleResponse() {

		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then().statusCode(200)
				.body("CUSTOMER.FIRSTNAME", equalTo("Bill")).body("CUSTOMER.LASTNAME", equalTo("Clancy"))
				.body("CUSTOMER.STREET", equalTo("319 Upland Pl.")).body("CUSTOMER.CITY", equalTo("Seattle"));
		// .log().all();
	}

	// To check multiple responses in single line
	@Test(priority = 3)
	public void checkAllResponsesSingleLine() {

		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then().statusCode(200)
				.body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"));
		// .log().all();
	}

	// Checking XML Response using XPath
	@Test(priority = 4)
	public void checkXMLResponseUsingXPath() {

		given()

				.when().get("http://thomas-bayer.com/sqlrest/CUSTOMER/15").then()
				.body(hasXPath("/CUSTOMER/FIRSTNAME", equalTo("Bill")));
		// .log().all();
	}

	@Test(priority=5)
	public void checkXMLResponseUsingXPath1() {
		given()

				.when().get("http://thomas-bayer.com/sqlrest/INVOICE/").then()
				.body(hasXPath("/INVOICEList/INVOICE[text()='30']")).log().all();
	}

}
