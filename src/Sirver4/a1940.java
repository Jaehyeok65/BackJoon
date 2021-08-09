package Sirver4;

import java.util.*;


public class a1940 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count = 0;
		int end = 0;
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < N; i++) {
			int result = 0;
			end = i + 1;
			
			while(end < N) {
				result = arr[i];
				result += arr[end++];
				if(result == M) {
					count++;
					break;
				}
			}
		}
		
		System.out.print(count);
 		
		// TODO Auto-generated method stub

	}

}
