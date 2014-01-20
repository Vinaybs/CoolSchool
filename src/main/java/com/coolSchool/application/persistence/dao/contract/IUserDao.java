package com.coolSchool.application.persistence.dao.contract;

import java.util.List;

import com.coolSchool.application.persistence.domain.User;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

public interface IUserDao {

	public void save(User user) throws CoolSchoolDataAccessException;

	public User findUserById(Long userId) throws CoolSchoolDataAccessException;

	public List<User> findUsersByFirstName(String firstName)
			throws CoolSchoolDataAccessException;

	public List<User> findUsersBySurName(String surName)
			throws CoolSchoolDataAccessException;

}
