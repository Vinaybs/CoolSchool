package com.coolSchool.application.business.service;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.coolSchool.application.business.exception.CoolSchoolBusinessException;
import com.coolSchool.application.business.service.contract.IStudentService;
import com.coolSchool.application.persistence.dao.contract.IStudentDao;
import com.coolSchool.application.persistence.domain.Student;
import com.coolSchool.application.persistence.exception.CoolSchoolDataAccessException;
import com.coolSchool.application.presentation.value.StudentVO;

@Service("studentService")
@Transactional(propagation = Propagation.REQUIRED)
public class StudentService implements IStudentService {

    @Autowired
    private Mapper beanMapper;

    @Autowired
    private IStudentDao studentDao;

    @Override
    public StudentVO enrollStudent(StudentVO studentVO) throws CoolSchoolBusinessException {
	Student student = beanMapper.map(studentVO, Student.class);

	StudentVO savedStudentVO = null;
	try {
	    Student savedStudent = studentDao.save(student);
	    if (savedStudent != null) {
		savedStudentVO = beanMapper.map(savedStudent, StudentVO.class);
	    }
	}
	catch (CoolSchoolDataAccessException e) {
	    e.printStackTrace();
	}

	return savedStudentVO;
    }

}
