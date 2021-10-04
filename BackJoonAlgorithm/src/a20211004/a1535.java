package a20211004;


import java.util.*;


public class a1535 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int happy[] = new int[n+1];
		int weight[] = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			weight[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			happy[i] = sc.nextInt();
		}
		
		int dp[][] = new int[n+1][101];
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 100; j > 0; j--) {
				if(j - weight[i] > 0) {
					dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + happy[i]);
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.print(dp[n][100]);
		
		// TODO Auto-generated method stub

	}

}
