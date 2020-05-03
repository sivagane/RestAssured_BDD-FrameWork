package com.qa.restAssured.BDD.ProjectName;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getFirstName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(2);
		return("Siva"+generatedstring);
	}
	
	public static String getLastName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(7);
		return("Ganesh"+generatedstring);
	}
	
	public static String getUserName() {
		String generatedstring = RandomStringUtils.randomAlphabetic(9);
		return("Siva"+generatedstring);
	}
	
	public static String getPassWord() {
		String generatedstring = RandomStringUtils.randomAlphabetic(4);
		return("Siva"+generatedstring);
	}
	

	public static String getEmailId() {
		String generatedstring = RandomStringUtils.randomAlphabetic(3);
		return(generatedstring+"@gmail.com");
	}
	
	public static String getAge() {
		String generatedstring = RandomStringUtils.randomNumeric(5);
		return(generatedstring);
	}
	
	public static String getSalary() {
		String generatedstring = RandomStringUtils.randomNumeric(6);
		return(generatedstring);
	}
}
