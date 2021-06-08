package class2;


import java.util.*;


public class a1010 {
	
	static int combi(int n, int m) {
		
		int dp[][] = new int[30][30];
		
		if(dp[n][m] > 0) {
			return dp[n][m];
		}
		if(n == m || m == 0) {
			return dp[n][m] = 1;
		}
		else {
			return dp[n][m] = combi(n-1,m-1) + combi(n-1,m);
		}
	
	
	}
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T = sc.nextInt();
		
		while(T --> 0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			sb.append(combi(m,n)+"\n");
			
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
