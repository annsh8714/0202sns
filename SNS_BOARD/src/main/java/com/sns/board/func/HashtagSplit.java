package com.sns.board.func;

import java.util.ArrayList;

public class HashtagSplit {
	
	public static ArrayList<String> splitHash(String str) {

		System.out.println(str);
		
		ArrayList<String> rtnList = new ArrayList<String>();
		ArrayList<String> finrtn = new ArrayList<String>();
		
		String [] tmpstr = str.split(" ");
		
		for(int i = 0; i < tmpstr.length; i++) {
			if (tmpstr[i].contains("#")) {
				rtnList.add(tmpstr[i]);
			}
		}
		System.out.println("asd" + rtnList.toString());
		
		for( int j = 0; j < rtnList.size(); j++){
			String in = rtnList.get(j).toString();
			
			int pos = in.indexOf("#");
		
				in = in.substring(pos+1, in.length());
				rtnList.set(j, in);
		}
		System.out.println("asd" + rtnList.toString());
	
		for (int l = 0; l < rtnList.size(); l++) {
			
				String temp = rtnList.get(l);
				String [] temprtn = temp.split("#");
				
				for (int o = 0; o < temprtn.length; o++){
					finrtn.add(temprtn[o]);
			}
		}
		System.out.println("fin" + finrtn.toString());

		return finrtn;
	}
}
