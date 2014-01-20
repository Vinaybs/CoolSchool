package com.coolSchool.application.presentation.controller.contract;

import org.springframework.web.servlet.ModelAndView;

import com.coolSchool.application.presentation.value.UserVO;

/**
 * This interface defines the methods to
 * 
 * @author dev
 * 
 */
public interface IUserResourceController {
	public String registerUser(UserVO userVO);

	public String confirmUser(UserVO userVO);

	public ModelAndView renderRegisterScreen();
}
