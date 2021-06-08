package class3;


import java.util.*;


public class a1260 {
	
	static int N;
	static int M;
	static boolean visited[];
	static int map[][];
	
	static void dfs(int v) {
		
		visited[v] = true;
		System.out.print(v + " ");
		
		for(int i = 1; i <= N; i++) { //정점이 1부터 시작하기 때문
			if(map[v][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int v) {
		
		Queue<Integer> que = new LinkedList<>();
		boolean visited[] = new boolean[N+1];
		que.add(v);
		visited[v] = true;
		
		while(!que.isEmpty()) {
			
			v = que.poll();
			System.out.print(v+" ");
			
			for(int i = 1; i <= N; i++) { //정점이 1부터 시작하기 때문
				
				if(map[v][i] == 1 && !visited[i]) {
					que.add(i);
					visited[i] = true;
				}
			}
		}
		
	}
	static void put(int a, int b) {
		map[a][b] = 1;
		map[b][a] = 1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		M = sc.nextInt();
		int v = sc.nextInt();
		for(int i = 0; i < M; i++) {
			put(sc.nextInt(),sc.nextInt());
		}
		dfs(v);
		System.out.println("");
		bfs(v);
		
		
		// TODO Auto-generated method stub

	}

}
