package a20220916;

import java.util.*;

import java.io.*;



public class a11404 {

	static int N; //정점의 개수
	static int E; //간선의 개수
	static int map[][]; //그래프의 정보
	static List<Edge> list[]; 
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine()); //정점의 개수를 입력받음
		
		list = new ArrayList[N+1];
		map = new int[N+1][N+1];
		
		
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		E = Integer.parseInt(br.readLine()); //간선의 개수를 입력받음
		
		for(int i = 0; i < E; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			if(list[u].size() > 0) {
				boolean check = false; //동일한 간선이 있는지 확인 여부
				for(Edge e : list[u]) {
					if(e.vertex == u && e.other == v) { //이미 동일한 간선이 존재한다면 최소비용을 가진 가중치로 갱신
						e.weight = Math.min(e.weight, w);
						check = true;
						break;
					}
				}
				if(!check) { //동일한 간선이 없다면 간선 추가
					list[u].add(new Edge(u,v,w));
				}
			}
			else {
				list[u].add(new Edge(u,v,w));
			}
		}
		
		graph g = new graph(list);
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				map[i][j] = g.shortlist(i, j);
			}
		}
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

class graph {
	
	List<Edge> adjList[]; //그래프를 저장할 리스트
	int N; //정점의 개수
	
	
	
	public graph(List<Edge> graph[]) {
		adjList = graph;
		N = graph.length-1; //정점의 개수는 그래프의 길이 - 1
	}
	
	public int shortlist(int v, int u) {  //최단 경로 알고리즘 시작정점을 매개변수 v로 받음
		
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
		
		for(Edge e : adjList[minVertxt]) { //최소 정점의 인접 간선들을 가져옴
			if(!visited[e.other]) {
				int currentdist = dist[e.other];
				int newdist = dist[minVertxt] + e.weight;
				if(currentdist > newdist) {
					dist[e.other] = newdist;
				}
			}
			
		}
		
		}
		if(dist[u] == Integer.MAX_VALUE) {
			dist[u] = 0;
		}
		return dist[u];
		
	}
	
}


class Edge {
	
	int vertex; // 간선의 시작 정점
	int other; //간선의 다른쪽 정점
	int weight; //간선의 가중치
	
	public Edge(int vertex, int other, int weight) {
		this.vertex = vertex;
		this.other = other;
		this.weight = weight;
	}
}
