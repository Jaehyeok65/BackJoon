package a20220926;

import java.util.*;
import java.io.*;



public class a2573 {
	static int N; //행
	static int M; //열
	static int map[][];
	static boolean visited[][];
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1}; //상하좌우
	static Queue<ice> que = new LinkedList<>();
	static int count = 0;
	
	public static void solve(int y, int x) {
		if(!visited[y][x]) { //
			que.add(new ice(y,x));
			visited[y][x] = true;
		}
		
		
		
		while(!que.isEmpty()) {
			ice ic = que.poll();
			int count = 0; //빙산의 개수
			for(int i = 0; i < 4; i++) {
				int nextY = ic.y + dy[i];
				int nextX = ic.x + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= M) continue;
				if(map[nextY][nextX] == 0 && !visited[nextY][nextX]) count++;
				if(!visited[nextY][nextX] && map[nextY][nextX] > 0) {
					que.add(new ice(nextY,nextX));
					visited[nextY][nextX] = true;
				}
			}
			map[ic.y][ic.x] = map[ic.y][ic.x] - count > 0 ? map[ic.y][ic.x] - count : 0;
		}
	}
	
	public static int melt() {
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] != 0 && !visited[i][j]) {
					solve(i,j);
					count++;
				}
			}
		}
		
		for(int i = 0; i < N; i++) { //방문 기록 초기화
			for(int j = 0; j < M; j++) {
				visited[i][j] = false;
			}
		}
		
		return count;
	}
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}  //입력완료
		
		
		while(true) {
			int result = melt();
			
			if(result == 0) {
				System.out.println(0);
				break;
			}
			else if(result >= 2) {
				System.out.println(count);
				break;
			}
			
			count++;
		}
		
		//System.out.println(count);
		
		// TODO Auto-generated method stub

	}

}

class ice {
	int y;
	int x;
	
	public ice(int y, int x) {
		this.y = y;
		this.x = x;
	}
}