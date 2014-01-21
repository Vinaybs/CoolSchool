package com.coolSchool.application.persistence.domain;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@AttributeOverrides({
			@AttributeOverride(name = "firstName", column = @Column(name = "STUDENT_FIRST_NAME")),
			@AttributeOverride(name = "surName", column = @Column(name = "STUDENT_SUR_NAME")),
			@AttributeOverride(name = "lastName", column = @Column(name = "STUDENT_LAST_NAME")),
			@AttributeOverride(name = "displayName", column = @Column(name = "STUDENT_DISPLAY_NAME")) })
	@Embedded
	private Name name;

	private Integer age;

	@Embedded
	private Address address;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	private String studyingClass;

	private String personalBlog;

	private String personalWebsite;
	@AttributeOverrides({
			@AttributeOverride(name = "firstName", column = @Column(name = "FATHER_FIRST_NAME")),
			@AttributeOverride(name = "surName", column = @Column(name = "FATHER_SUR_NAME")),
			@AttributeOverride(name = "lastName", column = @Column(name = "FATHER_LAST_NAME")),
			@AttributeOverride(name = "displayName", column = @Column(name = "FATHER_DISPLAY_NAME")) })
	@Embedded
	private Name father;
	@AttributeOverrides({
			@AttributeOverride(name = "firstName", column = @Column(name = "MOTHER_FIRST_NAME")),
			@AttributeOverride(name = "surName", column = @Column(name = "MOTHER_SUR_NAME")),
			@AttributeOverride(name = "lastName", column = @Column(name = "MOTHER_LAST_NAME")),
			@AttributeOverride(name = "displayName", column = @Column(name = "MOTHER_DISPLAY_NAME")) })
	@Embedded
	private Name mother;
	@AttributeOverrides({
			@AttributeOverride(name = "firstName", column = @Column(name = "GUARDIAN_FIRST_NAME")),
			@AttributeOverride(name = "surName", column = @Column(name = "GUARDIAN_SUR_NAME")),
			@AttributeOverride(name = "lastName", column = @Column(name = "GUARDIAN_LAST_NAME")),
			@AttributeOverride(name = "displayName", column = @Column(name = "GUARDIAN_DISPLAY_NAME")) })
	@Embedded
	private Name guardian;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

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
		Student other = (Student) obj;
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
