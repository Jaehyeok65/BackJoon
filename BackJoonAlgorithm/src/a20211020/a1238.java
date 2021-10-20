package a20211020;


import java.util.*;


public class a1238 {
	static int N;
	static int M;
	static int X;
	static int graph[][];
	static int graph2[][];
	static boolean visited[];
	static boolean visited2[];
	static int dis[];
	static int dis2[];
	
	public static void Daic(int start) {
		visited[start] = true;  //초기 방문 처리.
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i] && dis[i] == Integer.MAX_VALUE) { //아직 방문하지 않았으며 초기값인 maxvalue라면
				dis[i] = graph[start][i];  //최소 단위 거리인 dis[i]를 가중치값으로 초기화해줌.
			}
		}
		
		for(int a = 0; a < N - 1; a++) {
			
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			
			for(int i = 1; i <= N; i++) {
				if(!visited[i]) {
					if(dis[i] < min) {
						min = dis[i];
						min_index = i;
					}
				}
			}
			
			visited[min_index] = true;
			for(int i = 1; i <= N; i++) {
				if(!visited[i] && graph[min_index][i] != Integer.MAX_VALUE) {
					if(dis[min_index] + graph[min_index][i] < dis[i]) {
						dis[i] = dis[min_index] + graph[min_index][i];
					}
				}
			}
		}
		
		
		
		
		
	}
	
	public static void Daic2(int start) {
		visited2[start] = true;  //초기 방문 처리.
		
		for(int i = 1; i <= N; i++) {
			if(!visited2[i] && dis2[i] == Integer.MAX_VALUE) { //아직 방문하지 않았으며 초기값인 maxvalue라면
				dis2[i] = graph2[start][i];  //최소 단위 거리인 dis[i]를 가중치값으로 초기화해줌.
			}
		}
		
		for(int a = 0; a < N - 1; a++) {
			
			int min = Integer.MAX_VALUE;
			int min_index = -1;
			
			for(int i = 1; i <= N; i++) {
				if(!visited2[i]) {
					if(dis2[i] < min) {
						min = dis2[i];
						min_index = i;
					}
				}
			}
			
			visited2[min_index] = true;
			for(int i = 1; i <= N; i++) {
				if(!visited2[i] && graph2[min_index][i] != Integer.MAX_VALUE) {
					if(dis2[min_index] + graph2[min_index][i] < dis2[i]) {
						dis2[i] = dis2[min_index] + graph2[min_index][i];
					}
				}
			}
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		X = sc.nextInt();
		
		graph = new int[N+1][N+1];
		graph2 = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				graph[i][j] = Integer.MAX_VALUE;
				graph2[i][j] = Integer.MAX_VALUE;
			}
		}
		visited = new boolean[N+1];
		visited2 = new boolean[N+1];
		dis = new int[N+1];
		dis2 = new int[N+1];
		Arrays.fill(dis,Integer.MAX_VALUE);
		Arrays.fill(dis2,Integer.MAX_VALUE);
		
		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int weight = sc.nextInt();
			graph[start][end] = weight;  //가고 오는 길이 다르므로 반대는 성립하지 않음
			graph2[end][start] = weight;
		}
		
		Daic(X);
		Daic2(X);
		
		int result = 0;
		
		for(int i = 1; i <= N; i++) {
			result = Math.max(result, dis[i] + dis2[i]);
		}
		System.out.println(result);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
