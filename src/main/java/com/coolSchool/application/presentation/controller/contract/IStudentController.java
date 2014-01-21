package com.coolSchool.application.presentation.controller.contract;

import org.springframework.web.servlet.ModelAndView;
import com.coolSchool.application.presentation.value.StudentVO;

public interface IStudentController {

    public ModelAndView renderEnrollStudentScreen();

    public ModelAndView enroll(StudentVO student);

    public String delete();

    public String updateDetails(StudentVO student);

}
