package com.develop.blog.guest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.develop.blog.guest.dao.ViewDAO;

@Service(value="viewService")
public class ViewService {
	
	@Resource(name="viewDAO")
	private ViewDAO viewDAO;
	
	/**
	 * @author 김현재
	 * @since 2020.04.04	
	 */	
	public boolean testDbConnection() throws Exception {		
		return viewDAO.testDbConnection();
	}
}
