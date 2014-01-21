package com.coolSchool.application.business.service.contract;

import com.coolSchool.application.business.exception.CoolSchoolBusinessException;
import com.coolSchool.application.presentation.value.StudentVO;

public interface IStudentService {

    public StudentVO enrollStudent(StudentVO studentVO) throws CoolSchoolBusinessException;

}
