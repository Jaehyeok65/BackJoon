package a20221006;

import java.util.*;
import java.io.*;



public class a10971 {
	static int N;
	static int map[][];
	static boolean visited[];
	static int min = Integer.MAX_VALUE;
	
	public static void dfs(int start, int now, int result, int depth) {
		if(depth == N -1) {
			if(map[now][start] != 0) {
				result += map[now][start];
				min = Math.min(min, result);
			}
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i] && map[now][i] != 0) {
				visited[i] = true;
				dfs(start,i,result + map[now][i],depth+1);
				visited[i] = false;
			}
		}
		
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 1; i<= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				dfs(i,i,0,0);
				visited[i] = false;
			}
		}
		
		System.out.print(min);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
