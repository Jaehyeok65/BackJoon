package class3;


import java.util.*;
	
	
public class a10026 {
	
	static int dx[] = {0,-1,0,1};
	static int dy[] = {-1,0,1,0};
	static int N;
	static boolean visited[][];
	static char map[][];
	
	
	static void bfs(int x, int y) {
		
		Queue<dot> que = new LinkedList<>();
		
		que.add(new dot(x,y));
		char color = map[x][y];
		visited[x][y] = true;
		
		while(!que.isEmpty()) {
			
			dot d = que.poll();

			for(int i = 0; i < 4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N) {
					if(!visited[nextX][nextY] && map[nextX][nextY] == color) {
						que.add(new dot(nextX,nextY));
						visited[nextX][nextY] = true;
					}
				} 
			}
		}
	}

     
    
  



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		map = new char[N][N];
		visited = new boolean[N][N];
		int count[] = {0,0};
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			for(int j = 0; j < N; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j]) {
					bfs(i,j);
					count[0]++;
			}
		}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				visited[i][j] = false;
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(map[i][j] == 'G') {
					map[i][j] = 'R';
				}
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j]) {
					bfs(i,j);
					count[1]++;
			}
		}
		}
		System.out.print(count[0]+" "+count[1]);
		// TODO Auto-generated method stub

	}

}

