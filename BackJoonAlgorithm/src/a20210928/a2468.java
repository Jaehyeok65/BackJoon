package a20210928;


import java.util.*;


public class a2468 {
	static int N;
	static int map[][];
	static boolean visited[][];
	static int map2[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int max = 1;
	static int count;
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < 0 || nx >= N || ny < 0 || ny >= N) continue;  //그래프의 범위가 넘어가면 컨티뉴
			
			if(!visited[nx][ny] && map2[nx][ny] == 1) { //아직 방문하지 않았으며 물의 높이 이상이면
				dfs(nx,ny);
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 1; i < 101; i++) {  //높이
			map2 = new int[N][N];
			count = 0;
			
			visited = new boolean[N][N];
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(map[j][k] <= i) {
						map2[j][k] = 0;
					}
					else {
						map2[j][k] = 1;
					}
				}
			}
			
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(map2[j][k] == 1 && !visited[j][k]) {
						dfs(j,k);
						count++;
					}
				}
			}
			max = Math.max(max, count);
			
		}
		System.out.print(max);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
