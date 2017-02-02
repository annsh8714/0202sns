package com.sns.board.vo;

import org.springframework.web.multipart.MultipartFile;

public class Picture {
	String	pno;
	String 	pdic;
	String 	psize;
	String 	pext;
	String orgname;
	String newname;
	MultipartFile file;

	
	public Picture() {
		// TODO Auto-generated constructor stub
	}
	// setter getter method �븳 踰덉뿉 �옉�꽦 ? alt + shift + s -> r

	public String getpno() {
		return pno;
	}

	public void setpno(String pno) {
		this.pno = pno;
	}
	
	public String getpdic() {
		return pdic;
	}

	public void setpdic(String pdic) {
		this.pdic = pdic;
	}
	
	public String getpsize() {
		return psize;
	}

	public void setpsize(String psize) {
		this.psize = psize;
	}
	
	public String getpext() {
		return pext;
	}

	public void setpext(String pext) {
		this.pext = pext;
	}
	
	public String getOrgname(){
		return orgname;
	}
	
	public void setOrgname(String orgname){
		this.orgname = orgname;
	}
	
	public String getNewname(){
		return newname;
	}
	
	public void setNewname(String newname){
		this.newname = newname;
	}
	
	public MultipartFile getFile(){
		return file;
	}
	
	public void setFile(MultipartFile file){
		this.file = file;
	}
}
