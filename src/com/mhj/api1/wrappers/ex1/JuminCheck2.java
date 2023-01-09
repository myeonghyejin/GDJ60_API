package com.mhj.api1.wrappers.ex1;

public class JuminCheck2 {
	
	//check
	//주민번호를 받아서
	//980724-1234567
	//맨 끝자리는 체크용 번호로 뺌
	//	9	8	0	7	2	4	-	1	2	3	4	5	6
	//	2	3	4	5	6	7		8	9	2	3	4	5
	//	18	24	0	35	12	28		8	18	6	12	20	30
	//합이 211, 합을 11로 나누어서 나머지를 구함
	//211/11 = 몫: , 나머지:
	//나머지 값을 11로 뺀 결과값과 체크용 번호랑 같은지 확인
	//11로 뺀 결과값이 두 자리면 11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	
	public void check (String jumin) {
		
		int num = 2;
		int sum = 0;
		
		for(int i=0;i<(jumin.length())-1;i++) {
			if(i==6) {
				continue;
			}
//			sum = sum + Integer.parseInt(jumin.substring(i,i+1))*num;
			sum = sum + Integer.parseInt(String.valueOf(jumin.charAt(i)))*num;
			num++;
			
			if (num>9) {
				num = 2;
			}
		}
		
		int result = 11-(sum%11);
		
		if (result>9) {
			result = result%10;
		}
		
		int flag = Integer.parseInt(jumin.substring(13));
		
		if(flag == result) {
			System.out.println("정상");
		} else {
			System.out.println("비정상");
		}
		
	}

	private String valueOf(char charAt) {
		// TODO Auto-generated method stub
		return null;
	}

}
