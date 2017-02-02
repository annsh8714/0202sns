package com.sns.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;









import com.sns.board.vo.Comment;



@Repository
public class CommentDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public List<Comment> selectComment(Comment comment) throws Exception{
		return sqlSession.selectList("UserinfoDao.selectComment", comment);
	}
	
	public int insertComment(Comment comment) throws Exception{
		return sqlSession.insert("UserinfoDao.insertComment", comment);
	}
}
