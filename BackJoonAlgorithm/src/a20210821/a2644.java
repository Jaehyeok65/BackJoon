package a20210821;


import java.util.*;



public class a2644 {
	
	static int graph[][];
	static boolean visited[];
	static int ans = -1;
	
	public static void graphadd(int n, int m) {
		graph[n][m] = 1;
		graph[m][n] = 1;
	}
	
	public static void dfs(int n, int m, int cnt) {
		
		visited[n] = true;
		
		if(n == m) {
			ans = cnt;
			return;
		}
		for(int i = 1; i < graph.length; i++) {
			if(graph[n][i] == 1 && !visited[i]) {
				dfs(i,m,cnt+1);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int people = sc.nextInt();
		graph = new int[people+1][people+1];
		visited = new boolean[people+1];
		int p = sc.nextInt();
		int q = sc.nextInt();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			graphadd(sc.nextInt(),sc.nextInt());
		}
		dfs(p,q,0);
		System.out.print(ans);
		// TODO Auto-generated method stub

	}

}
