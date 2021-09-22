package a20210922;


import java.util.*;
import java.io.*;

public class a1080 {
	
	
	static int N;
	static int M;
	static int result;
	
	public static void swap(int x, int y, int [][] arr) {
		
		for(int i = x; i < x + 3; i++) {
			for(int j = y; j < y + 3; j++) {
				if(arr[i][j] == 0) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
	}
	
	public static boolean equalize(int arr[][], int arr2[][]) {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] != arr2[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	public static boolean check(int x, int y) {  //행렬의 범위에서 벗어나는지를 체크함. 
		if(x + 3 <= N && y + 3 <= M) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		boolean flag = false;
		int arr[][] = new int[N][M];
		int arr2[][] = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String row = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = row.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			String row = br.readLine();
			for(int j = 0; j < M; j++) {
				arr2[i][j] = row.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] != arr2[i][j]) {
				if(check(i,j)) {   //연산이 행렬의 범위에서 벗어나지 않으면
					swap(i,j,arr);   //연산을 시행함
					result++;        //연산 시행 횟수를 카운팅해줌
				}
				}
				if(equalize(arr,arr2)) {  //둘이 동일하다면 
					flag = true;   //flag변수는 true로 리턴
					break;
				}
			}
			if(equalize(arr,arr2)) { 
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(result);
		}
		else {
			System.out.println("-1");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
