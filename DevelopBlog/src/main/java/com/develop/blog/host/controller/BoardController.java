package com.develop.blog.host.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.develop.blog.host.service.BoardService;

@Controller
@RequestMapping("/host/board")
public class BoardController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(BoardController.class);
}
