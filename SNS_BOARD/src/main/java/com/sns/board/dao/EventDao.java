package com.sns.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.sns.board.vo.Eventlist;


@Repository
public class EventDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	
	/*public Eventlist selectEvent(Eventlist event) throws Exception{

		Eventlist evl = sqlSession.selectOne("UserinfoDao.selectEvent", event);

		return evl;
	}*/
	
	public List<Eventlist> selectEvent(Eventlist event) throws Exception{
		return sqlSession.selectList("UserinfoDao.selectEvent", event);
	}
	
}
