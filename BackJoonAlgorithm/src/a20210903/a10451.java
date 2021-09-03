package a20210903;


import java.util.*;


public class a10451 {
	
	static boolean visited[];
	
	public static void dfs(int graph[][], int n) {
		visited[n] = true;
		
		for(int i = 1; i < graph.length; i++) {
			
			if(graph[n][i] == 1 && !visited[i]) {  //간선이 연결되어 있고 방문하지 않았다면
				visited[i] = true;
				dfs(graph,i);
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();  //n은 정점의 개수
			int graph[][] = new int[n+1][n+1];
			int arr[] = new int[n+1];
			int result = 0;  //순열 사이클의 개수
			visited = new boolean[n+1];
			
			for(int j = 1; j <= n; j++) {
				arr[j] = sc.nextInt();  
				graph[j][arr[j]] = 1;  //그래프 간선을 이음
				graph[arr[j]][j] = 1;  //마찬가지로 간선을 이음
			}
			
			for(int j = 1; j <= n; j++) {
				if(!visited[j]) {  //해당 정점에 아직 방문하지 않았다면
					dfs(graph,j);   //깊이우선탐색 수행 (하나의 탐색이 수행되면 순열 사이클 완성)
					result++;       //탐색이 완료되면 순열 사이클 개수를 추가해줌
				}
			}
			sb.append(result+"\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
