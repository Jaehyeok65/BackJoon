package a20210912;


import java.util.*;

class dot {
	int x;
	int y;
	
	public dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
}


public class a15686 {
	static ArrayList<dot> chiken = new ArrayList<dot>();
	static ArrayList<dot> home = new ArrayList<>();
	static int N;
	static int M;
	static int map[][];
	static int ans;
	static int result;
	static boolean visited[];
	
	
	static void dfs(int start, int count) { //count = 치킨집이 오픈한 개수
		if(count == M) {   //M빼고는 다 폐업이므로 M개가 되면 최단거리를 구함
			ans = 0;
		
		
		for(int i = 0; i < home.size(); i++) {
			
			int temp = Integer.MAX_VALUE;
			
			for(int j = 0 ; j < chiken.size(); j++) {
				if(visited[j]) {
					int dis = Math.abs(home.get(i).x - chiken.get(j).x) +  //치킨집과 집의 최단거리(치킨거리)를 구함
							Math.abs(home.get(i).y - chiken.get(j).y);
					
					temp = Math.min(temp, dis);
				}
			}
			ans += temp;  //치킨거리의 합이므로 ans 변수에 치킨거리의 합을 저장함.
		}
		result = Math.min(result, ans);   //백트래킹을 하면서 나오는 치킨거리의 합의 최솟값을 result 변수에 저장함.
		return;
		}
		
		for(int i = start; i < chiken.size(); i++) {
			visited[i] = true;
			dfs(i+1,count+1);
			visited[i] = false;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();   //map의 크기를 입력받음
		M = sc.nextInt();   //남겨둘 치킨집의 크기를 입력받음
		map = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 1) {   //1이라면 home list에 추가함.
					home.add(new dot(i,j));
				}
				else if(map[i][j] == 2) {  //2라면 chiken list에 추가함.
					chiken.add(new dot(i,j));
				}
			}
		}
		
		visited = new boolean[chiken.size()];
		result = Integer.MAX_VALUE;
		
		dfs(0,0);
		
		System.out.print(result);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
