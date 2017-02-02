package com.sns.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sns.board.dao.AuctionDao;
import com.sns.board.vo.Auction;
import com.sns.board.vo.Hashtag;
import com.sns.board.vo.Search;

@Service
public class AuctionService {
	
	@Autowired
	private AuctionDao auctionDao;

	public String insertAuction(Auction auction) throws Exception{
		//Auction insert
		String seq = auctionDao.insertAuction(auction);
		return seq;
	}
	
	public void insertHashtag(Hashtag hashtag) throws Exception{
		//Hashtag insert
		auctionDao.insertHashtag(hashtag);
	}
	
	// board
	public List<Auction> searchBoard(Search search) throws Exception{
		//Search Board
		return auctionDao.searchBoard(search);
	}
	
	//auction
	public List<Auction> searchAuction(Search search) throws Exception{
		//Search Board
		return auctionDao.searchAuction(search);
	}
}
