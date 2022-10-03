package a20221003;


import java.util.*;
import java.io.*;

	


public class a1987 {
	static int R; //가로
	static int C; //세로
	static char map[][]; //입력받을 map
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0}; //상하좌우
	static HashSet<Character> hash = new HashSet<>();
	static int result = 0;
	
	
	
	
	public static void dfs(int y, int x, int count) {
		if(hash.contains(map[y][x])) {
			result = Math.max(result, count);
			return;
		}
		else {
			hash.add(map[y][x]); //집합에 추가
			
			for(int i = 0; i < 4; i++) {
				int nextY = y + dy[i];
				int nextX = x + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= R || nextX >= C) continue; //map의 범위를 벗어나면 continue
				dfs(nextY,nextX,count+1);
			}
			hash.remove(map[y][x]);
			
		}
		
	
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C]; //초기화
		
		for(int i = 0; i < R; i++) {
			String s = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		dfs(0,0,0);
		
		System.out.print(result);
		
		
		
		// TODO Auto-generated method stub

	}

}
