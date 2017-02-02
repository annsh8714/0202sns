package com.sns.board.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sns.board.func.HashtagSplit;
import com.sns.board.service.AuctionService;
import com.sns.board.vo.Auction;
import com.sns.board.vo.Hashtag;
import com.sns.board.vo.Search;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AuctionController {
	
	@Autowired
	AuctionService auctionService;
	
	private static final Logger logger = LoggerFactory.getLogger(AuctionController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping("/home")
	public String main_v(Locale locale, Model model) throws Exception {
		
		return "home";
	}
	
	@RequestMapping("/insert")
	public String insertAuction(Auction auction) throws Exception {
		
		auction.setUno(1);
		System.out.println(auction.getUno());
		System.out.println(auction.getAcontent());
		
		
		
		String seq = auctionService.insertAuction(auction);

		String cont = auction.getAcontent();
		HashtagSplit sp = new HashtagSplit();
		ArrayList<String> rtn = sp.splitHash(cont);
		
		for(int i = 0; i<rtn.size(); i++){
			Hashtag hs = new Hashtag();
			if ( rtn.get(i).trim().length() > 0  ){
				hs.setHtagcom(rtn.get(i));
				hs.setBno(seq);
				auctionService.insertHashtag(hs);
			}
			else continue;
		}
		return "home";
	}
	
	@RequestMapping("/search")
	public String searchKeyword(Search search, Model model) throws Exception {
		System.out.println("getBoardfield ::::" + search.getBoardfield());
		System.out.println("getKeyfield ::::" + search.getKeyfield());
		System.out.println("getKeyword ::::" + search.getKeyword());
		
		String boardField = search.getBoardfield();
		
		List<Auction> rstAuction = new ArrayList<Auction>();
		
		if ( boardField.equals("auction"))  rstAuction = auctionService.searchAuction(search);
//		else if ( boardField.equals("board")) rstAuction = auctionService.searchBoard(search); // board service
//		else if ( boardField.equals("allcont")) // board & auction 
		
		model.addAttribute("auctionList", rstAuction);
		
		return "home";
	}
}
