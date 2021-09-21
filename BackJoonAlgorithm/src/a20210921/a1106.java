package a20210921;


import java.util.*;


public class a1106 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int n = sc.nextInt();
		
		
		int dp[] = new int[C+101];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		for(int i = 0; i < n; i++) {
			int cost = sc.nextInt();
			int peo = sc.nextInt();
			for(int j = peo; j <= C+100; j++) {
				int prev = dp[j-peo];
				if(prev != Integer.MAX_VALUE) {
					dp[j] = Math.min(dp[j], cost + prev);
				}
				
			}
		}
		int result = Integer.MAX_VALUE;
		for(int i = C; i <= C+100; i++) {
			result = Math.min(result, dp[i]);
		}
		
		System.out.print(result);
		// TODO Auto-generated method stub

	}

}
