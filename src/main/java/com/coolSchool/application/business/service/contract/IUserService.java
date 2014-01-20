package com.coolSchool.application.business.service.contract;

import com.coolSchool.application.business.exception.CoolSchoolBusinessException;
import com.coolSchool.application.persistence.domain.User;

public interface IUserService {

	public void persistUser(User user) throws CoolSchoolBusinessException;

}
