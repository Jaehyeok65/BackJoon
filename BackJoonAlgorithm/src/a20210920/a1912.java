package a20210920;


import java.util.*;


public class a1912 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int dp[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = arr[0];   //첫 번째 수까지의 합은 첫번째수이므로.
		
		for(int i = 1; i < n; i++) {   //현재까지의 최댓값을 dp배열에 저장
			dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < dp.length; i++) {  //가장 큰 값을 찾아서
			max = Math.max(max, dp[i]);  //max배열에 저장
		}
		
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}
