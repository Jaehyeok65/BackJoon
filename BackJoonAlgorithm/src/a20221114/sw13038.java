package a20221114;

import java.util.*;
import java.io.*;



public class sw13038 {
	
	static int T;
	
	
	public static int solve(int num, int[] arr) {
		
		int count = Integer.MAX_VALUE; //횟수
		
		for(int i = 0; i < 7; i++) {
			if(arr[i] == 1) {
				count = Math.min(count, grid(num, arr, i));
			}
		}
		
		return count;
	}
	
	public static int grid(int num, int[] arr, int index) {
		int count = 0;
		
		for(int i = index; i < 7; i++) { //첫째 주는 개강일이므로 개강일을 정함
			count++;
			if(arr[i] == 1) {
				num--;
			}
			if(num == 0) {
				return count;
			}
		}
		
		while(num > 0) {
			for(int i = 0; i < 7; i++) {
				count++;
				if(arr[i] == 1) {
					num--;
				}
				if(num == 0) {
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			
			int num = Integer.parseInt(br.readLine());
			int arr[] = new int[7];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			sb.append("#"+t+" "+solve(num, arr)+"\n");
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
