package a20210926;


import java.util.*;
import java.io.*;


public class a2470 {
	
	static int N;
	static int arr[];
	static int result1;
	static int result2;
	
	
	public static void binary() {
		
		int start = 0;
		int end = N-1;
		int max = Integer.MAX_VALUE;
		
		while(start < end) {
			int sum = arr[start] + arr[end];  //두 합이 작은 경우
			
			if(Math.abs(sum) < max) {
				result1 = arr[start];
				result2 = arr[end];
				max = Math.abs(sum);
			}
			
			if(sum > 0) {   
				end--;
			}
			else {         
				start++;
			}
		}
		
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		binary();
		
		System.out.print(result1 + " " + result2);
		
		
		
		// TODO Auto-generated method stub

	}

}
