package a20210907;

import java.util.*;



public class a11048 {
	
	static int dx[] = {1,0,1};
	static int dy[] = {0,1,1};
	static int N;
	static int M;
	static int map[][];
	static int dp[][];
	
	
	
	public static int dfs(int n, int m) {
		
		if(dp[n][m] != -1) {   //-1이 아니라면 미리 저장해둔 값이므로 리턴
			return dp[n][m];
		}
		
		if(n == N - 1 && m == M - 1) {  //N,M에 도달했다면 리턴
			return map[n][m];
		}
		
		for(int i = 0; i < 3; i++) {
			int nextX = n + dx[i];  //주어진 값에 따라 이동 n + 1, m +1, n+1 m+1 세 가지 경우 중 하나
			int nextY = m + dy[i];  //마찬가지
			
			if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {  //주어진 범위를 벗어나지 않는 경우
				dp[n][m] = Math.max(dp[n][m], dfs(nextX,nextY) + map[n][m]);  //최대값 갱신
			}
		}
		
		return dp[n][m];
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N][M];
		dp = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
				dp[i][j] = -1;
			}
		}
		
		System.out.print(dfs(0,0));
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
