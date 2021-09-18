package a20210918;


import java.util.*;



public class a1743 {
	
	static int N;
	static int M;
	static int k;
	static int map[][];
	static boolean visited[][];
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	static int result = 0;
	
	
	public static void dfs(int y, int x) {  //dfs
		result++;  //쓰레기를 주움
		visited[y][x] = true; //해당 지역 방문 표시
		
		
		for(int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 0 && nextY >= 0 && nextX < M && nextY < N) {  //그래프 범위 안이면서
				if(!visited[nextY][nextX] && map[nextY][nextX] == 1) { //아직 방문하지 않았고, 해당 지역에 쓰레기가 잇다면
					dfs(nextY,nextX);  //재귀를 수행
				}
			}
		}
	}
	

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		k = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		int ans = 0;
		
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map[a-1][b-1] = 1;  //그래프 범위에 벗어나므로 각 인덱스에 1씩 빼서 초기화해줌
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(!visited[i][j] && map[i][j] == 1) {  //아직 방문하지 않았으며, 쓰레기가 있는 지역이면
					result = 0;  //쓰레기를 줍기전에 크기를 0으로 초기화시킴
					dfs(i,j);  //dfs 수행
					ans = Math.max(ans, result); //쓰레기 크기의 최댓값을 ans 변수에 저장.
				}
			}
		}
		
		System.out.print(ans);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
