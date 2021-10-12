package a20211012;


import java.util.*;


public class a12852 {
	static int N;
	static int ans = 0;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		N = sc.nextInt();
		int dp[] = new int[N+1];
		
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i-1] + 1;
			
			if(i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i/2] + 1);
			}
			
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i/3] + 1);
			}
		}
		System.out.println(dp[N]);
		int path = N;  //경로 역추적을 위한 마지막 
		while(path != 1) {
			if(path % 3 == 0 && dp[path/3] == dp[path] -1) {
				sb.append(path + " ");
				path = path / 3;
			}
			else if(path % 2 == 0 && dp[path/2] == dp[path] - 1) {
				sb.append(path + " ");
				path = path / 2;
			}
			else if(path - 1 >= 0 && dp[path-1] == dp[path] - 1) {
				sb.append(path + " ");
				path = path - 1;
			}
		}
		sb.append(1);
		System.out.print(sb.toString());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
