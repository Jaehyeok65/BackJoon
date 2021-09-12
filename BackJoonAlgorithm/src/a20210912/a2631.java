package a20210912;


import java.util.*;


public class a2631 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int dp[] = new int[n];
		int result = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {  //자기 자신보다 작은 숫자가 나온다면
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			result = Math.max(result, dp[i]);
		}
		System.out.print(n - result);
		
		
		
		// TODO Auto-generated method stub

	}

}
