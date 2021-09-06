package a20210906;


import java.util.*;



public class a2583 {
	
	static int N;
	static int M;
	static int result = 0;
	static ArrayList<Integer> list = new ArrayList<>();  //직사각형을 추가하고 정렬을 수행할 리스트
	static int dx[] = {-1,1,0,0}; //상하좌우를 구현할 dx, dy 배열
	static int dy[] = {0,0,-1,1};
	
	public static void put(int map[][], int x1, int y1, int x2, int y2) {  //그래프를 2차원 배열에 입력
		
		
		for(int i = y1; i < y2; i++) {
			
			for(int j = x1; j < x2; j++) {
				map[i][j] = 1;
			}
		}
		
	}
	
	public static void dfs(int map[][], int n, int m) {
		
		map[n][m] = 1; //0이 아니면 방문을 했다는 의미로 방문을 표시
		result++; //면적을 구해야하므로
		
		for(int i = 0; i < 4; i++) {
			int nextX = n + dx[i];
			int nextY = m + dy[i];
			
			if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) {
				continue;
			}
			if(map[nextX][nextY] == 0) {
				dfs(map,nextX,nextY);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		M = sc.nextInt(); //세로칸
		N = sc.nextInt(); //가로칸
		int map[][] = new int[M][N];
		
		int k = sc.nextInt(); //직사각형의 개수
		
		for(int i = 0; i < k; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			put(map,x1,y1,x2,y2);
		}
		
		for(int i = 0; i < M; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(map[i][j] == 0) {
					result = 0;
					dfs(map,i,j);
					list.add(result);  //리스트에 영역의 넓이를 추가함
				}
			}
		}
		
		System.out.println(list.size());  //영역의 개수를 출력
		
		Collections.sort(list);  //영역의 넓이를 오름차순으로 정렬함
		
		for(int i = 0; i < list.size(); i++) {  //영역의 넓이를 오름차순으로 출력
			System.out.print(list.get(i) + " ");
		}
		// TODO Auto-generated method stub

	}

}
