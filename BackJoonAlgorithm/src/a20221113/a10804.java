package a20221113;


import java.util.*;
import java.io.*;

public class a10804 {
	
	public static void solve(int arr[], int first, int last) {
		
		int index = (Math.abs(last-first) + 1) / 2;

		while(index-- > 0) {
			swap(arr, first++, last--);
		}
		
	}
	
	public static void swap(int arr[], int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public static void print(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[21];
		
		for(int i = 1; i <= 20; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			
			solve(arr, first, last);
		}
		
		print(arr);
		
		
		// TODO Auto-generated method stub

	}

}
