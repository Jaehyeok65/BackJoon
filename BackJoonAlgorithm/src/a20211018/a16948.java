package a20211018;


import java.util.*;


class Point{
	
	int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class a16948 {
	
	static int dx[] = {-2,-2,0,0,2,2};
	static int dy[] = {-1,1,-2,2,-1,1};
	static Queue<Point> que = new LinkedList<>();
	static int map[][];
	static int visited[][];
	static int N;
	static int x;
	static int y;
	static int count = 0;
	
	public static void bfs(int x1, int y1) {
		Point p = new Point(x,y);
		visited[x][y] = 0;
		que.add(p);
		
		while(!que.isEmpty()) {
			
			Point temp = que.poll();
			
			for(int i = 0; i < 6; i++) {
				int nextX = temp.x + dx[i];
				int nextY = temp.y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) {
					continue;
				}
				
				if(visited[nextX][nextY] == -1) {
					que.add(new Point(nextX,nextY));
					visited[nextX][nextY] = visited[temp.x][temp.y] + 1;
				}
				
				if(nextX == x1 && nextY == y1) {
					return;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N][N];
		visited = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				visited[i][j] = -1;
			}
		}
		x = sc.nextInt();
		y = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		bfs(x1,y1);
		
		System.out.println(visited[x1][y1]);
		// TODO Auto-generated method stub

	}

}
