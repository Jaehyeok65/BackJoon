package a20220914;

import java.util.*;
import java.io.*;



public class a7569 {
	
	static Queue<tomato> que = new LinkedList<>(); //큐를 생성 후
	static int N; //
	static int M; //
	static int H; //
	static int[] dm = {0,0,-1,1,0,0};
	static int[] dn = {1,-1,0,0,0,0};
	static int[] dh = {0,0,0,0,1,-1};
	static int map[][][]; //3차원 배열로 높이까지 저장
	
	
	public static int bfs() {
			
		
		while(!que.isEmpty()) {
			tomato t = que.poll(); //큐에 들어있는 토마토를 뺌
			for(int i = 0; i < 6; i++) {
				int nextY = t.y + dn[i];
				int nextX = t.x + dm[i];
				int nextZ = t.z + dh[i];
				
				if(nextY < 0 || nextY >= N || nextX < 0 || nextX >= M || nextZ < 0 || nextZ >= H) {
					continue; //map의 범위를 벗어나면 안되므로 벗어나면 continue를 하여 다음 루프로 넘어감
				}
				
				if(map[nextY][nextX][nextZ] == 0) { //다음으로 탐색할 위치가 아직 익지 않은 토마토라면
					que.add(new tomato(nextY,nextX,nextZ)); //토마토는 다음날 익으므로 day +1해주고 큐에 삽입
					map[nextY][nextX][nextZ] = map[t.y][t.x][t.z] + 1;
				}
			}
		} 
		
		int result = Integer.MIN_VALUE;
		
		for(int i = 0; i < H; i++) { //상자의 높이 만큼 루프
			for(int j = 0; j < N; j++) { //상자의 칸수만큼 루프
				for(int k = 0; k < M; k++) {
					if(map[j][k][i] == 0) {
						return - 1;
					}
					result = Math.max(result, map[j][k][i]);
				}
				
			}
		}  
		
		if(result == 1) {
			return -1;
		}
		else {
			return result - 1;
		}
		
		
	
		
	}

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		map = new int[N][M][H];
		
		for(int i = 0; i < H; i++) { //상자의 높이 만큼 루프
			for(int j = 0; j < N; j++) { //상자의 칸수만큼 루프
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < M; k++) {
					map[j][k][i] = Integer.parseInt(st.nextToken());
				}
			}
		}  //map초기화
		
		for(int i = 0; i < H; i++) { //상자의 높이 만큼 루프
			for(int j = 0; j < N; j++) { //상자의 칸수만큼 루프
				for(int k = 0; k < M; k++) {
					if(map[j][k][i] == 1) {
						que.add(new tomato(j,k,i));
					}
				}
			}
		}  
		System.out.print(bfs());
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}


class tomato {
	
	int x; //x축 좌표
	int y; //y축 좌표
	int z; //z축 좌표
	
	public tomato(int y, int x, int z) {
		this.y = y;
		this.x = x;
		this.z = z;
	}
}
