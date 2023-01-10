package com.mhj.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	public void init() {
		sb.replace()
		
		String datas = sb.toString();
		StringTokenizer st = new StringTokenizer(datas, "-");
	}
		
}
