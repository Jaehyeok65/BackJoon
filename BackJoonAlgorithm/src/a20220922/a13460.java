package a20220922;

import java.util.*;
import java.io.*;


public class a13460 {
	
	static int N;
	static int M;
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0}; //상하좌우
	static char map[][];
	static boolean visited[][][][];
	
	
	public static void bfs() {
		int ri = 0;
		int rj = 0;
		int bi = 0;
		int bj = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 'R') {
					ri = i;
					rj = j;
				}
				else if(map[i][j] == 'B') {
					bi = i;
					bj = j;
				}
			}
		}
		visited[ri][rj][bi][bj] = true;
		Queue<dot> que = new LinkedList<>();
		que.add(new dot(ri,rj,bi,bj,0));
		
		while(!que.isEmpty()) {
			dot d = que.poll();
			
			if(d.count >= 10) {
				System.out.print(-1);
				return;
			}
			
			for(int i = 0; i < 4; i++) {
				int ry = d.ry;  //빨간색 구슬을 굴림
				int rx = d.rx;
				
				while(map[ry + dy[i]][rx + dx[i]] != '#') {
					ry += dy[i];
					rx += dx[i];
					if(map[ry][rx] == 'O') break;
				}
				
				int by = d.by;
				int bx = d.bx;
				
				while(map[by + dy[i]][bx + dx[i]] != '#') {
					by += dy[i];
					bx += dx[i];
					if(map[by][bx] == 'O') break;
				}
				
				if(map[by][bx] == 'O') continue;
				
				if(map[ry][rx] == 'O') {
					System.out.print(d.count+1);
					return;
				}
				
			     if (ry == by && rx == bx) { //두 구슬의 위치가 같다면
			    	 
	                    switch (i) { //초기 위치에 따라 구슬 위치 조정
	 
	                    case 0: // 상
	                        if (d.ry < d.by) //위로 굴렸는데 빨간구슬이 더 위에 있었다면
	                            by += 1; //파란 구슬의 위치 조정
	                        else
	                            ry += 1;
	                        break;
	                    case 1: // 하
	                        if (d.ry > d.by) //아래로 굴렸는데 빨간구슬이 더 아래에 있었다면
	                            by -= 1; //파란구슬의 위치 조정
	                        else
	                            ry -= 1;
	                        break;
	                    case 2: // 좌
	                        if (d.rx < d.bx) //왼쪽으로 굴렸는데 빨간구슬이 더 왼쪽에 있었다면
	                            bx += 1;
	                        else
	                            rx += 1;
	                        break;
	                    case 3: // 우
	                        if (d.rx > d.bx) //오른쪽으로 굴렸는데 빨간구슬이 더 오른쪽에 있었다면
	                            bx -= 1;
	                        else
	                            rx -= 1;
	                        break;
	                    }
	                }
	                //두 구슬을 굴린 후의 각각의 위치가 처음 탐색하는 것이라면 큐에 넣는다.
	                if (!visited[ry][rx][by][bx]) {
	                    que.add(new dot(ry, rx, by, bx, d.count + 1));
	                }
				
				
				
				
			}
		}
		System.out.print(-1);
	}

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		visited = new boolean[N][M][N][M];
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j] == '#') visited[i][j][i][j] = true;
			}
		}
		
		
		
		bfs();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

class dot {
	int rx;
	int ry;
	int bx;
	int by;
	int count;
	
	public dot(int ry, int rx, int by, int bx, int count) {
		this.ry = ry;
		this.rx = rx;
		this.by = by;
		this.bx = bx;
		this.count = count;
	}
}
