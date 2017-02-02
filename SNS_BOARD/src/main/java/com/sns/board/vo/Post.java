package com.sns.board.vo;

public class Post {
	int bno;
	String member_name;
	String bcontent;
	String attachfile;
	String pdic;
	
	
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getAttachfile() {
		return attachfile;
	}
	public void setAttachfile(String attachfile) {
		this.attachfile = attachfile;
	}
	public String getPdic() {
		return pdic;
	}
	public void setPdic(String pdic) {
		this.pdic = pdic;
	}
	
	
	
}
	
