package a20220913;


import java.util.*;
import java.io.*;




public class a2252 {
	
	static ArrayList<Integer> ver[];
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		ver = new ArrayList[N+1];
		
		for(int i = 1; i <= N; i++) {
			ver[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st1.nextToken());
			int m = Integer.parseInt(st1.nextToken());
			ver[n].add(m);
		}
		
		graph g = new graph(ver);
		List<Integer> list = g.tsort();
		
		for(int i : list) {
			System.out.print(i + " ");
		}
		
	
		
		// TODO Auto-generated method stub

	}

}


class graph {
	
	int N;  //정점 수
	boolean [] visited;
	List<Integer>[] adjList;
	List<Integer> sequence;
	Stack<Integer> stack;
	
	public graph(List<Integer>[] graph) {
		this.adjList = graph;
		sequence = new ArrayList<>();
		stack = new Stack<>();
		N = graph.length - 1; //정점의 수는 length - 1
		visited = new boolean[graph.length];
	}
	
	public List<Integer> tsort() {
		for(int i = 1 ; i <= N; i++) {
			if(!visited[i]) {
				dfs(i);
			}
		}
		Collections.reverse(sequence);
		return sequence;
	}
	

	
	public void dfs(int n) {
		visited[n] = true;
		for(int next : adjList[n]) {
			if(!visited[next]) dfs(next);
		}
		sequence.add(n);
	}
}

