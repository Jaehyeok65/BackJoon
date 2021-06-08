package class3;


import java.util.*;

	
	
public class a2667 {
	
	
	static int N;
	static int arr[][];
	static boolean visited[][];
	static int dx[] = {-1,0,1,0}; //가로 이동방향
	static int dy[] = {0,-1,0,1}; //세로 이동방향
	static ArrayList<Integer> list=  new ArrayList<>();
	
	
	static void bfs(int x, int y) {
		
		Queue<dot> que = new LinkedList<>();
		int cnt = 1;
		visited[x][y] = true;
		que.add(new dot(x,y));
		
		while(!que.isEmpty()) {
			
			dot d = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextX = d.x + dx[i];
				int nextY = d.y + dy[i];
				
				if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < N ) { //맵의 범위를 넘어서면 안됨
					if(!visited[nextX][nextY] && arr[nextX][nextY] != 0) { //방문하지 않았고 방문할 위치가 집이 있다면 
						que.add(new dot(nextX,nextY));
						visited[nextX][nextY] = true;
						cnt++;
						}
					
				}
			}
		}
		list.add(cnt);
		
		
	}

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N][N];
		visited = new boolean[N][N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			String s = sc.next();
			for(int j = 0; j < N; j++) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visited[i][j] && arr[i][j] == 1) {
					bfs(i,j);
					count++;
				}
			}
		}
		System.out.println(count);
		
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// TODO Auto-generated method stub

	}

}
