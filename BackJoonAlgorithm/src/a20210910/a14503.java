package a20210910;

import java.util.*;



public class a14503 {
	static int N; //세로 크기
	static int M; //가로 크기
	static int r; //가로 좌표
	static int c; //세로 좌표
	static int d; //처음 바라보는 방향 0 == 북, 1 == 동 , 2 == 남, 3 == 서
	static int dr[] = {-1,0,1,0}; //북동남서
	static int dc[] = {0,1,0,-1}; //북동남서
	static int map[][];  //영역
	static boolean visited[][]; //청소를 했는지 여부를 확인하는 방문배열
	static int count = 0;
	
	
	static void dfs(int r, int c, int d) {
		boolean flag = false; //네방향이 모두 청소되어 있는지 확인할 flag 변수
		
		if(!visited[r][c]) {  //아직 청소되지 않은 부분이라면 청소한 후 청소한 영역의 크기 증가
			visited[r][c] = true;
			count++;
		}
		
		for(int i = 0; i < 4; i++) {
			d = lotate(d);  //회전 메소드를 통해 바라보는 방향의 왼쪽으로 회전시킴
			int nr = r + dr[d];  //회전시킨 방향으로 전진
			int nc = c + dc[d];
			
			if(map[nr][nc] == 0 && !visited[nr][nc]) { //그 부분이 벽이 아니며 청소안한 부분이라면 
				dfs(nr,nc,d); //청소를 수행
				flag = true;
				break;
			}
		}
		
		if(flag == false) { //네방향 다 청소가 된 부분이라면
			int nr = r - dr[d];  //후진을 함
			int nc = c - dc[d];
			
			if(map[nr][nc] == 0) {  //후진을 한 부분이 벽이 아니라면 청소를 수행
				dfs(nr,nc,d);
			}
		}
		
		
	}
	
	public static int lotate(int d) { //바라보는 방향에서 왼쪽으로 회전함
		if(d == 0) {   //북쪽인 경우 서쪽으로 회전
			return 3;
		}
		else if(d == 1) { //동쪽인 경우 북쪽으로 회전
			return 0;
		}
		else if(d == 2) {
			return 1;
		}
		else {
			return 2;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();  //세로 크기 입력
		M = sc.nextInt();  //가로 크기 입력
		r = sc.nextInt();  //로봇 청소기의 가로 좌표
		c = sc.nextInt();  //로봇 청소기의 세로 좌표
		d = sc.nextInt();  //로봇 청소기가 처음 바라보는 방향
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();  //영역을 초기화
			}
		}
		
		dfs(r,c,d);
		
		System.out.print(count);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
