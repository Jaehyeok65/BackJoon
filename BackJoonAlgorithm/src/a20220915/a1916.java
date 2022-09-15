package a20220915;

import java.util.*;
import java.io.*;



public class a1916 {
	static int N; //정점의 개수
	static int E; //간선의 개수 == 버스의 개수
	static List<Edges> list[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		list = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		E = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < E; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()); //시작정점
			int v = Integer.parseInt(st.nextToken()); //도착정점
			int w = Integer.parseInt(st.nextToken()); //가중치
			list[u].add(new Edges(u,v,w)); //인접리스트에 간선 추가
		}
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st1.nextToken());
		int last = Integer.parseInt(st1.nextToken());
		graphs g = new graphs(list);
		
		int result[] = g.shortlist(first);
		
		System.out.print(result[last]);
		// TODO Auto-generated method stub

	}

}


class graphs {
	
	List<Edges> adjList[]; //그래프를 저장할 리스트
	int N; //정점의 개수
	
	
	
	public graphs(List<Edges> graph[]) {
		adjList = graph;
		N = graph.length-1; //정점의 개수는 그래프의 길이 - 1
	}
	
	public int[] shortlist(int v) {  //최단 경로 알고리즘 시작정점을 매개변수 v로 받음
		
		int dist[] = new int[N+1]; //최단경로를 담을 배열
		boolean visited[] = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			dist[i] = Integer.MAX_VALUE; //거리는 아직 방문하지 않았으므로 무한대로 초기화
			visited[i] = false;
		}
		
		dist[v] = 0; //시작정점에서 시작정점까지의 거리는 0이므로
		
		for(int k = 0; k < N; k++) {
			int minVertxt = -1; 
			int min = Integer.MAX_VALUE;
			for(int j = 1; j <= N; j++) {
				if((!visited[j]) && (dist[j] < min)) {
					min = dist[j];
					minVertxt = j;
				}

			}
			
		if(minVertxt == -1) continue;
		
		visited[minVertxt] = true; //시작정점이므로 방문처리해줌
		
		for(Edges e : adjList[minVertxt]) { //최소 정점의 인접 간선들을 가져옴
			if(!visited[e.other]) {
				int currentdist = dist[e.other];
				int newdist = dist[minVertxt] + e.weight;
				if(currentdist > newdist) {
					dist[e.other] = newdist;
				}
			}
			
		}
		
		}
		
		return dist;
		
	}
	
}


class Edges {
	
	int vertex; // 간선의 시작 정점
	int other; //간선의 다른쪽 정점
	int weight; //간선의 가중치
	
	public Edges(int vertex, int other, int weight) {
		this.vertex = vertex;
		this.other = other;
		this.weight = weight;
	}
}

