package class3;


import java.util.*;


public class a1780 {
	
	static int map[][];
	static int mone = 0;
	static int zero = 0;
	static int one = 0;
	
	static void partition(int row, int col, int size) {
		
		if(pan(row,col,size)) {
			if(map[row][col] == -1) {
				mone++;
			}
			else if(map[row][col] == 0) {
				zero++;
			}
			else if(map[row][col] == 1){
				one++;
			}
			return;
		}
		
		int newsize = size / 3;
		
		partition(row,col,newsize); //1사분면
		partition(row,col+newsize,newsize); //2사분면
		partition(row,col+2*newsize,newsize); //3사분면
		partition(row+newsize,col,newsize); //4사분면
		partition(row+newsize,col+newsize,newsize); //5사분면
		partition(row+newsize,col+newsize*2,newsize); //6사분면
		partition(row + newsize*2,col,newsize);
		partition(row+newsize*2,col + newsize,newsize);
		partition(row+newsize*2,col + newsize*2,newsize);
		
	}
	
	static boolean pan(int x, int y, int size) {
		
		int ans = map[x][y];
		
		for(int i = x; i < x + size; i++) {
			for(int j = y; j < y + size; j++) {
				if(map[i][j] != ans) {
					return false; //종이가 같은 수로 되어있지 않으므로 false를 리턴하고 분할 진행
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		map = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		partition(0,0,n);
		System.out.println(mone);
		System.out.println(zero);
		System.out.println(one);
		
		// TODO Auto-generated method stub

	}

}
