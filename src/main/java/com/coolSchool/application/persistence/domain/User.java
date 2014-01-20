package com.coolSchool.application.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class represents the User Entity.
 * 
 * @author Vinay
 * 
 */
@Entity(name = "TBL_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "USER_ID", nullable = false, unique = true)
	private String userId;
	@Embedded
	@Column(name = "NAME", nullable = false)
	private Name name;
	@ElementCollection
	private Set<Address> userAddresses = new HashSet<Address>();
	@ElementCollection
	private Set<Contact> userContacts = new HashSet<Contact>();
	private String occupation;
	@Column(name = "IS_PERMANENT")
	private Boolean isPermanent = false;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Set<Address> getUserAddresses() {
		return userAddresses;
	}

	public void setUserAddresses(Set<Address> userAddresses) {
		this.userAddresses = userAddresses;
	}

	public Set<Contact> getUserContacts() {
		return userContacts;
	}

	public void setUserContacts(Set<Contact> userContacts) {
		this.userContacts = userContacts;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
