package com.develop.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DevelopBlogPathController {
	
	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(DevelopBlogPathController.class);
	
	/**
	 * @author 김현재
	 * @since 2020.04.04
	 * @brief path
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String pathGET() throws Exception{
		return "redirect:/guest/view/main";
	}
}
