package com.sns.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.board.dao.PictureDao;
import com.sns.board.vo.Picture;

@Service
public class PictureService{
	
	@Autowired
	private PictureDao pictureDao;

	public List<Picture> getAllList() throws Exception{
		
		List<Picture>rtnList = pictureDao.selectList();
		
		return rtnList;
	}
	public Picture getSeq() throws Exception{
			
			Picture rtnList = pictureDao.selectSeq();
			
			return rtnList;
	}
	
	public void insertPicture(Picture picture) throws Exception{

		pictureDao.insertPicture(picture);
	}
}
