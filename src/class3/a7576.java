package class3;


import java.util.*;


public class a7576 {
	static int N,M;
	static int[][] graph; //입력받을 그래프
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	
	static void bfs(int x, int y) {
		
		Queue<dot> que = new LinkedList<>();
		
		que.add(new dot(x,y));
		
		while(!que.isEmpty()) {
			
			dot d = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				if(nextX >= 0 && nextX < M && nextY >= 0 && nextY < N) {
					if(graph[nextX][nextY] == 0) { //아직 방문하지 않았고 안익은 토마토라면 방문
						que.add(new dot(nextX,nextY));
						graph[nextX][nextY] = graph[d.x][d.y] + 1;
					}
				} 
			}
		}
	}
	

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt(); //n x m크기의 상자
		
		graph = new int[M][N];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				graph[i][j] = sc.nextInt();
			} 
		}
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(graph[i][j] == 1) {
					bfs(i,j);
				}
			}
		}
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(graph[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				else {
					max = Math.max(graph[i][j], max);
				}
			}
		}
		System.out.print(max-1);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
