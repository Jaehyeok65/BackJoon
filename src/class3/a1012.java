package class3;


import java.util.*;




public class a1012 {
	
	static int map[][];
	static boolean visited[][];
	static int N;
	static int M;
	static int K;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,-1,0,1};
	
	static void bfs(int x, int y) { //정점 v에서 부터 bfs를 수행
		
		Queue<dot> que = new LinkedList<>();
		dot d = new dot(x,y);
		que.add(d);
		
		while(!que.isEmpty()) {
			dot q = que.poll();
			
			for(int i = 0; i < 4; i++) {
					int nextX = q.x + dx[i];
					int nextY = q.y + dy[i];
					if(nextX >= 0 && nextX < M && nextY >= 0 && nextY < N) { //범위가 맵 밖으로 나가지 않게 하기위함.
						if(map[nextX][nextY] == 1 && !visited[nextX][nextY]) { //배추가 있고 방문하지 않았다면
							que.add(new dot(nextX,nextY));
							visited[nextX][nextY] = true;
						}
						
						
					}

			}
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		
		while(Test --> 0) {
			
			M = sc.nextInt(); //가로 길이
			N = sc.nextInt(); //세로 길이
			map = new int[M][N]; //이차원 배열에서 세로는 , 가로는 열을 나타냄.
			visited = new boolean[M][N];
			K = sc.nextInt(); //배추가 심어져있는 위치의 개수 (이걸로 반복 수행)
			int count = 0;
			
			for(int i = 0; i < K; i++) { //배추의 위치를 초기화
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a][b] = 1;
			}
			
			for(int j = 0; j < M; j++) {
				for(int t = 0; t < N; t++) {
					if(map[j][t] == 1 && !visited[j][t]) {
						bfs(j,t);
						count++;
					}
				}
			}
			System.out.println(count);
			
			
		}
		// TODO Auto-generated method stub

	}

}
