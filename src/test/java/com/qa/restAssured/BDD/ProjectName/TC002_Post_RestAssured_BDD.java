package com.qa.restAssured.BDD.ProjectName;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TC002_Post_RestAssured_BDD {

	public static HashMap map= new HashMap();
	@BeforeClass
	public void getData() {
		map.put("name", RestUtils.getFirstName());
		map.put("age", RestUtils.getAge());
		map.put("salary", RestUtils.getSalary());
//		map.put("PassWord", RestUtils.getPassWord());
//		map.put("EmailId", RestUtils.getEmailId());
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/create";
	}
	
	@Test
	public void postRequest() {
		given()
		 .contentType("application/json;charset=utf-8")
		 .body(map)
		 
	    .when()
		 .post()
	    .then()
	     .statusCode(200)
	     .and()
	     .body("status", equalTo("success"));
//	     .and()
//	     .body("Message", equalTo("Operation completed successfully"));
	}
	
}
