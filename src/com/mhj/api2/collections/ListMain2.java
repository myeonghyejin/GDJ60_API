package com.mhj.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		
		int [] arr = new int [3];
		ArrayList ar = new ArrayList();
		//다형성
		//Integer num1 = 
		ar.add(1);		//Auto-Boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		int n1 = (Integer)ar.get(0);
		double n2 = (double)ar.get(1);
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}

}
