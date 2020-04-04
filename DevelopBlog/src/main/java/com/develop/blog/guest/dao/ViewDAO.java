package com.develop.blog.guest.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value="viewDAO")
public class ViewDAO {
	
	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;	
	
	protected final String NAMESPACE = "com.develop.blog.guest.dao.ViewDAO.";
	
	/**
	 * @author 김현재
	 * @since 2020.04.04	
	 */	
	public boolean testDbConnection() throws Exception {
		int result = sqlSession.selectOne(NAMESPACE + "testDbConnection");
		if(result == 1)
			return true;
		return false;
	}
	
}
