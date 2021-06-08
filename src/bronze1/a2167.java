package bronze1;


import java.util.*;


public class a2167 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int k = sc.nextInt();
		for(int i = 0; i < k; i++) {
			long sum = 0;
			int x1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y1 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int j = x1-1; j <= y1-1; j++) {
				for(int t = x2-1; t <= y2-1; t++ ) {
					sum += arr[j][t];
				}
			}
			System.out.println(sum);
			
		}
		// TODO Auto-generated method stub

	}

}
