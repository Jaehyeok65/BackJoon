package class3;


import java.util.*;


public class a2630 {
	
	static int N;
	static int map[][];
	static int blue = 0;
	static int white = 0;
	
	static void partition(int row, int col, int size) { //가로 반 세로 반으로 나누는 작업을 수행
		
		if(iscolor(row,col,size)) {
			if(map[row][col] == 0) {
				white++;
			}
			else {
				blue++;
			}
			return;
			
		}
		
			int newsize = size / 2;
			
			partition(row,col,newsize);
			partition(row,col+newsize,newsize);
			partition(row+newsize,col,newsize);
			partition(row+newsize,col+newsize,newsize);
			
		
		
		
		
	}
	
	static boolean iscolor(int x,int y,int size) {
		
		int color = map[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(map[i][j] != color)
					return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		map = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		partition(0,0,N);
		System.out.println(white);
		System.out.print(blue);
		
		
		
		// TODO Auto-generated method stub

	}

}
