package com.coolSchool.application.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.coolSchool.application.business.exception.CoolSchoolBusinessException;
import com.coolSchool.application.business.service.contract.IUserService;
import com.coolSchool.application.persistence.dao.contract.IUserDao;
import com.coolSchool.application.persistence.domain.User;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

@Service("userService")
public class UserService implements IUserService {

	@Autowired
	@Qualifier("userDao")
	IUserDao userDao;

	public void persistUser(User user) throws CoolSchoolBusinessException {
		try {
			userDao.save(user);
		} catch (CoolSchoolDataAccessException e) {
			throw new CoolSchoolBusinessException();
		}
	}

}
