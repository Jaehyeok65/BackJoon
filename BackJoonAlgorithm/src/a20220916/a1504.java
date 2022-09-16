package a20220916;

import java.util.*;
import java.io.*;


public class a1504 {
	
	static int N; //정점의 개수
	static int E; //간선의 개수
	static List<Edges> list[];
	static final int INF = 200000000;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		E = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			list[u].add(new Edges(u,v,w));
			list[v].add(new Edges(v,u,w)); //양방향으로 간선 추가
		}
		
		st = new StringTokenizer(br.readLine());
		int u = Integer.parseInt(st.nextToken()); //반드시 거쳐야할 정점 1
		int v = Integer.parseInt(st.nextToken()); //반드시 거쳐야할 정점 2
		
		
		graphs g = new graphs(list);
		
		int result1 = g.shortlist(1, u) + g.shortlist(u, v) + g.shortlist(v, N);
		int result2 = g.shortlist(1, v) + g.shortlist(v, u) + g.shortlist(u, N);
		
		int ans = (result1 >= INF && result2 >= INF) ? -1 : Math.min(result1, result2);
		
		System.out.print(ans);
		
		
		
		// TODO Auto-generated method stub

	}

}

class graphs {
	
	List<Edges> adjList[]; //그래프를 저장할 리스트
	int N; //정점의 개수
	static final int INF = 200000000;
	
	
	
	public graphs(List<Edges> graph[]) {
		adjList = graph;
		N = graph.length-1; //정점의 개수는 그래프의 길이 - 1
	}
	
	public int shortlist(int n,int m) {  //최단 경로 알고리즘 시작정점을 매개변수 n으로 받고, u와 v는 반드시 거쳐야하는 정점
		
		int dist[] = new int[N+1]; //최단경로를 담을 배열
		boolean visited[] = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			dist[i] = INF; //거리는 아직 방문하지 않았으므로 무한대로 초기화
			visited[i] = false;
		}
		
		dist[n] = 0; //시작정점에서 시작정점까지의 거리는 0이므로
		
		for(int k = 0; k < N; k++) { //모든 정점에 대해 최단거리 갱신
			int minVertxt = -1;  //최단거리 정점
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
					dist[e.other] = newdist; //간선완화
				}
			}
			
		}
		
		}
		
		return dist[m];
		
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

