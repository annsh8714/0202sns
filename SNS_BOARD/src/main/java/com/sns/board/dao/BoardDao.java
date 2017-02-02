package com.sns.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;







import com.sns.board.vo.Post;



@Repository
public class BoardDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	
	/*public Eventlist selectEvent(Eventlist event) throws Exception{

		Eventlist evl = sqlSession.selectOne("UserinfoDao.selectEvent", event);

		return evl;
	}*/
	
	public List<Post> selectPost(Post post) throws Exception{
		return sqlSession.selectList("UserinfoDao.selectPost", post);
	}
	
}
