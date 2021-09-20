package a20210920;


import java.util.*;


public class a9465 {
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		
		while(t --> 0) {
			
			int n = sc.nextInt();
			int arr[][] = new int[2][n+1];
			int dp[][] = new int[2][n+1];
			
			for(int i = 0; i < 2; i++) {
				for(int j = 1; j <= n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			dp[0][0] = arr[0][0];
			dp[1][0] = arr[1][0];
			dp[0][1] = arr[0][1];
			dp[1][1] = arr[1][1];
			
			for(int i = 2; i <= n; i++) {
				dp[0][i] = Math.max(dp[1][i-2], dp[1][i-1]) + arr[0][i];
				dp[1][i] = Math.max(dp[0][i-2], dp[0][i-1]) + arr[1][i];
			}
			
			int max = Math.max(dp[0][n], dp[1][n]);
			sb.append(max + "\n");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
