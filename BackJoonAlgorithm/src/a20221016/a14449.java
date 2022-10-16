package a20221016;

import java.util.*;
import java.io.*;



public class a14449 {
	static int N; //세로 크기
	static int M; //가로 크기
	static int x;
	static int y; //주사위 초기 좌표
	static int K; //명령 개수
	static int map[][];
	static int dx[] = {0,1,-1,0,0};
	static int dy[] = {0,0,0,-1,1}; //동서북남
	static int dice[] = new int[7]; //주사위를 선언 dice[1]이 바닥면
	
	public static void solve(int m) { //현재 좌표와 이동 방향을 가져옴
		int nextX = x + dx[m];
		int nextY = y + dy[m];
		if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) return; //바깥으로 벗어나면  리턴
		
		move(m);
		
		if(map[nextY][nextX] == 0) {
			map[nextY][nextX] = dice[1];
		}
		else {
			dice[1] = map[nextY][nextX];
			map[nextY][nextX] = 0;
		}
		
		System.out.println(dice[6]);
		x = nextX;
		y = nextY;
		
	}
	
	private static void move(int num) {
		int temp[] = new int[7];
		
		for(int i=1; i<=6; i++) {
			temp[i] = dice[i];
		}
		
		if(num == 1) { //동쪽으로 이동하는 경우
			dice[3] = temp[6];
			dice[1] = temp[3];
			dice[6] = temp[4];
			dice[4] = temp[1];
		}
		else if(num == 2) {
			dice[3] = temp[1];
			dice[1] = temp[4];
			dice[6] = temp[3];
			dice[4]	= temp[6];	
		}
		else if(num == 3) {
			dice[1] = temp[2];
			dice[2] = temp[6];
			dice[6] = temp[5];
			dice[5] = temp[1];
		}
		else if(num == 4) {
			dice[1] = temp[5];
			dice[2] = temp[1];
			dice[6] = temp[2];
			dice[5] = temp[6];
		} //주사위면 이동 완료
	}
	
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < K; i++) {
			solve(Integer.parseInt(st.nextToken()));
		}; //입럭완료
		
		
		
		// TODO Auto-generated method stub

	}

}
