package com.coolSchool.application.persistence.dao;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.coolSchool.application.persistence.dao.contract.IStudentDao;
import com.coolSchool.application.persistence.domain.Address;
import com.coolSchool.application.persistence.domain.Name;
import com.coolSchool.application.persistence.domain.Student;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/test-coolSchool-context.xml" })
public class StudentDaoTest {

    @Autowired
    IStudentDao studentDao;

    @Test
    public void testSave() {
	try {
	    studentDao.save(setupStudent());
	}
	catch (CoolSchoolDataAccessException e) {
	    Assert.fail(e.getLocalizedMessage());
	}
    }

    private Student setupStudent() {
	Student student = new Student();

	student.setName(setupName("John", "", "O'Connor", "John"));
	student.setFather(setupName("Peter", "", "O'Connor", "Peter"));
	student.setMother(setupName("Diana", "", "O'Connor", "Diana"));
	student.setAge(12);
	student.setStudyingClass("1st Standard");
	student.setAddress(setupAddress());
	student.setMobileNumber("0584733612");
	student.setEmailAddress("iamstudent@gmail.com");

	return student;
    }

    private Name setupName(String firstName, String lastName, String surName, String displayName) {
	Name name = new Name();

	name.setDisplayName(displayName);
	name.setFirstName(firstName);
	name.setLastName(lastName);
	name.setSurName(surName);

	return name;
    }

    private Address setupAddress() {
	Address address = new Address();

	address.setCity("Sydney");
	address.setCountry("Australia");
	address.setIsPrimary(true);
	address.setRegion("Macquarie Park");
	address.setStreet("Khartoum Road");
	address.setZipCode(2113l);
	return address;

    }

}
