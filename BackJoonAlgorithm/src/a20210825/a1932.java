package a20210825;


import java.util.*;


public class a1932 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tree[][] = new int[n+1][n+1];
		int dp[][] = new int[n+1][n+1];
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				tree[i][j] = sc.nextInt();
			}
		}
		
		dp[1][1] = tree[1][1];
		
		for(int i = 2; i <= n; i++) {
			 
			for(int j = 1; j <= i; j++) {
				
				if(j == 1) {
					dp[i][j] = tree[i][j] + dp[i-1][j];
				}
				else {
					dp[i][j] = tree[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
				}
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				max = Math.max(max, dp[i][j]);
			}
		}
		
		System.out.print(max);
		
		// TODO Auto-generated method stub

	}

}
