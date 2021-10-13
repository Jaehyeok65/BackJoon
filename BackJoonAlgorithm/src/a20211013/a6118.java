package a20211013;


import java.util.*;

class Point {
	
	int x;
	int count;
	
	public Point(int x, int count) {
		this.x = x;
		this.count = count;
	}
}
public class a6118 {
	
	static int N;
	static int M;
	static boolean visited[];
	static ArrayList<Integer> graph[];
	static int max = 0;
	static ArrayList<Integer> list = new ArrayList<>();
	static int result = 0;
	static int ans = 0;
	
	public static void bfs(int n) {
		
		Queue<Point> que = new LinkedList<>();
		
		que.add(new Point(n,0));
		visited[n] = true;
		while(!que.isEmpty()) {
			Point p = que.poll();
			int now = p.x;
			int count = p.count;
			
			if(count > max) {
				max = count;
				ans = now;
				result = 1;
			}
			
			else if(count == max) {
				if(ans > now) ans = now;
				result++;
			}
			
			for(int i = 0; i < graph[now].size(); i++) {
				int next = graph[now].get(i);
				if(!visited[next]) {
					visited[next] = true;
					que.add(new Point(next,count+1));
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		graph = new ArrayList[N+1];
		visited = new boolean[N+1];
		
		for(int i=0;i<=N;i++) graph[i] = new ArrayList<>();
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			graph[a].add(b);
			graph[b].add(a);
		}
		
		bfs(1);
		System.out.print(ans + " " + max + " " + result);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
