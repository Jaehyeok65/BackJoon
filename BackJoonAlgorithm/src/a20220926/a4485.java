package a20220926;


import java.util.*;
import java.io.*;


public class a4485 {
	static int N;
	static int map[][];
	static int dist[][];
	static int dy[] = {1,-1,0,0};
	static int dx[] = {0,0,1,-1}; //이동 방향 결정
	static boolean visited[][];
	
	
	public static int solve() {
		
		visited[0][0] = true;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				dist[i][j] = Integer.MAX_VALUE; //아직 방문하지 않은 거리는 무한대로 초기화
			}
		}
		
		dist[0][0] = map[0][0]; //0,0을 방문하므로 map[0][0]으로 초기화시켜줌
		
		PriorityQueue<dot> que = new PriorityQueue<>();
		
		que.add(new dot(0,0,dist[0][0]));
		
		while(!que.isEmpty()) {
			dot d = que.poll();
			//System.out.println(que.size());
			
			for(int i = 0; i < 4; i++) {
				int nextY = d.y + dy[i];
				int nextX = d.x + dx[i];
				
				if(nextY < 0 || nextY >= N || nextX < 0 || nextX >= N) continue;
				if(visited[nextY][nextX]) continue;
				
				if(dist[nextY][nextX] > dist[d.y][d.x] + map[nextY][nextX]) {
					dist[nextY][nextX] = dist[d.y][d.x] + map[nextY][nextX]; //간선완화
				}
				
				que.add(new dot(nextY,nextX,dist[nextY][nextX]));
				visited[nextY][nextX] = true;
			}
		}
		
		return dist[N-1][N-1];
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = 1;
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			map = new int[N][N];
			visited = new boolean[N][N];
			dist = new int[N][N];
			
			for(int i = 0; i < N; i++) { //map 입력
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			System.out.println("Problem " + count+ ": " + solve()); //출력 양식에 맞게 출력
			count++;
			
		}
		
		
		// TODO Auto-generated method stub

	}

}

class dot implements Comparable<dot> {
	int y;
	int x;
	int w;
	
	public dot(int y, int x, int w) {
		this.y = y;
		this.x = x;
		this.w = w;
	}

	@Override
	public int compareTo(dot o) {
		// TODO Auto-generated method stub
		return this.w - o.w;
	}
}

