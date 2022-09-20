package a20220920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class a13308 {
	
	static class Edge {
		int to, cost;
		
		Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}
	
	static class Node implements Comparable<Node> {
		int pos, minOilCost;
		long totalOilCost;
		
		Node (int pos, int minOilCost, long totalOilCost) {
			this.pos = pos;
			this.minOilCost = minOilCost;
			this.totalOilCost = totalOilCost;
		}

		@Override
		public int compareTo(Node o) {
			return Long.compare(this.totalOilCost, o.totalOilCost);
		}
	}
	
	static int N, M;
	static int[] cost;
	static List<Edge>[] edges;
	
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			cost = new int[N + 1];
			edges = new ArrayList[N + 1];
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; ++i) {
				cost[i] = Integer.parseInt(st.nextToken());
				edges[i] = new ArrayList<>();
			}
            
			for (int i = 0; i < M; ++i) {
				st = new StringTokenizer(br.readLine());
				int f = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				edges[f].add(new Edge(t, d));
				edges[t].add(new Edge(f, d));
			}
            
			bw.write(dijkstra() + "\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static long dijkstra() {
    		//dp[i][j] : i번 정점에 j(minOilCost)를 가지고 방문했을때의 최소 비용
		long[][] dp = new long[N + 1][2501];
		for (int i = 0; i <= N; ++i) Arrays.fill(dp[i], 15625000001L);
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(1, cost[1], 0));
		
		while (!pq.isEmpty()) {
			Node n = pq.poll();
			
			if (n.pos == N) return n.totalOilCost;
			
			for (Edge e : edges[n.pos]) {
				if (dp[e.to][n.minOilCost] <= n.totalOilCost + (e.cost * n.minOilCost)) continue;
				dp[e.to][n.minOilCost] = n.totalOilCost + (e.cost * n.minOilCost);
				pq.offer(new Node(e.to, Math.min(n.minOilCost, cost[e.to]), dp[e.to][n.minOilCost]));	
			}
		}
		return -1;
	}
}