package a20210825;

import java.util.*;



public class a3036 {
	
	public static int get(int a, int b) {
		int result = 1;
		int min = Math.min(a, b);
		
		for(int i = min; i >= 2; i--) {
			if(a % i == 0 && b % i == 0) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i < n; i++) {
			int result1 = arr[0]/get(arr[0],arr[i]);
			int result2 = arr[i]/get(arr[0],arr[i]);
			System.out.println(result1+"/"+result2);
		}
		// TODO Auto-generated method stub

	}

}
