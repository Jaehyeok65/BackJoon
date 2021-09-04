package a20210905;


import java.util.*;



public class a11052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   //구매하고자 하는 카드의 개수
		
		int p[] = new int[n+1];   //카드팩의 가격을 저장하는 배열
		
		for(int i = 1; i <= n; i++) {
			p[i] = sc.nextInt();
		}
		
		int dp[] = new int[n+1];   //가격의 최대값을 저장하기 위한 dp배열
		
		dp[0] = 0; //0개까지의 최대값 : 0
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				dp[i] = Math.max(dp[i], dp[i-j] + p[j]);  // 반복문을 통해 현재까지의 최대값(dp)를 구함
			}
		}
		
		System.out.print(dp[n]);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
