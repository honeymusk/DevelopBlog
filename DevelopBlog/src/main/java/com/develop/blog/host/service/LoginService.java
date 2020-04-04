package com.develop.blog.host.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.develop.blog.host.dao.LoginDAO;

@Service(value="loginService")
public class LoginService {
	
	@Resource(name="loginDAO")
	private LoginDAO loginDAO;
}
