package class3;


import java.util.*;


public class a11727 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int dp[] = new int[n+1]; //1x2, 2x1타일만 써서 해결할 수 있는 경우
		dp[0] = 1;
		dp[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-2] + dp[i-1] + dp[i-2];
			dp[i] %= 10007;
		}
		
		System.out.print(dp[n]);
		// TODO Auto-generated method stub

	}

}
