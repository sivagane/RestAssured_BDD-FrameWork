package com.qa.restAssured.BDD.SerializationAndDeserialization;

import java.util.List;

public class Student {

	int studentId;
	String firstname;
	String lastname;
	String email;
	String programme;
	
	List<String> courses;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public String getStudentRecord() {
		return(this.studentId+" "+this.firstname+" "+this.lastname+" "+this.email+" "+this.programme+" "+this.courses);
	}
}
