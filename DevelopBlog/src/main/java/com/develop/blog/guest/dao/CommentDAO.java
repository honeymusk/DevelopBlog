package com.develop.blog.guest.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value="commentDAO")
public class CommentDAO {
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;	
	
	protected final String NAMESPACE = "com.develop.blog.guest.dao.CommentDAO.";
}
