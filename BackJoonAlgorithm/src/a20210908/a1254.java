package a20210908;

import java.util.*;


public class a1254 {
	
	static boolean ispalin(String s) {
		
		StringBuilder sb = new StringBuilder(s);   //reverse 함수를 사용하기 위한 StringBuilder 선언
		
		if(sb.toString().equals(sb.reverse().toString())) {  // 팰린드론수인지 확인
			return true;
		}
		
		return false;
	}
	

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean check = false;
		int len = s.length();
		for(int i = 0; i < s.length(); i++) {
			
			if(ispalin(s.substring(i))) {  //앞에서 부터 문자열을 잘라서 남은 문자열이 팰린드론수이면 true 리턴
				len += i;                  //남은 문자열이 팰린드론수라면 잘린 문자열만 추가해주면 팰린드론수이기 때문
				check = true;
				break;
			}
		}
		
		if(!check) {      //반복문이 끝나도 팰린드론수가 아니라면 문자열을 역순으로 추가해주면 팰린드론수가 됨
			len = len * 2;
		}
		
		System.out.print(len);
		

		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
