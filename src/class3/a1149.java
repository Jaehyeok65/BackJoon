package class3;


import java.util.*;


public class a1149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		
		int R[] = new int[Test];
		int G[] = new int[Test];
		int B[] = new int[Test];
		
		int dp[] = new int[Test];
		
		for(int i = 0; i < Test; i++) {
			R[i] = sc.nextInt();
			G[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
		dp[0] = Math.min(Math.min(R[0], G[0]), B[0]);
		if(dp[0] == R[0]) {
			dp[1] = Math.min(G[1], B[1]) + dp[0];
		}
		else if(dp[0] == G[0]) {
			dp[1] = Math.min(R[1], B[1]) + dp[0];
		}
		else if(dp[0] == B[0]) {
			dp[1] = Math.min(R[1], G[1]) + dp[0];
		}
		
		// TODO Auto-generated method stub

	}

}
