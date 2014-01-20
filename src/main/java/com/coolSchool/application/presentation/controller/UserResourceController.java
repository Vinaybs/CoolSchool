package com.coolSchool.application.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coolSchool.application.presentation.controller.contract.IUserResourceController;
import com.coolSchool.application.presentation.value.UserVO;

@Controller
@RequestMapping(value = "/user")
public class UserResourceController implements IUserResourceController {

	@RequestMapping(value = "/register")
	public String registerUser(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public String confirmUser(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/renderRegisterScreen")
	public ModelAndView renderRegisterScreen() {

		return new ModelAndView("register", "user", new UserVO());
	}

}
