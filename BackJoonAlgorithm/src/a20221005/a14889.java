package a20221005;

import java.util.*;
import java.io.*;



public class a14889 {
	static int N;
	static int map[][];
	static boolean visited[];
	static int Min = Integer.MAX_VALUE;
	
	static void diff() {
		int team_start = 0;
		int team_link = 0;
 
		for (int i = 1; i <= N - 1; i++) {
			for (int j = i + 1; j <= N; j++) {
				// i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스 
				if (visited[i] == true && visited[j] == true) {
					team_start += map[i][j];
					team_start += map[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스 
				else if (visited[i] == false && visited[j] == false) {
					team_link += map[i][j];
					team_link += map[j][i];
				}
			}
		}
		// 두 팀의 점수 차이 (절댓값)
		int val = Math.abs(team_start - team_link);
		
		/*
		  두 팀의 점수차가 0이라면 가장 낮은 최솟값이기 때문에
		  더이상의 탐색 필요없이 0을 출력하고 종료하면 된다.
		 */
		if (val == 0) {
			System.out.println(val);
			System.exit(0);
		}
		
		Min = Math.min(val, Min);
				
	}
	
	public static void dfs(int index, int depth) {
		if(depth == N / 2) {
			diff();
			return;
		}
		
		for(int i = index; i<= N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i+1,depth+1);
				visited[i] = false;
			}
		}
	
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1]; //1부터 N까지 방문했는지 체크 여부
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력 완료
		
		dfs(1,0);
		System.out.print(Min);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
