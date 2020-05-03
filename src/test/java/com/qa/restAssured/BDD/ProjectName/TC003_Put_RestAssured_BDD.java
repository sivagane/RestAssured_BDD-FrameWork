package com.qa.restAssured.BDD.ProjectName;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TC003_Put_RestAssured_BDD {

	public static HashMap map= new HashMap();
	@BeforeClass
	public void getData() {
		
		map.put("name", RestUtils.getFirstName() );
		map.put("age", RestUtils.getAge());
		map.put("salary", RestUtils.getSalary());
		int Id=8;
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+Id;
		
	}
	
	@Test
	public void putRequest() {
		
		given()
		 .contentType("application/json")
		 .body(map)
	    .when()
	     .put()
	    .then()
	     .statusCode(200)
	     .log().all();
			}
}
