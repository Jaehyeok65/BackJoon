package a20220919;

import java.util.*;
import java.io.*;



public class a3055_1 {
	
	static int R; //R행
	static int C; //C열
	static int dx[] = {-1,1,0,0}; //좌우상하 이동
	static int dy[] = {0,0,-1,1};
	static char map[][]; //입력받을 좌표
	static boolean visited[][]; //방문 표시를 입력받을 좌표
	static boolean flag = false;
	static int result = -1;
	
	
	public static void bfs() { //초기에는 D를 만났을 때 bfs를 진행
		
		Queue<dots> que = new LinkedList<>(); //고슴도치 위치를 파악할 큐
		int di = 0;
		int dj = 0;
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(map[i][j] == 'S') {
					di = i;
					dj = j;
					//que.add(new dot(i,j,0,'S')); 
				}
				else if(map[i][j] == '*') {
					que.add(new dots(i,j,0,'*'));
				}
				else if(map[i][j] == 'X') {
					visited[i][j] = true; //돌은 지나갈 수 없으므로 방문 처리함
				}
			}
		}
		
		que.add(new dots(di,dj,0,'S')); //물이 다 차고 이동해야하므로 가장 나중에 삽입 
		
		while(!que.isEmpty()) {
			
			dots d = que.poll(); //큐에 삽입된 순서대로 진행 
			
			for(int i = 0; i < 4; i++) {
				
				int nextY = d.y + dy[i];
				int nextX = d.x + dx[i];
				
				if(nextY < 0 || nextY >= R || nextX < 0 || nextX >= C) continue;
				
				if(d.c == 'S' && map[nextY][nextX] == 'D') {
					result = d.count + 1;
					return;
				}
				if(!visited[nextY][nextX] && map[nextY][nextX] == '.') {
					visited[nextY][nextX] = true;
					que.add(new dots(nextY,nextX,d.count + 1, d.c));
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

class dots {
	int x;
	int y;
	int count;
	char c;
	
	public dots(int y, int x, int count, char c) {
		this.y = y;
		this.x = x;
		this.count = count;
		this.c = c;
	}
}
