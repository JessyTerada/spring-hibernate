package com.mastercard.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mastercard.spring.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull
	@Size(min=1, message=" is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be great than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private int postalCode;
	
	@CourseCode(value="TOPS", message="must start with TOPS")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Integer getFreePasses() {
		return freePasses;
	}
	
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
}
