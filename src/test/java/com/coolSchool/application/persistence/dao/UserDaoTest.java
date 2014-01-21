package com.coolSchool.application.persistence.dao;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.coolSchool.application.persistence.dao.contract.IUserDao;
import com.coolSchool.application.persistence.domain.Address;
import com.coolSchool.application.persistence.domain.Name;
import com.coolSchool.application.persistence.domain.User;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/test-coolSchool-context.xml" })
public class UserDaoTest {

	@Autowired
	@Qualifier("userDao")
	private IUserDao userDao;

	private User user;

	@Before
	public void setUp() {

		user = new User();
		user.setUserId("test.user");

		Name name = new Name();

		name.setFirstName("Vinay");
		name.setSurName("Bathalu Shivakumar");

		user.setName(name);

		Address address = new Address();
		address.setUnit("18/48");
		address.setStreet("Khartoum Rd");
		address.setRegion("Macquarie Park");
		address.setCity("Sydney");
		address.setZipCode(2113l);
		address.setCountry("Australia");
		user.getUserAddresses().add(address);
	}

	@Test
	public void test_save_positive() {
		try {
			userDao.save(user);
		} catch (CoolSchoolDataAccessException e) {
			Assert.fail(e.getLocalizedMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_save_negitive() throws CoolSchoolDataAccessException {
		userDao.save(null);
	}

	//@Test
	public void test_findUserById() throws CoolSchoolDataAccessException {

		User user = userDao.findUserById(1l);

		Assert.assertNotNull(user);
	}

	@Test
	public void test_findUserByFirstName() throws CoolSchoolDataAccessException {
		Assert.assertNotNull(userDao.findUsersByFirstName("Vinay"));
	}

	@Test
	public void test_findUserBySurName() throws CoolSchoolDataAccessException {
		Assert.assertNotNull(userDao.findUsersBySurName("Bathalu Shivakumar"));
	}
}
