package com.coolSchool.application.persistence.dao.contract;

import com.coolSchool.application.persistence.domain.Student;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;

public interface IStudentDao {
	public Student save(Student student) throws CoolSchoolDataAccessException;
}
