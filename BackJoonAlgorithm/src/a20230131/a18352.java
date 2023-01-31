package a20230131;

import java.util.*;
import java.io.*;

public class a18352 {
	
	private static final int INF = Integer.MAX_VALUE;
	static List<List<Node>> list = new ArrayList<>();
	static int dist[];
	static int N, M, K, X;

	static class Node implements Comparable<Node> {
		int data;
		int weight;

		public Node(int data, int weight) {
			this.data = data;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return weight - o.weight;
		}

	} // End of Node class

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());

		dist = new int[N+1];
		
		Arrays.fill(dist, INF);
		
		list = new ArrayList<>();
		
		for(int i=0; i<=N; i++) { //간선 리스트를 만듬
			list.add(new ArrayList<>());
		}

		while(M-->0) { //입력받은 간선을 리스트에 추가함
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			list.get(x).add(new Node(y, 1));
		}

		dijkstra(X);

		for(int i=1; i<dist.length; i++) {
			if(dist[i] == K) {
				sb.append(i).append('\n');
			}
		}

		if(sb.length() == 0) {
			System.out.println(-1);
		} 
		else {
			System.out.println(sb);
		}

	} // End of main

	private static void dijkstra(int cityNum) {
		PriorityQueue<Node> que = new PriorityQueue<>();
		boolean visit[] = new boolean[N+1];
		dist[cityNum] = 0;

		que.offer(new Node(cityNum, 0));

		while( !que.isEmpty() ) {
			Node node = que.poll();
			int num = node.data;

			if(visit[num]) continue;

			visit[num] = true;

			for(Node n : list.get(num)) {

				if( !visit[n.data] && dist[n.data] > (n.weight + dist[num]) ) {
					dist[n.data] = n.weight + dist[num];
					que.offer(new Node(n.data, dist[n.data]));
				}
			}			
		}

	} // End of dijkstra
} // End of Main class
