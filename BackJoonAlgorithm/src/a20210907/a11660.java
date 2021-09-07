package a20210907;


import java.util.*;


public class a11660 {
	
	static int dp[][];
	static int N;
	static int map[][];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		N = sc.nextInt();  //표의 크기
		int m = sc.nextInt(); //연산 횟수
		
		map = new int[N+1][N+1]; //1부터 시작해야하므로 크기를 +1해준다.
		dp = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {   //구간합을 저장해주는 dp배열을 선언하여 처음부터 그 구간까지의 합을 초기화해준다.
			
			for(int j = 1; j <= N; j++) {
				map[i][j] = sc.nextInt();
				
				dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + map[i][j];
			}
		}
		
		for(int i = 0; i < m; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int sum = dp[x2][y2] - dp[x2][y1-1] - dp[x1-1][y2] + dp[x1-1][y1-1] ;
			
			sb.append(sum+"\n");

		}
		System.out.print(sb.toString());
		
		
		// TODO Auto-generated method stub

	}

}
