package com.develop.blog.guest.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.develop.blog.guest.service.CommentService;

@Controller
@RequestMapping("/guest/comment")
public class CommentController {
	
	@Resource(name="commentService")
	private CommentService commentService;
	
	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(CommentController.class);
}
