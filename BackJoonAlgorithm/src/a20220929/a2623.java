package a20220929;

import java.util.*;
import java.io.*;




public class a2623 {
	
	static int N;
	static int M;
	static ArrayList<Edge> graph[];
	static ArrayList<Integer> result = new ArrayList<>();
	static boolean visited[];
	static boolean finish[]; //싸이클 판단 여부
	static boolean cycle = false; //싸이클 판단 여부
	
	
	
	public static void solve() { //1부터 dfs를 시작
		//각각에 정점에 대해 dfs를 수행하고 dfs를 빠져나오는 순서대로 list에 추가하는 것이 포인트
		
		for(int i = 1; i <= N; i++) {
			if(cycle) { //싸이클이 존재
				return;
			}
			if(!visited[i]) {
				dfs(i);
			}
		}
		
		
		
	}
	
	
	public static void dfs(int num) {
		visited[num] = true;
		
		for(Edge e : graph[num]) { //연결된 간선에 대해 계속해서 탐색을 수행함
			if(!visited[e.o]) {
				dfs(e.o);
			}
			else if(!finish[e.o]) {
				cycle = true;
				return;
			}
		}
		
		finish[num] = true;
		result.add(num);
	}
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1]; //ArrayList로 그래프 생성 1~N까지
		visited = new boolean[N+1]; 
		finish = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>(); //각각의 리스트를 초기화해줌
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			ArrayList<Integer> list = new ArrayList<>();
			while(st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
			
			for(int j = 0; j < list.size()-1; j++) { //그래프에 간선 추가
				graph[list.get(j)].add(new Edge(list.get(j), list.get(j+1)));
			}
		}
		
		solve();
		
		if(cycle) {
			System.out.print(0);
		}
		else {
		
		Collections.reverse(result);
		
		for(int i : result) {
			System.out.println(i);
		}
		}
		
		// TODO Auto-generated method stub

	}

}



class Edge {
	int v;
	int o;
	
	public Edge(int v, int o) {
		this.v = v;
		this.o = o;
	}
	
}
