package a20210909;

import java.util.*;



public class a16194 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   //구하고자 하는 카드의 개수를 초기화함
		
		int card[] = new int[n+1];  //카드 배열을 선언함
		int dp[] = new int[n+1];    //각 카드 개수의 최솟값을 저장할 배열을 선언
		
		for(int i = 1; i <= n; i++) {  //배열을 초기화함
			card[i] = sc.nextInt();  
			dp[i] = Integer.MAX_VALUE;  //최솟값을 구해야하기 때문에 각 배열의 값을 최댓값으로 초기화시킴
		}
		
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				dp[i] = Math.min(dp[i], dp[i-j] + card[j]);  //dp배열에 카드를 구매하는데 필요한 최솟값을 구함.
			}
		}
		
		System.out.print(dp[n]);  //결과 출력
		
		// TODO Auto-generated method stub

	}

}
