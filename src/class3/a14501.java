package class3;


import java.util.*;


public class a14501 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int t[] = new int[n+10];
		int p[] = new int[n+10];
		int dp[] = new int[n+10];
	
		for(int i = 0; i < n; i++) { //스캐너를 통해 제시된 문제의 값을 입력받음.
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(i + t[i] <= n) {
			dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i] + p[i]);
			}
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}
		
		System.out.print(dp[n]);
		
		// TODO Auto-generated method stub

	}

}
