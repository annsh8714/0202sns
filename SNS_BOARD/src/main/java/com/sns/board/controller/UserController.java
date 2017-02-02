package com.sns.board.controller;

import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sns.board.service.BoardService;
import com.sns.board.service.CommentService;
import com.sns.board.service.EventService;
import com.sns.board.service.UserinfoService;
import com.sns.board.vo.Board;
import com.sns.board.vo.Comment;
import com.sns.board.vo.Post;
import com.sns.board.vo.Userinfo;
import com.sns.board.vo.Eventlist;


/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	@Autowired
	UserinfoService userinfoService;
	
	@Autowired
	EventService eventService;
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	CommentService commentService;
	
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping("/select")
	public String getUserinfo(Locale locale, Model model, HttpServletRequest request) throws Exception {
		System.out.println("select controller");
		String uname=request.getParameter("member_name");
		model.addAttribute("userinfo", userinfoService.selectUserinfo(uname));
		return "userinfo/Profile_Information";
	}
	
	@RequestMapping("/modifying")
	public String getUserinfo_mo(Locale locale, Model model, HttpServletRequest request) throws Exception {
		String uname=request.getParameter("member_name");
		model.addAttribute("userinfo", userinfoService.selectUserinfo(uname));
		return "userinfo/Userinfo_Modify";
	}
	
	@RequestMapping("/complete")
	public String update(Userinfo userinfo,  Model model) throws Exception{
		userinfoService.updateUserinfo(userinfo);
		return "redirect:/select?member_name="+userinfo.getMember_name();
	
	}
	
	@RequestMapping("/getevent")
	public String getEvent(Locale locale, Model model, Eventlist event) throws Exception {
		model.addAttribute("event", eventService.selectEvent(event));
		return "userinfo/Event";
		
	}
	
	@RequestMapping("/getsetting")
	public String getSetting(Locale locale, Model model, Userinfo userinfo) throws Exception {
		model.addAttribute("userinfo", userinfoService.selectSetinfo(userinfo));
		return "userinfo/Setting";
	}
	
	@RequestMapping("/setmodi")
	public String getSetting_mo(Locale locale, Model model, Userinfo userinfo) throws Exception {
		model.addAttribute("userinfo", userinfoService.selectSetinfo(userinfo));
		return "userinfo/Setting_Modify";
	}
		
	@RequestMapping("/setcom")
	public String Setupdate(Userinfo userinfo,  Model model) throws Exception{
		userinfoService.updateSetinfo(userinfo);
		model.addAttribute("userinfo",userinfoService.selectSetinfo(userinfo));
		return "userinfo/Setting";
	
	}
	
	@RequestMapping("/getpost")
	public String getPost(Locale locale, Model model, Post post, Comment comment, HttpServletRequest request) throws Exception {
		System.out.println(request.getParameter("bno"));
		
		model.addAttribute("post", boardService.selectPost(post));
		List<Post> postlist=boardService.selectPost(post);
		
		
		model.addAttribute("comment", commentService.selectComment(comment));
		List<Comment> commentlist=commentService.selectComment(comment);
		return "userinfo/Boardview";
	}
	
	@RequestMapping("/reply")
	public String insertComment(Model model,Comment comment, Post post,HttpServletRequest request) throws Exception {
		String userno=request.getParameter("uno");
		comment.setUno(Integer.parseInt(userno));
		String boardno=request.getParameter("bno");
		comment.setPostno(Integer.parseInt(boardno));
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = dayTime.format(new Date(time));		
		comment.setWritedate(str);
		
		commentService.insertComment(comment);
		model.addAttribute("post", boardService.selectPost(post));
		List<Post> postlist=boardService.selectPost(post);
		
		model.addAttribute("comment", commentService.selectComment(comment));
		List<Comment> commentlist=commentService.selectComment(comment);
		return "userinfo/Boardview";
	}
	
	

	
}
