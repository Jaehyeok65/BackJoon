package class3;


import java.util.*;


public class a11055 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int dp[] = new int[n];
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			
			dp[i] = arr[i];
			
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[j] + arr[i] > dp[i]) {
					dp[i] = dp[j] + arr[i];
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
