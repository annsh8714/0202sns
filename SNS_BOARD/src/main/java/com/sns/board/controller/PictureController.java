package com.sns.board.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.sns.board.service.PictureService;
import com.sns.board.vo.Picture;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PictureController {
	
	private static final Logger logger = LoggerFactory.getLogger(PictureController.class);
	
	@Autowired
	PictureService pictureService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
/*	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	
		return "home";
	}*/
	
	
	@RequestMapping(value = "/Ex2")
	public String picc(Locale locale, Model model) {
	
		return "Ex2";
	}
	
	@RequestMapping(value = "/Ex1")
	public String piccc(Picture picture, HttpServletRequest request) throws Exception {

		MultipartFile m = picture.getFile();

		if (!m.isEmpty()){
			String orgname = m.getOriginalFilename();

			String ext = orgname.substring(orgname.lastIndexOf(".")+1);
			System.out.println("ext : " + ext);
			
			
			
			Picture getPno = new Picture();
			getPno = pictureService.getSeq();
			String pno = getPno.getpno();
//			String pno = "test";
			String newname = pno +"."+ ext;
			String path = request.getSession().getServletContext().getRealPath("/img/upload");
			System.out.println("path : " + path);
			File file = new File(path + File.separator + newname);
			picture.setOrgname(orgname);
			picture.setNewname(newname);
			m.transferTo(file);
			
			 //picture db insert
			Picture insPic = new Picture();
			insPic.setpno(pno);
			insPic.setpdic(path + File.separator + newname);
			insPic.setpsize(String.valueOf(m.getSize()));
			insPic.setpext(ext);
			pictureService.insertPicture(insPic);
		}
		
		return "Ex1";
	}
}