package a20220915;




import java.util.*;
import java.io.*;


public class a1753 {
	
	static int V; //정점의 개수
	static int E; //간선의 개수
	static int first; //시작 정점
	static List<Edge> g[];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken());
		
		E = Integer.parseInt(st.nextToken());
		
		g = new ArrayList[V+1]; //V개의 정점을 가진 그래프 리스트 생성 (1부터 V까지이므로 V+1해줌)
		
		for(int i = 1; i <= V; i++) {
			g[i] = new ArrayList<>(); //그래프를 초기화 시켜줌
		}
		
		first = Integer.parseInt(br.readLine()); //시작 정점을 입력해줌
		
		for(int i = 0; i < E; i++) { //간선의 개수만큼 입력받음
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st1.nextToken()); //시작 정점
			int v = Integer.parseInt(st1.nextToken()); //끝 정점
			int w = Integer.parseInt(st1.nextToken()); //가중치
			Edge e = new Edge(u,v,w); //위 객체를 토대로 간선 객체를 생성해줌
			g[u].add(e); //시작정점이 u이므로 u 그래프 배열에 간선 e를 추가해줌
		}
		
		graph gr = new graph(g); //입력받은 그래프를 토대로 gr 그래프 객체를 생성
		
		int [] result = gr.shortlist(first);
		
		for(int i = 1; i < result.length; i++) {
			System.out.println(result[i] == Integer.MAX_VALUE ? "INF" : result[i]);
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
		
		return dist;
		
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
