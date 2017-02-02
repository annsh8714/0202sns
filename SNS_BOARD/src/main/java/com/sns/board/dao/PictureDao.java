package com.sns.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.board.vo.Picture;

@Repository
public class PictureDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public List<Picture> selectList() throws Exception{
			return sqlSession.selectList("PictureDao.selectAllList");
	}
	
	public Picture selectSeq() throws Exception{
		return sqlSession.selectOne("PictureDao.selectSeq");
    }
	
	public Picture selectPno(int pno) throws Exception{
			return sqlSession.selectOne("PictureDao.selectpno", pno);
	}

	public int insertPicture(Picture picture) throws Exception{
			return sqlSession.insert("PictureDao.insertPicture", picture);
	}
	
	public Picture selectPictureInfo(Picture picture) throws Exception{
		System.out.println("Dao:"+picture.getpno());
		System.out.println("Dao:"+picture.getpdic());
		System.out.println("Dao:"+picture.getpsize());
		System.out.println("Dao:"+picture.getpext());
		
		return sqlSession.selectOne("PictureDao.selectPicture", picture);
	}
}
