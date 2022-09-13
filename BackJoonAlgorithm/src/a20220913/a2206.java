package a20220913;


import java.util.*;
import java.io.*;


public class a2206 {
	static int map[][];
	static boolean visited[][][];
	static int[] dx = {0,0,-1,1}; //상하좌우로 이동
	static int[] dy = {1,-1,0,0};
	static int N;
	static int M;
	static int count = -1;
	static boolean checks = false;
	
	
	public static void bfs(int n, int m) {
		
		visited[n][m][0] = true; //방문표시
		visited[n][m][1] = true;
		Queue<dot> que = new LinkedList<>();
		que.add(new dot(n,m,1,0)); //초반 거리는 1이므로
		
		while(!que.isEmpty()) {
			dot d = que.poll();
			
			
			if(d.n == N-1 && d.m == M-1) {
				count = d.dist;
				return;
			}
			
			
			 for (int i = 0; i < 4; i++) {
	                int nextM = d.m + dx[i];
	                int nextN = d.n + dy[i];
	 
	                if (nextN >= 0 && nextN < N && nextM >= 0 && nextM < M) {
	                    if(map[nextN][nextM] == 0) { //벽이 아닐 때
	                        if (visited[nextN][nextM][d.dril] == false) { //현재까지 온 방법(벽을 부쉈는지 아닌지)으로 방문한 적이 없다면 방문한다.
	                            que.add(new dot(nextN, nextM, d.dist + 1, d.dril));
	                            visited[nextN][nextM][d.dril] = true;
	                        }
	                    }    
	                    else if (map[nextN][nextM] == 1) { //벽일때
	                        if (d.dril == 0 && visited[nextN][nextM][1] == false) { //현재까지 벽을 부순적이 없고, 벽을 부숴서 방문한 적이 없다면 방문한다.
	                            que.add(new dot(nextN, nextM, d.dist + 1, 1));
	                            visited[nextN][nextM][1] = true;
	                        }
	                    }
	                }
		}
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		visited = new boolean[N][M][2];
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0 ; j < M; j++) {
				map[i][j] = Integer.parseInt(s.substring(j,j+1));
			}
		}
		bfs(0,0);
		
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}


class dot {
	
	int n;
	int m;
	int dist;
	int dril;
	
	public dot(int n, int m, int dist, int dril) {
		this.n = n;
		this.m = m;
		this.dist = dist;
		this.dril = dril;
	}
}
