package a20210827;

import java.util.*;



public class a1748 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int count = 1; // 자릿수
		int result = 0; //결과값
		int num = 10;
		
		
		for(int i = 1; i <= n; i++) {
			
			if(i / num == 1) {   //자릿수가 증가할 때 count(자릿수 변수) 하나씩 증가시킴
				count++;
				num = num * 10;
			}
			
			result += count;
		}
		
		System.out.print(result);
		
		
		// TODO Auto-generated method stub

	}

}
