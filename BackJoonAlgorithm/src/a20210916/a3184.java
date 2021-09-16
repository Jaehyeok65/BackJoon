package a20210916;

import java.util.*;
import java.io.*;


class Point {
	int x;
	int y;
	
	public Point(int y, int x) {
		this.x = x;
		this.y = y;
	}
}


public class a3184 {
	static int N;  //맵의 세로
	static int M; //맵의 가로
	static char map[][];
	static boolean visited[][];
	static int dy[] = {-1,0,1,0}; //세로
	static int dx[] = {0,1,0,-1}; //가로
	static int sheep = 0; //양의 수를 저장할 변수
	static int wolf = 0;  //늑대의 수를 저장할 변수
	
	
	public static void bfs(int y, int x) {  //y는 세로, x는 가로
		
		Queue<Point> que = new LinkedList<>();
		visited[y][x] = true;  //좌표를 방문 처리한 후
		que.add(new Point(y,x)); //큐에 넣음
		
		while(!que.isEmpty()) {
			
			Point p = que.poll();  //큐에서 추출한 후
			if(map[p.y][p.x] == 'o') {  //양이면 양의 수를 증가시킴
				sheep++;
			}
			else if(map[p.y][p.x] == 'v') { //늑대면 늑대의 수를 증가시킴
				wolf++;
			}
			
			for(int i = 0; i < 4; i++) {  //좌표를 이동하면서
				int nextY = p.y + dy[i]; //세로로 이동
				int nextX = p.x + dx[i]; //가로로 이동
				
				if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N || visited[nextY][nextX] || map[nextY][nextX] == '#') {
					continue;
				}  //map의 범위에서 벗어났거나, 방문한 곳이거나 , 울타리면은 건너뜀
				visited[nextY][nextX] = true;  //다음곳을 방문한 후
				que.add(new Point(nextY,nextX)); //큐에 넣음
				
				
			}
		}
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1[] = br.readLine().split(" ");
		N = Integer.parseInt(str1[0]);
		M = Integer.parseInt(str1[1]);
		
		map = new char[N][M];  //맵을 선언
		visited = new boolean[N][M];  //방문 배열을 선언
		for (int i = 0; i < N; i++) map[i] = br.readLine().toCharArray();
		int wolfcount = 0;  //늑대의 결과를 담을 변수
		int sheepcount = 0; //양의 결과를 담을 변수
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(!visited[i][j] && map[i][j] != '#') { //벽이 아니면서 방문하지 않은 곳이면
					sheep = 0; // bfs 루프를 돌 때 마다 늑대와 양의 수를 카운팅해야하므로 bfs전에 0으로 초기화시켜줌 
					wolf = 0;  //
					bfs(i,j);
					if(wolf >= sheep) { //늑대의 수가 양과 같거나 크다면
						wolfcount += wolf; //늑대가 양을 다 잡아먹음
					}
					else {              //양의 수가 더 많다면 양이 늑대를 쫓아냄
						sheepcount += sheep;
					}
				}
			}
		}
		
		System.out.print(sheepcount + " " + wolfcount);  //결과 출력
		
		
	

		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
