package com.develop.blog.guest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.develop.blog.guest.dao.CommentDAO;

@Service(value="commentService")
public class CommentService {
	
	@Resource(name="commentDAO")
	private CommentDAO commentDAO;
}
