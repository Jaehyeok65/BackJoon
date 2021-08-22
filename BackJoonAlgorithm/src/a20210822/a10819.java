package a20210822;

import java.util.*;



public class a10819 { //순열구하기?
	static int max = 0;
	
	
	
	public static void swap(int arr[], int depth, int q) {
		int temp = arr[depth];
		arr[depth] = arr[q];
		arr[q] = temp;
	}
	
	public static void sun(int arr[], int depth, int n) {
		if(depth == n) {
			sum(arr);
			return;
		}
		
		for(int i = depth; i < n; i++) {
			swap(arr,i,depth);
			sun(arr,depth+1,n);
			swap(arr,i,depth);
		}
		
	}
	
	public static void sum(int arr[]) {
		int sum = 0;
		for(int i = 1; i < arr.length; i++) {
			sum += Math.abs(arr[i] - arr[i-1]);
		}
		if(sum > max) {
			max = sum;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sun(arr,0,n);
		System.out.print(max);
		// TODO Auto-generated method stub

	}

}
