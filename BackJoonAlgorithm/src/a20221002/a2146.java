package a20221002;

import java.util.*;
import java.io.*;




public class a2146 {
	static int N; //map의 크기
	static int map[][]; //입력받을 좌표
	static boolean visited[][];// 방문체크
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0}; //상하좌우
	static int result = Integer.MAX_VALUE;
	static int landnum = 2;
	
	
	public static void solve() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 1) {
					divide(i,j);
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] > 0) {
					visited = new boolean[N][N];
					int res = bfs(i,j);
					if(res == -1) continue;
					
					result = Math.min(result, res);
				}
			}
		}
		
		
	}
	
	public static void divide(int y, int x) {
		Queue<dot> que = new LinkedList<>();
		map[y][x] = landnum; //
		que.add(new dot(y,x,0));
		
		while(!que.isEmpty()) {
			dot d = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextY = d.y + dy[i];
				int nextX = d.x + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= N) continue;
				if(map[nextY][nextX] == 1) {
					map[nextY][nextX] = landnum;
					que.add(new dot(nextY,nextX,0));
				}
			}
		}
		
		landnum++;
		
	}
	
	
	public static int bfs(int y, int x) {
		Queue<dot> que = new LinkedList<>();
		visited[y][x] = true;
		que.add(new dot(y,x,0));
		int num = map[y][x];
		
		while(!que.isEmpty()) {
			dot d = que.poll();
			
			if(map[d.y][d.x] != 0 && map[d.y][d.x] != num) {
				return d.count;
			}
			
			for(int i = 0; i < 4; i++) {
				int nextY = d.y + dy[i];
				int nextX = d.x + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= N) continue;
				if(visited[nextY][nextX] || map[nextY][nextX] == num) continue;
				
				visited[nextY][nextX] = true;
				que.add(new dot(nextY,nextX,d.count+1));
			}
		}
		
		return -1;
	}
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} //입력완료
		
		solve();
		
		System.out.print(result-1);
		
		// TODO Auto-generated method stub

	}

}

class dot {
	int y;
	int x;
	int count;
	
	public dot(int y, int x, int count) {
		this.y = y;
		this.x = x;
		this.count = count;
	}
}
