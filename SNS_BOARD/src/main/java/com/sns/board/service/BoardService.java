package com.sns.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.sns.board.dao.BoardDao;
import com.sns.board.vo.Post;



@Service
public class BoardService {
	
	@Autowired
	private BoardDao boardDao;
	
	
	public List<Post> selectPost(Post post) throws Exception{
		List<Post> pst=boardDao.selectPost(post);
		return pst;
	}
	
}
