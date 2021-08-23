package a20210823;


import java.util.*;


public class a1389 {
	static boolean visited[];
	static int count[][];
	static int sum[];
	static int index = 0;
	static int indexvalue = Integer.MAX_VALUE;
	
	public static void clean() {
		for(int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
	}
	
	public static void get() {
		for(int i = 1; i < sum.length; i++) {
			for(int j = 1; j < sum.length; j++) {
				sum[i] = sum[i] + count[i][j];
			}
		}
	}
	
	public static int getresult() {
		
		for(int i = 1; i < sum.length; i++) {
			if(sum[i] < indexvalue) {
				indexvalue = sum[i];
				index = i;
			}
		}
		
		return index;
	}
	
	
	
	public static void bfs(int graph[][], int n) {
		Queue<Integer> que = new LinkedList<>();
		
		visited[n] = true;
		que.add(n);
		
		while(!que.isEmpty()) {
			int k = que.poll();
			
			for(int i = 1; i < graph.length; i++) {
				if(graph[k][i] == 1 && !visited[i]) {
					visited[i] = true;
					que.add(i);
					count[n][i] = count[n][k] + 1;
				}
			}
		}
	}
	
	public static void put(int graph[][], int a, int b) {
		graph[a][b] = 1;
		graph[b][a] = 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //정점의 개수
		int m = sc.nextInt(); //간선의 개수
		int graph[][] = new int[n+1][n+1]; //정점의 개수가 n개인 그래프 선언
		visited = new boolean[n+1]; //정점의 개수가 n인 방문 확인 배열 선언
		count = new int[n+1][n+1];
		sum = new int[n+1];
		for(int i = 0; i < m; i++) {
			put(graph,sc.nextInt(),sc.nextInt());
		}
		
		for(int i = 1; i <= n; i++) {
			bfs(graph,i);
			clean();
		}
		get();
		System.out.println(getresult());
		
		// TODO Auto-generated method stub

	}

}
