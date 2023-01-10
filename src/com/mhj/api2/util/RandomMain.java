package com.mhj.api2.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {

		Random random = new Random();
		
		//1000원 로또 구매 1~45 번호 6개를 랜덤하게 추출
		//중복 제거
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(random.nextInt(45)+1);
		
		Iterator<Integer> it = hs.iterator();
		
		while (it.hasNext()) {
			Integer sum = it.next();
			System.out.println(sum);
		}

	}

}
