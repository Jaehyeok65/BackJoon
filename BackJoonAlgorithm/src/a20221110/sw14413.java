package a20221110;

import java.util.*;
import java.io.*;





public class sw14413 {
	
	static int T;
	static int N;
	static int M;
	static char map[][];
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
	
	
	public static boolean solve() {
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == '#') {
					boolean flag = check(i,j);
					if(!flag) {
						return false;
					}
				}
				else if(map[i][j] == '.') {
					boolean flag = check2(i,j);
					if(!flag) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	
	public static boolean check(int y, int x) {
		for(int i = 0; i < 4; i++) {
			int nextY = y + dy[i];
			int nextX = x + dx[i];
			if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= M) continue;
			if(map[nextY][nextX] == '#') {
				return false;
			}
			else if(map[nextY][nextX] == '?') {
				map[nextY][nextX] = '.';
			}
		}
		return true;
	}
	
	public static boolean check2(int y, int x) {
		for(int i = 0; i < 4; i++) {
			int nextY = y + dy[i];
			int nextX = x + dx[i];
			if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= M) continue;
			if(map[nextY][nextX] == '.') {
				return false;
			}
			else if(map[nextY][nextX] == '?') {
				map[nextY][nextX] = '#';
			}
		}
		return true;
	}
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			map = new char[N][M];
			
			for(int i = 0; i < N; i++) {
				String s = br.readLine();
				for(int j = 0; j < M; j++) {
					map[i][j] = s.charAt(j);
				}
			} //입력 완료
			
			if(solve()) {
				sb.append("#"+k+" possible\n");
			}
			else {
				sb.append("#"+k+" impossible\n");
			}
			
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
