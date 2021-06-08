package bronze1;


import java.util.*;


public class a2740 {
	
	public static int multi(int arr1[][], int arr2[][],int n,int m) {
		int sum = 0;
		sum = arr1[n][m] * arr2[n][m+1] + arr1[n][m] * arr2[n+1][m];
		return sum;
	}
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[][] = new int[n][m];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		m = sc.nextInt();
		int k = sc.nextInt();
		int arr2[][] = new int[m][k];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < k; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		int arr3[][] = new int[n][k];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				arr3[i][j] = multi(arr1,arr2,i,j);
			}
		}
		// TODO Auto-generated method stub

	}

}
