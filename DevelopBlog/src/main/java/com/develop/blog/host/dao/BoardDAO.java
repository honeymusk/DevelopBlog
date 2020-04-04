package com.develop.blog.host.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value="boardDAO")
public class BoardDAO {
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;	
	
	protected final String NAMESPACE = "com.develop.blog.host.dao.BoardDAO.";
}
