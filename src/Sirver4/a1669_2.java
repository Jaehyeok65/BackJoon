package Sirver4;


import java.util.*;


public class a1669_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] dp = new int[N+1];
		dp[1] = 1;
		for(int i = 2; i < N+1; i++) {
			dp[i] = i;
			for(int j = 1; j*j <= i; j++)
				dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
		}
		
		System.out.println(dp[N]);
		// TODO Auto-generated method stub

	}

}
