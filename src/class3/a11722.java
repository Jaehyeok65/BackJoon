package class3;


import java.util.*;


public class a11722 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int dp[] = new int[n];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			
			dp[i] = 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] < arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		for(int i = 0; i < dp.length; i++) {
			max = max > dp[i] ? max : dp[i];
		}
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}
