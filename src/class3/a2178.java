package class3;


import java.util.*;


class dot {
	
	int x;
	int y;
	
	public dot(int x, int y) {
		this.x= x;
		this.y = y;
	}
	
}
public class a2178 {
	
	static Queue<dot> que = new LinkedList<>();
	static boolean visited[][];
	static int arr[][];
	static int N;
	static int M;
	static int[] dx = {-1,0,1,0}; //x
	static int[] dy = {0,-1,0,1};
	
	static void bfs(int x, int y) { //시작정점과 인접행렬
		
		que.add(new dot(x,y));
		
		while(!que.isEmpty()) {
			
			dot d = que.poll();
			
			for(int i = 0; i < 4; i++) {
				
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
					if(!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
						que.add(new dot(nextX,nextY));
						arr[nextX][nextY] = arr[d.x][d.y] + 1;
						visited[nextX][nextY] = true;
					}
					
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		arr = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
				visited[i][j] = false;
			}
		}
		visited[0][0] = true;
		bfs(0,0);
		System.out.print(arr[N-1][M-1]);
		
		
		// TODO Auto-generated method stub

	}

}
