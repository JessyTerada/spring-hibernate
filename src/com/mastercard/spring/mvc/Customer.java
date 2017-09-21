package com.mastercard.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	
	@NotNull
	@Size(min=1, message=" is required")
	private String lastName;
	
	@Min(value=0, message="must be great than or equal to zero")
	@Max(value=10, message="must be less than or equal to 10")
	private int freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private int postalCode;
	
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
	
	public int getFreePasses() {
		return freePasses;
	}
	
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
}
