package com.coolSchool;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coolSchool.application.persistence.dao.contract.IUserDao;
import com.coolSchool.application.persistence.domain.Address;
import com.coolSchool.application.persistence.domain.Name;
import com.coolSchool.application.persistence.domain.User;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

/**
 * Hello world!
 * 
 */
public class App {

	public static void main(String[] args) throws CoolSchoolDataAccessException {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"classpath:/spring/business-context.xml");

		IUserDao userDao = (IUserDao) appContext.getBean("userDao");

		User user = new User();
		user.setUserId("vinay.bs");

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
		userDao.save(user);

	}
}
