package com.sns.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.board.dao.UserinfoDao;
import com.sns.board.vo.Userinfo;

@Service
public class UserinfoService {
	
	@Autowired
	private UserinfoDao userinfoDao;
	
	
	public Userinfo selectUserinfo(String member_name) throws Exception{
		Userinfo userinfo=userinfoDao.selectUserinfo(member_name);
		return userinfo;
	}
	
	public void updateUserinfo(Userinfo userinfo) throws Exception{
		userinfoDao.updateUserinfo(userinfo);
	}
	
	public Userinfo selectSetinfo(Userinfo userinfo) throws Exception{
		Userinfo usif=userinfoDao.selectSetinfo(userinfo);
		return usif;
	}
	
	public void updateSetinfo(Userinfo userinfo) throws Exception{
		userinfoDao.updateSetinfo(userinfo);
	}
	
}
