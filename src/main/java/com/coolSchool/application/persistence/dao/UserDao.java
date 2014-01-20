package com.coolSchool.application.persistence.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.coolSchool.application.persistence.dao.contract.IUserDao;
import com.coolSchool.application.persistence.domain.User;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

/**
 * This class implements the persistence logic for the User entity.
 * 
 * @author Vinay
 * 
 */
@Repository("userDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserDao implements IUserDao {

	Logger logger = Logger.getLogger(UserDao.class);

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * This API saves the user Entiry.
	 */
	public void save(User user) throws CoolSchoolDataAccessException {

		logger.info("Entering method: save");

		getSession().saveOrUpdate(user);
		logger.info("Exiting method: save");
	}

	public User findUserById(Long userId) throws CoolSchoolDataAccessException {
		logger.info("Entering method: findUserById");
		return (User) getSession().createCriteria(User.class)
				.add(Restrictions.idEq(userId)).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<User> findUsersByFirstName(String firstName)
			throws CoolSchoolDataAccessException {
		List<User> users = getSession().createCriteria(User.class)
				.add(Restrictions.eq("name.firstName", firstName)).list();
		return users;
	}

	public List<User> findUsersBySurName(String surName)
			throws CoolSchoolDataAccessException {

		@SuppressWarnings("unchecked")
		List<User> users = getSession().createCriteria(User.class)
				.add(Restrictions.eq("name.surName", surName)).list();
		return users;
	}

}
