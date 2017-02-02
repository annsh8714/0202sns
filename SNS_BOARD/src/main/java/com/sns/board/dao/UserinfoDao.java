package com.sns.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import com.sns.board.vo.Eventlist;
import com.sns.board.vo.Userinfo;

@Repository
public class UserinfoDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	
	public Userinfo selectUserinfo(String member_name) throws Exception{

		Userinfo user = sqlSession.selectOne("UserinfoDao.selectUserinfo", member_name);

		return user;
	}
	
	public void updateUserinfo(Userinfo userinfo) throws Exception{
		sqlSession.update("UserinfoDao.updateUserinfo", userinfo);
	}
	
	public Userinfo selectSetinfo(Userinfo userinfo) throws Exception{

		Userinfo user = sqlSession.selectOne("UserinfoDao.selectSetinfo", userinfo);

		return user;
	}
	
	public void updateSetinfo(Userinfo userinfo) throws Exception{
		sqlSession.update("UserinfoDao.updateSetinfo", userinfo);
	}
	
	
	

}
