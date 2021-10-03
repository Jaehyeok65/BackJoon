package a20211002;


import java.util.*;

class Point {
	int n, count;
	
	public Point(int n, int count) {
		this.n = n;
		this.count = count;
	}
}
public class a5567 {
	static int N;
	static int M;
	static int graph[][];
	static boolean visited[];
	static int count = 0;
	
	public static void bfs() {
		Queue<Point> que = new LinkedList<>();
		
		que.add(new Point(1,0));
		visited[1] = true;
		
		while(!que.isEmpty()) {
			
			Point p = que.poll();
			int n = p.n;
			for(int i = 1; i <= N; i++) {
				if(graph[n][i] == 1 && !visited[i]) {
					int nextCount = p.count + 1;
					if(nextCount <= 2) {
					que.add(new Point(i,nextCount));
					visited[i] = true;
					}
				}
			}
		}
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		bfs();
		for(int i = 2; i <= N; i++) {
			if(visited[i]) {
				count++;
			}
		}
		System.out.print(count);
		
	
		// TODO Auto-generated method stub

	}

}
