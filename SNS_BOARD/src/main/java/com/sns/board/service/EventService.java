package com.sns.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sns.board.dao.EventDao;
import com.sns.board.vo.Eventlist;



@Service
public class EventService {
	
	@Autowired
	private EventDao eventDao;
	
	/*public Eventlist selectEvent(Eventlist event) throws Exception{
		Eventlist evl=eventDao.selectEvent(event);
		return evl;
	}*/
	
	public List<Eventlist> selectEvent(Eventlist event) throws Exception{
		List<Eventlist> evt=eventDao.selectEvent(event);
		return evt;
	}
	
}
