package a20220914;

import java.util.*;
import java.io.*;



public class a1967 {
	
	static int N; //입력받을 수
	static int P; //부모 노드
	static int M; //자식 노드
	static int W; //가중치
	static int max = 0;
	static int maxidx = 0;
	static ArrayList<Node> list[];
	static boolean visited[];
	
	
	public static void dfs(int index, int weight) {
		
		if(max < weight) {
			max = weight;
			maxidx = index;
		}
		
		for(Node node : list[index]) {
			if(!visited[node.v]) {
				visited[node.v] = true;
				dfs(node.v, weight + node.weight);
			}
		}
	}
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		list = new ArrayList[N+1];
		
		for(int i = 0; i <= N; i++) {  //리스트 초기화
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < N-1; i++)  {
			StringTokenizer st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			list[P].add(new Node(M,W));
			list[M].add(new Node(P,W));
		}
		
		visited = new boolean[N+1];
		visited[1] = true;
		dfs(1,0);
		
		visited = new boolean[N+1];
		visited[maxidx] = true;
		dfs(maxidx,0);
		
		System.out.print(max);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

class Node {
	int v; //다른쪽 정점
	int weight; //가중치
	
	public Node(int v, int weight) {
		this.v = v;
		this.weight = weight;
	}
}
