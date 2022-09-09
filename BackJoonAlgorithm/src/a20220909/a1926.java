package a20220909;


import java.util.*;
import java.io.*;



public class a1926 {
	
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int map[][];
	static boolean visited[][];
	static int height;
	static int width;
	static int count = 0;
	static int result = 0;
	static int maxresult = 0;
	
	public static void dfs(int y, int x) {
		
		visited[y][x] = true; //방문을 표시
		result++;
		
		for(int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 0 && nextX < width && nextY >= 0 && nextY < height) {
				if(!visited[nextY][nextX] && map[nextY][nextX] == 1) {
					dfs(nextY,nextX);
				}
			}
		}
		
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		height = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());
		
		map = new int[height][width];
		visited = new boolean[height][width];
		
		for(int i = 0; i < height; i++) {
			StringTokenizer sts = new StringTokenizer(br.readLine());
			int j = 0;
			while(sts.hasMoreTokens()) {
				map[i][j] = Integer.parseInt(sts.nextToken());
				j++;
			}
		}
		
		 for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // 해당 지점이 그림이고 아직 방문 안한 경우, 탐색 수행
	                if (map[i][j] == 1 && !visited[i][j]) {
	                    count++;
	                    dfs(i, j);
	                    maxresult = Math.max(result, maxresult);
	                    result = 0;       // area 초기화
	                }
	            }
	        }
		 
		 System.out.println(count);
		 System.out.print(maxresult);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
