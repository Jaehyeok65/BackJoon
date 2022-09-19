package a20220919;

import java.util.*;
import java.io.*;



public class a3055 {
	
	static int R; //R행
	static int C; //C열
	static int dx[] = {-1,1,0,0}; //좌우상하 이동
	static int dy[] = {0,0,-1,1};
	static char map[][]; //입력받을 좌표
	static boolean visited[][]; //방문 표시를 입력받을 좌표
	static boolean wvisited[][];
	static boolean flag = false;
	static int result = -1;
	
	
	public static void bfs() { //초기에는 D를 만났을 때 bfs를 진행
		
		Queue<dot> que = new LinkedList<>(); //고슴도치 위치를 파악할 큐
		Queue<dot> water = new LinkedList<>(); //물의 위치를 파악할 큐
		
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(map[i][j] == 'S') {
					que.add(new dot(i,j,0)); 
				}
				else if(map[i][j] == '*') {
					water.add(new dot(i,j,0));
				}
			}
		}
		
		while(true) {
			
			
			int size = water.size(); //물부터 이동함
			
			for(int k = 0; k < size; k++) {
				
				dot wd = water.poll(); //물이 들어있는 수만큼만 반복함
				
				for(int i = 0; i < 4; i++) {
					int nextY = wd.y + dy[i];
					int nextX = wd.x + dx[i];
					
					if(nextY < 0 || nextY >= R || nextX < 0 || nextX >= C) continue; //맵의 범위를 넘어가면 continue
					if(!wvisited[nextY][nextX] && map[nextY][nextX] == '.') { //방문하지 않았으며 빈칸이라면
						wvisited[nextY][nextX] = true;
						water.add(new dot(nextY,nextX,wd.count + 1));
					}
				}
			}
			
			size = que.size();
			
			if(size == 0) break;
			
			for(int k = 0; k < size; k++) {
				
				dot d = que.poll(); //물이 들어있는 수만큼만 반복함
				
				for(int i = 0; i < 4; i++) {
					int nextY = d.y + dy[i];
					int nextX = d.x + dx[i];
					
					if(nextY < 0 || nextY >= R || nextX < 0 || nextX >= C) continue; //맵의 범위를 넘어가면 continue
					if(map[nextY][nextX] == 'D') {
						result = d.count + 1;
						return;
					}
					if(!visited[nextY][nextX] && map[nextY][nextX] == '.' &&!wvisited[nextY][nextX]) { //방문하지 않았으며 빈칸이라면
						visited[nextY][nextX] = true;
						que.add(new dot(nextY,nextX,d.count + 1));
					}
				}
			}
			
		}
		
	}
		
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new char[R][C];
		visited = new boolean[R][C];
		wvisited = new boolean[R][C];
		
		for(int i = 0; i < R; i++) {
			String s = br.readLine();
			for(int j = 0; j < C; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		bfs();
		
		System.out.print(result != -1 ? result : "KAKTUS");
		
		
		// TODO Auto-generated method stub

	}

}

class dot {
	int x;
	int y;
	int count;
	
	public dot(int y, int x, int count) {
		this.y = y;
		this.x = x;
		this.count = count;
	}
}
