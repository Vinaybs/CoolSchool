package com.coolSchool.application.presentation.value;

import java.util.HashSet;
import java.util.Set;

/**
 * This class represents the User value object.
 * 
 * @author Vinay
 * 
 */

public class UserVO {

	private Long id;
	private String userId;
	private NameVO name;
	private Set<AddressVO> userAddresses = new HashSet<AddressVO>();
	private Set<ContactVO> userContacts = new HashSet<ContactVO>();
	private String occupation;
	private Boolean isPermanent = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(Boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public NameVO getName() {
		return name;
	}

	public void setName(NameVO name) {
		this.name = name;
	}

	public Set<AddressVO> getUserAddresses() {
		return userAddresses;
	}

	public void setUserAddresses(Set<AddressVO> userAddresses) {
		this.userAddresses = userAddresses;
	}

	public Set<ContactVO> getUserContacts() {
		return userContacts;
	}

	public void setUserContacts(Set<ContactVO> userContacts) {
		this.userContacts = userContacts;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
