package Sirver4;


import java.util.*;


public class a9372 { //간선의 개수를 구하면 될듯?
	
	static int N; //노드의 개수
	static int graph[][];
	static boolean visited[];
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int Testcase = sc.nextInt();
		
		
		
		while(Testcase --> 0) {
			
			N = sc.nextInt();
			graph = new int[N+1][N+1];
			visited = new boolean[N+1];
			int M = sc.nextInt();
			for(int i = 0; i < M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				graph[a][b] = 1;
				graph[b][a] = 1;
			}
			sb.append(N-1+"\n"); //간선의 개수는 정점의 개수 - 1
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
