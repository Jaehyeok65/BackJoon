package class3;


import java.util.*;


public class a11726b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int dp[] = new int[n+2];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		if(n >= 3) {
		for(int i = 3; i <= n; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
			
		}
		}
		System.out.print(dp[n]);
		// TODO Auto-generated method stub

	}

}
