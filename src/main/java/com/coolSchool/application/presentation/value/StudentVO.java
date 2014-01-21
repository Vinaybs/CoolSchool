package com.coolSchool.application.presentation.value;

import com.coolSchool.application.persistence.domain.Address;
import com.coolSchool.application.persistence.domain.Contact;
import com.coolSchool.application.persistence.domain.Name;

public class StudentVO {

    private Long id;

    private NameVO name;
    private Integer age;

    private AddressVO address;

    private String mobileNumber;
    private String emailAddress;
    private String studyingClass;
    private String personalBlog;
    private String personalWebsite;

    private NameVO father;
    private NameVO mother;
    private NameVO guardian;

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

    public NameVO getFather() {
	return father;
    }

    public void setFather(NameVO father) {
	this.father = father;
    }

    public NameVO getMother() {
	return mother;
    }

    public void setMother(NameVO mother) {
	this.mother = mother;
    }

    public NameVO getGuardian() {
	return guardian;
    }

    public void setGuardian(NameVO guardian) {
	this.guardian = guardian;
    }

    public NameVO getName() {
	return name;
    }

    public void setName(NameVO name) {
	this.name = name;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public AddressVO getAddress() {
	return address;
    }

    public void setAddress(AddressVO address) {
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
	StudentVO other = (StudentVO) obj;
	if (id == null) {
	    if (other.id != null)
		return false;
	}
	else if (!id.equals(other.id))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	}
	else if (!name.equals(other.name))
	    return false;
	return true;
    }

}
