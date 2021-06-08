package bronze1;


import java.util.*;


public class a1236 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		char arr[][] = new char[n][m]; //n이 열 m이 행
		boolean pan = false;
		int wid = 0;
		int hig = 0;
		for(int i = 0; i < arr.length; i++) {
			String str = sc.next();
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < n; i++) {
			pan = true;
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == 'X') {
					pan = false;
					break;
				}
			}
			if(pan) wid++;
		}
		for(int j = 0; j < m; j++) {
			pan = true;
			for(int i = 0; i < n; i++) {
				if(arr[i][j] == 'X') {
					pan = false;
					break;
				}
			}
			if(pan) hig++;
		}
		System.out.print((int)Math.max(wid, hig));
		
		// TODO Auto-generated method stub

	}

}
