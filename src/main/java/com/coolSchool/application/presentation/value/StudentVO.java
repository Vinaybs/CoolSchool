package com.coolSchool.application.presentation.value;

import com.coolSchool.application.persistence.domain.Address;
import com.coolSchool.application.persistence.domain.Contact;
import com.coolSchool.application.persistence.domain.Name;

public class StudentVO {

	private Long id;

	private Name name;
	private Integer age;

	private Address address;

	private Contact contact;
	private String studyingClass;
	private String personalBlog;
	private String personalWebsite;

	private Name father;
	private Name mother;
	private Name guardian;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Name getFather() {
		return father;
	}

	public void setFather(Name father) {
		this.father = father;
	}

	public Name getMother() {
		return mother;
	}

	public void setMother(Name mother) {
		this.mother = mother;
	}

	public Name getGuardian() {
		return guardian;
	}

	public void setGuardian(Name guardian) {
		this.guardian = guardian;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getStudyingClass() {
		return studyingClass;
	}

	public void setStudyingClass(String studyingClass) {
		this.studyingClass = studyingClass;
	}

	public String getPersonalBlog() {
		return personalBlog;
	}

	public void setPersonalBlog(String personalBlog) {
		this.personalBlog = personalBlog;
	}

	public String getPersonalWebsite() {
		return personalWebsite;
	}

	public void setPersonalWebsite(String personalWebsite) {
		this.personalWebsite = personalWebsite;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StudentVO other = (StudentVO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
