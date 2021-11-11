package a20211111;


import java.util.*;

class dot {
	int x;
	int y;
	public dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class programss_level2_2 {
	
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1}; //상하 좌우 이동
	
	
	public static int bfs(int x, int y, int place[][],boolean check[][]) {
		Queue<dot> que = new LinkedList<>();
		que.add(new dot(x,y));
		check[x][y] = true;
		int maxsize = 0;
		int count = 1;
		
	     while(!que.isEmpty()) {
			
			dot d = que.poll();
		
			
			for(int i = 0; i < 4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
			
				if(nextX < 0 || nextY < 0 || nextX >= place.length || nextY >= place[0].length) { //맵의 범위에서 벗어나면 continue
					continue;
				}
				
				if(!check[nextX][nextY]) { //아직 방문을 하지 않았으며
					if(place[nextX][nextY] == place[d.x][d.y]) { //영역의 색깔이 같다면
						que.add(new dot(nextX,nextY));   //큐에 집어넣고
						check[nextX][nextY] = true;
						count++;
					}
				}
				
			}
		}
	     
	     return count;
	}
	public static int[] solution(int m, int n , int place[][]) {
		int numberOfArea = 0;
		int maxsize = 0;
		int answer[] = new int[2];
		boolean check[][] = new boolean[m][n];
		
		for(int i = 0; i < m; i++) {
			
			for(int j = 0; j < n; j++) {
				if(!check[i][j] && place[i][j] != 0) {
					maxsize = Math.max(maxsize, bfs(i,j,place,check));
					numberOfArea += 1;
				}
			}
		}
		answer[0] = numberOfArea;
		answer[1] = maxsize;
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		return answer;
		
	}

	public static void main(String[] args) {
		
		
		int m = 6;
		int n = 4;
		int place[][] = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		
		solution(m,n,place);
		// TODO Auto-generated method stub

	}

}
