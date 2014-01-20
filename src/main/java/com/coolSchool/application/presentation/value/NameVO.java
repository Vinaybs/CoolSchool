package com.coolSchool.application.presentation.value;

import java.io.Serializable;

/**
 * This class represents the Name object which contains surName, firstName and
 * lastName
 * 
 * @author Vinay
 * 
 */
public class NameVO implements Serializable {
	/**
	 * Default generated Serialization ID
	 */
	private static final long serialVersionUID = -971064645279229579L;
	private String firstName;
	private String surName;
	private String lastName;
	private String displayName;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
