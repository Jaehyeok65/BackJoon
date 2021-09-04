package a20210904;


import java.util.*;


public class a2210 {
	
	static int count = 0;
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static HashSet<String> list;
	
	
	public static void dfs(int x,int y, int depth, String s, int graph[][]) {
		
		if(depth == 6) {
			list.add(s);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			
			
			int nextX = dx[i] + x;
			int nextY = dy[i] + y;
			
			if(nextX < 0 || nextX >= 5 || nextY < 0 || nextY >= 5) {
				continue;
			}
			
			dfs(nextX,nextY,depth+1,s+graph[x][y],graph);
		}
	}
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int graph[][] = new int[5][5];
		list = new HashSet<String>();
		
		for(int i = 0; i < graph.length; i++) {
			
			for(int j = 0; j < graph.length; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		
		String s = "";
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				dfs(i,j,0,s,graph);
			}
		}
		System.out.print(list.size());
		
		
		// TODO Auto-generated method stub

	}

}
