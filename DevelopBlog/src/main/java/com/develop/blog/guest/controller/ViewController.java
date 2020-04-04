package com.develop.blog.guest.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.develop.blog.guest.service.ViewService;

@Controller
@RequestMapping("/guest/view")
public class ViewController {
	
	@Resource(name="viewService")
	private ViewService viewService;
	
	private Logger logger = LoggerFactory.getLogger(ViewController.class);
	
	/**
	 * @author 김현재
	 * @since 2020.04.04
	 * @brief DB Connection 테스트 및 main.jsp 페이지 이동
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainGET() throws Exception{
		logger.info("guest/view/main : GET");
		
		if(viewService.testDbConnection())
			logger.info("DB Connect Success");
		return "/main";
	}
}
