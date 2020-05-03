package com.qa.restAssured.BDD.SerializationAndDeserialization;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC_RestAssuredSerializationAndDeserialization {

	@Test(priority=1)
	public void createStudentData() {
//		ArrayList<String> course = new ArrayList<String>();
//		course.add("Java");
//		course.add("selenium");

		Bottle bot = new Bottle();
		bot.setName("Signoraware");
		bot.setType("Bottle");
		bot.setPrice(40);
		bot.setUpc("Signorawareupc");
		bot.setShipping(10);
	    bot.setDescription("Bottles are made from Enviroment Friendly plastics");
		bot.setManufacturer("Signoraware-India");
		bot.setModel("ZA13");
		bot.setUrl("http://www.signoraware.com/bottles");
		bot.setImage("http://www.signoraware.com/images=bottles");

		given().contentType(ContentType.JSON).body(bot).when().post("http://localhost:3030/products").then().statusCode(201).assertThat().body("name",
				equalTo("Signoraware"));
	}
	
//	@Test(priority=2)
//	public void getStudentData() {
//	 Bottle bot=get("http://localhost:3030/products/9999695").as(Bottle.class);
//	 Assert.assertEquals(bot.getManufacturer(), "Signoraware-India");
//	}
}