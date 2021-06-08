package class3;


import java.util.*;


public class a11724 {
	
	static int N; //정점의 개수
	static int M; //간선의 개수
	static int map[][]; //그래프의 연결관계를 표현할 인접행렬
	static boolean visited[];
	static int count = 0; //요소의 개수
	
	static void put(int a, int b) {
		map[a][b] = 1;
		map[b][a] = 1; //간선을 표시함.
	}
	
	static void dfs(int v) {
		
		visited[v] = true;
		
		for(int i = 1; i <= N; i++) {
			if(map[v][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
		
	}
	
	static boolean checked(boolean visited[]) {
		for(int i = 0; i <= N; i++) {
			if(!visited[i]) {
				return false;
			} 
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		map = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i = 1; i <= M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			put(a,b);
		}
		for(int i = 1; i <= N; i++) { //모든 정점에 대하여 dfs 수행
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.print(count);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
