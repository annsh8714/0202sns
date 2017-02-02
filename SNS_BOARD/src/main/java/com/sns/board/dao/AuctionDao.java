package com.sns.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sns.board.vo.Auction;
import com.sns.board.vo.Hashtag;
import com.sns.board.vo.Search;

@Repository
public class AuctionDao{
	
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public String insertAuction(Auction auction) throws Exception{
		System.out.println(auction.getUno());
		System.out.println(auction.getAcontent());
		System.out.println(auction.getAno());
		sqlSession.insert("AuctionDao.insertAuction", auction);
		
		String ano = auction.getAno();
		System.out.println("ano ::::" + ano);
		return ano;
		
	}
	
	public int insertHashtag(Hashtag hashtag) throws Exception{

		return sqlSession.insert("AuctionDao.insertHashtag", hashtag);
	}

	public List<Auction> searchAuction(Search search) throws Exception{
		return sqlSession.selectList("AuctionDao.searchAuction", search);
	}
	
	public List<Auction> searchBoard(Search search) throws Exception{
		return sqlSession.selectList("AuctionDao.searchBoard", search);
	}
}
