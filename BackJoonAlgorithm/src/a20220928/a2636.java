package a20220928;

import java.io.*;
import java.util.*;



public class a2636 {
	
	static int N;
	static int M;
	static int map[][]; //치즈의 내부와 외부를 구별해야하는데 어떻게?
	static boolean visited[][];
	static int dy[] = {-1,1,0,0};
	static int dx[] = {0,0,-1,1};
	static int count = 0;
	static int result = 0;
	
	
	public static void solve() {
		Queue<cheeze> que = new LinkedList<>();
		visited = new boolean[N][M]; //solve를 할 때 마다 방문기록을 초기화해줘야하므로
		visited[0][0] = true; //0,0부터 시작
		que.add(new cheeze(0,0));
		
		
		while(!que.isEmpty()) {
			cheeze c = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextY = c.y + dy[i];
				int nextX = c.x + dx[i];
				
				if(nextY < 0 || nextX < 0 || nextY >= N || nextX >= M) continue; //범위를 벗어나면 continue
				if(!visited[nextY][nextX] && map[nextY][nextX] == 0) {
					visited[nextY][nextX] = true;
					que.add(new cheeze(nextY,nextX));
				}
				if(!visited[nextY][nextX] && map[nextY][nextX] == 1) {
					map[nextY][nextX] = 2; //1초 뒤 녹을 치즈라는 뜻
				}
			}
		}
		
		
		
	}
	
	public static int melt() {
		int count = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 2) { //1초뒤에 녹을 치즈를 녹여줌
					map[i][j] = 0;
					count++;
				}
			}
		}
		return count;
	}
	


	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} //입력 완료
		
		while(true) {
			solve(); //bfs를 수행함
			int tmp = melt();
			if(tmp == 0) { //더 녹을 치즈가 없으므로
				break;
			}
			else { //더 녹을 치즈가 있으므로 count를 증가시켜주며 녹을 치즈를 result에 대입
				result = tmp;
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(result);
		
		
		
		// TODO Auto-generated method stub

	}

}

class cheeze {
	int x;
	int y;
	
	public cheeze(int y, int x) {
		this.y = y;
		this.x = x;
	}
}
