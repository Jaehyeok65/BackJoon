package a20210914;

import java.util.*;



public class a11441 {
	static int arr[];
	
	public static int solution(int a, int b) {
		if(a == b) {
			return arr[a];
		}
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		arr = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sb.append(solution(a,b)+"\n");
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
