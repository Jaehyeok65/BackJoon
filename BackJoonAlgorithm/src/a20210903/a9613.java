package a20210903;

import java.util.*;

public class a9613 {
	
	public static int GCD(int n, int m) {
		
		if (m == 0) {
			return n;
		}
		else {
			return GCD(m , n % m);
		}
	}

	public static void main(String[] args)  {
		
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			
			int arr[] = new int[n];
			
			for(int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}
			
			long sum = 0;
			
			for(int j = 0; j < n - 1; j++) {
				
				for(int k = j + 1; k < n; k++) {
					
					sum += GCD(arr[j],arr[k]);
				}
			}
			
			sb.append(sum + "\n");
		}
		System.out.print(sb.toString());

	}

}
