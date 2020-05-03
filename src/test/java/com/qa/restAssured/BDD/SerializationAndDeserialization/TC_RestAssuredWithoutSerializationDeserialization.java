package com.qa.restAssured.BDD.SerializationAndDeserialization;

import java.util.ArrayList;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class TC_RestAssuredWithoutSerializationDeserialization {

	public HashMap map = new HashMap();

	@Test(priority=1)
	public void createRequest() {

		ArrayList<String> course = new ArrayList<String>();
		course.add("Java");
		course.add("Selenium");

		map.put("firstName", "siva");
		map.put("lastName", "Ganesh");
		map.put("email", "siva@gmail.com");
		map.put("programme", "Comupter Science");
		map.put("courses", course);

		given().contentType("application/json").body(map).when().post("http://localhost:8085/student").then()
				.statusCode(201).assertThat().body("firstName", equalTo("siva"));

	}

	@Test(priority=2)
	public void getRequest() {
		given().when().get("http://localhost:8085/student/101").then().statusCode(200).assertThat()
				.body("lastName", equalTo("Ganesh")).log().all();

	}
}
