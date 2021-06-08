package class3;


import java.util.*;


public class a11053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int arr[] = new int[n];
		int dp[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0; i < n; i++) {
			
			dp[i] = 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[i] <dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
				
			}
		}
		
		for(int i = 0; i < n; i++) {
			max = max < dp[i] ? dp[i] : max ;
		}
		System.out.println(max);
		for(int i = 0; i < n; i++) {
			System.out.print(dp[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
