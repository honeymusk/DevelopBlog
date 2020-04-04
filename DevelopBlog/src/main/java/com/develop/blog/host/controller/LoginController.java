package com.develop.blog.host.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.develop.blog.host.service.LoginService;

@Controller
@RequestMapping("/host/login")
public class LoginController {
	
	@Resource(name="loginService")
	private LoginService loginService;
	
	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
}
