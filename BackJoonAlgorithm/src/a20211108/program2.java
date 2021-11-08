package a20211108;


import java.util.*;

class dot{
	
	int x;
	int y;
	int dis;
	
	public dot(int x,int y, int dis) {
		this.x = x;
		this.y= y;
		this.dis = dis;
	}
}
public class program2 {
	static int dx[] = {1,-1,0,0};  //상하좌우 이동을 위한 배열
	static int dy[] = {0,0,1,-1};
	
	public static int[] solution(String place[][]) {
		
		char[][] result = new char[5][5];
		char[][] result2 = new char[5][5];
		char[][] result3 = new char[5][5];
		char[][] result4 = new char[5][5];
		char[][] result5 = new char[5][5];
		int ans[] = new int[5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				char c[] = place[0][i].toCharArray();
				result[i][j] = c[j];
		}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				char c[] = place[1][i].toCharArray();
				result2[i][j] = c[j];
		}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				char c[] = place[2][i].toCharArray();
				result3[i][j] = c[j];
		}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				char c[] = place[3][i].toCharArray();
				result4[i][j] = c[j];
		}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				char c[] = place[4][i].toCharArray();
				result5[i][j] = c[j];
		}
		}
		ans[0] = sol(result);
		ans[1] = sol(result2);
		ans[2] = sol(result3);
		ans[3] = sol(result4);
		ans[4] = sol(result5);
		
		return ans;
		/*for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(result5[i][j] + " ");
			}
			System.out.println("");
		}*/
		
		
		
	}
	
	public static int sol(char [][] result) {
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(result[i][j] == 'P') {
					int ans = bfs(result,i,j);
					if(ans == 0) {
						return 0;
					}
				}
			}
		}
		return 1;
	}
	
	public static int bfs(char [][] result, int x, int y) {
		boolean visited[][] = new boolean[5][5];
		
		Queue<dot> que = new LinkedList<>();
		visited[x][y] = true;
		que.add(new dot(x,y,0));
		
		while(!que.isEmpty()) {
			
			dot d = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				if(nextX > 4 || nextY > 4 || nextX < 0 || nextY < 0) 
					continue;
				
				if(result[nextX][nextY] == 'X' || visited[nextX][nextY])
					continue;
				
				visited[nextX][nextY] = true;
				
				if(d.dis > 2) continue;
				
				if(d.dis > 0 && result[d.x][d.y] == 'P') {
					return 0;
				}
				que.add(new dot(nextX,nextY,d.dis+1));
			}
		}
		
		return 1;
		
				
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		String[][] place = {{"POOOP","OXXOX","OPXPX","OOXOX","POXXP"},
				            {"POOPX","OXPXP","PXXXO","OXXXO","OOOPP"},
				            {"PXOPX","OXOXP","OXPOX","OXXOP","PXPOX"},
				            {"OOOXX","XOOOX","OOOXX","OXOOX","OOOOO"},
				            {"PXPXP","XPXPX","PXPXP","XPXPX","PXPXP"}
		};
	
		int [] result = solution(place);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
