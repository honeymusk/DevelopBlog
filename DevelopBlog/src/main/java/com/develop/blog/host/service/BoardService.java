package com.develop.blog.host.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.develop.blog.host.dao.BoardDAO;

@Service(value="boardService")
public class BoardService {
	
	@Resource(name="boardDAO")
	private BoardDAO boardDAO;
}
