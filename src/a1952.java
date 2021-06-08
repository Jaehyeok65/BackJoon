import java.util.*;


public class a1952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt(); //m x n 의 표 생성 즉 m은 세로길이 n은 가로 길이
		int sum = 0; //꺾은 횟수
		int arr[][] = new int[n][m]; //n = 3, m = 5 즉 [3],[5]의 배열
		boolean arr1[][] = new boolean[n][m];
		for(int i = 0; i < arr1.length; i++) { //arr.length = 3
			for(int j = 0; j < arr1[0].length; j++) {
				arr1[i][j] = false;
			}
		} //boolean 배열을 이용하여 도착한 부분을 표시.
		int t = 0;
		int k = 1;
		while(true) {
			t++;
			arr1[t][k] = true;
			if(t == n) {
				k++;
				arr1[t][k] = true;
			}
			else if(k == m) {
				t--;
				arr1[t][k] = true;
			}
			else if(t == 1) {
				k--;
				arr1[t][k] = true;
			}
		}
		
			
		
		
		
		// TODO Auto-generated method stub

	}

}
