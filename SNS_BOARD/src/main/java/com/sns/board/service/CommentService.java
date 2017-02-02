package com.sns.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;









import com.sns.board.dao.CommentDao;
import com.sns.board.vo.Comment;



@Service
public class CommentService {
	
	@Autowired
	private CommentDao commentDao;
	
	
	public List<Comment> selectComment(Comment comment) throws Exception{
		List<Comment> cmt=commentDao.selectComment(comment);
		return cmt;
	}
	public void insertComment(Comment comment) throws Exception{
		commentDao.insertComment(comment);

	}
	
}
