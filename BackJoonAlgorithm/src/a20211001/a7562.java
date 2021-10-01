package a20211001;


import java.util.*;


class Dot {
	int x,y;
	
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class a7562 {
	static int N;
	static int map[][];
	static boolean visited[][];
	static int count[][];
	static int dx[] = {1,2,2,1,-1,-2,-2,-1};   //나이트의 이동 가능한 경로
	static int dy[] = {2,1,-1,-2,-2,-1,1,2};
	
	public static void bfs(int x1, int y1, int x2, int y2) {
		Queue<Dot> que = new LinkedList<>();
		que.add(new Dot(x1,y1));   //나이트의 현재 좌표를 큐에 넣음
		visited[x1][y1] = true;    //현재 좌표 방문 처리
		while(!que.isEmpty()) {
			
			Dot d = que.poll();
			
			for(int i = 0; i < 8; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= N) {  //맵의 범위에서 벗어나면 continue
					continue;
				}
				
				if(!visited[nextX][nextY]) {  //아직 방문하지 않았으면
					visited[nextX][nextY] = true;  //방문표시를 하고
					que.add(new Dot(nextX,nextY)); //큐에 넣음
					count[nextX][nextY] = count[d.x][d.y] + 1;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(T --> 0) {
			N = sc.nextInt();
			map = new int[N][N];
			visited = new boolean[N][N];
			count = new int[N][N];
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();   //나이트의 현재 좌표
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();   //나이트의 이동 좌표
			bfs(x1,y1,x2,y2);
			sb.append(count[x2][y2] + "\n");
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
