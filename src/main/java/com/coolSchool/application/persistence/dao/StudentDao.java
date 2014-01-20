package com.coolSchool.application.persistence.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.coolSchool.application.persistence.dao.contract.IStudentDao;
import com.coolSchool.application.persistence.domain.Student;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

public class StudentDao implements IStudentDao{

	Logger logger = Logger.getLogger(StudentDao.class);

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * This API saves the user Entiry.
	 */
	public void save(Student student) throws CoolSchoolDataAccessException {

		logger.info("Entering method: save");

		getSession().saveOrUpdate(student);
		logger.info("Exiting method: save");
	}

}
