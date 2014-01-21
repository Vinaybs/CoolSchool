package com.coolSchool.application.presentation.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.coolSchool.application.business.exception.CoolSchoolBusinessException;
import com.coolSchool.application.business.service.contract.IStudentService;
import com.coolSchool.application.presentation.controller.contract.IStudentController;
import com.coolSchool.application.presentation.value.StudentVO;

@Controller
@RequestMapping(value = "/student")
public class StudentResourceController implements IStudentController {

    private static Logger logger = Logger.getLogger(StudentResourceController.class);

    @Autowired
    IStudentService studentService;

    @RequestMapping("/renderEnrollStudentScreen")
    public ModelAndView renderEnrollStudentScreen() {
	// TODO Auto-generated method stub
	return new ModelAndView("enrollStudent", "student", new StudentVO());
    }

    @RequestMapping("/enroll")
    public ModelAndView enroll(StudentVO student) {
	logger.info("Entering method: enroll");

	logger.debug("enroll: got the student object = " + student.getMobileNumber());
	try {
	    student = studentService.enrollStudent(student);
	}
	catch (CoolSchoolBusinessException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	logger.info("Exiting method: enroll");
	return new ModelAndView("enrollStudent", "student", student);
    }

    @RequestMapping("/deleteStudent")
    public String delete() {
	// TODO Auto-generated method stub
	return null;
    }

    @RequestMapping("/updateStudentDetails")
    public String updateDetails(StudentVO student) {
	// TODO Auto-generated method stub
	return null;
    }

}
