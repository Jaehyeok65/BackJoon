package a20210910;

import java.util.*;

class home {
	
	int x;
	int y;
	
	public home(int x, int y) {
		this.x = x;
		this.y = y;
	}
}



public class a14502 {
	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int N;
	static int M;
	static int map[][];
	static int count = Integer.MIN_VALUE;
	
	public static void dfs(int depth) {
		
		if(depth == 3) {
			bfs();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;  //벽을 세움
					dfs(depth + 1);
					map[i][j] = 0;   //벡트래킹을 통해 벽을 허뭄
				}
			}
		}
		
	}
	
	
	public static void bfs() {
		int virus[][] = new int[N][M];
		
		for(int i = 0; i < N; i++) {   //바이러스를 확산하는 배열을 새로만듬 (매번 바이러스가 바뀌기 때문)
			for(int j = 0; j < M; j++) {
				virus[i][j] = map[i][j];
			}
		}
		
		Queue<home> que = new LinkedList<home>();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(virus[i][j] == 2) {
					que.add(new home(i,j));
				}
			}
		}
		
		while(!que.isEmpty()) {
			
			home h = que.remove();
			
			for(int i = 0; i < 4; i++) {
				int nextX = h.x + dx[i];
				int nextY = h.y + dy[i];
				
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
					virus[nextX][nextY] = 2;
					que.add(new home(nextX,nextY));
				}
			}
		}
		print(virus);
		
		
	}
	
	public static void print(int virus[][]) {
		int ans = 0;
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				
				if(virus[i][j] == 0) {
					ans++;
				}
			}
		}
		
		count = Math.max(ans, count);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();   //map의 세로
		M = sc.nextInt();   //map의 가로
		
		map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		
		
		dfs(0);
		
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
