package a20210923;


import java.util.*;


class Dot {
	
	int x,y;
	
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class a4963 {
	
	static int W;   //지도의 너비
	static int H;   //지도의 높이
	static int map[][];   //지도 배열 선언
	static boolean visited[][];
	static int dx[] = {-1,1,0,0,1,1,-1,-1}; //상하좌우 대각선까지 이동구현
	static int dy[] = {0,0,1,-1,-1,1,-1,1};
	
	
	
	public static void bfs(int x, int y) {
		Queue<Dot> que = new LinkedList<>();
		
		visited[x][y] = true;
		que.add(new Dot(x,y));
		
		while(!que.isEmpty()) {
			
			Dot d = que.poll();
			
			for(int i = 0; i < 8; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				
				if(nextX < 0 || nextX >= H || nextY < 0 || nextY >= W) {
					continue;    //지도의 범위를 벗어나면 건너뜀
				}
				
				if(!visited[nextX][nextY] && map[nextX][nextY] == 1) {  //아직 방문하지 않았으며 다음땅이 육지면
					visited[nextX][nextY] = true;
					que.add(new Dot(nextX,nextY));
				}
				
				
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		
		while(true) {
			W = sc.nextInt();
			H = sc.nextInt();
			map = new int[H][W];
			visited = new boolean[H][W];
			int count = 0;
			if(W == 0 && H == 0) {
				break;
			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(map[i][j] == 1 && !visited[i][j]) {
						bfs(i,j);
						count++;
					}
				}
			}
			
			sb.append(count+"\n");
			
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
