package com.coolSchool.application.persistence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * This class represents the Name object which contains surName, firstName and
 * lastName
 * 
 * @author Vinay
 * 
 */
@Embeddable
public class Name implements Serializable {
	/**
	 * Default generated Serialization ID
	 */
	private static final long serialVersionUID = -971064645279229579L;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "SUR_NAME")
	private String surName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DISPLAY_NAME")
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
