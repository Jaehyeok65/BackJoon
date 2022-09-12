package a20220912;


import java.util.*;
import java.io.*;


public class a3109 {
	
	static int[] dx = {1, 1, 1}; //오른쪽, 오른쪽 아래, 오른쪽 위 이동
	static int[] dy = {-1, 0, 1}; 
	static char[][] map;
	static boolean[][] visited;
	static int y;
	static int x;
	static int result = 0;
	
	public static boolean dfs(int ny, int nx) { //정점 n과 m 방문
		
		if(nx == x-1) {
			result++;
			return true;
		}
		visited[ny][nx] = true; //방문 표시
		
		for(int i = 0; i < 3; i++) { //오른쪽, 오른쪽 아래, 오른쪽 위로 이동
			int nextY = ny + dy[i];
			int nextX = nx + dx[i];
			
			if(nextY >= 0 && nextY < y && nextX >= 0 && nextX < x) {
				if(map[nextY][nextX] == 'x') continue;
				
				if(!visited[nextY][nextX]) {
					if(dfs(nextY,nextX)) {
						return true;
					}
				}
			}
		}
		return false;
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		
		map = new char[y][x];
		visited = new boolean[y][x];
		
		for(int i = 0; i < y; i++) { //map 초기화
			String s = br.readLine();
			for(int j = 0; j < x; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		for(int i = 0; i < y; i++) {
			dfs(i,0);
		}
		System.out.print(result);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
