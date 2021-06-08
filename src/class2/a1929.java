package class2;

import java.util.*;


public class a1929 {
	
	static boolean ans[];
	
	public static boolean sosu(int n) {
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		return true;
		
		
	}
	
	public static void sosus(int n, int m) { //n과 m 사이의 소수를 구함
		StringBuilder sb = new StringBuilder();
		ans = new boolean[m+1]; //
		int result = 0;
		ans[0] = true;
		ans[1] = true;
		int msqrt = (int)Math.sqrt(m);
		for(int i = 2; i <= msqrt; i++) {
			if(sosu(i)) {
				int j = i;
				while(true) {
					result = i * j++;
					if(result > m) break;
					ans[result] = true;
				}
			}
		}
	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		sosus(M,N);
		for(int i = M; i <= N; i++) {
			if(!ans[i])
				sb.append(i+"\n");
		}
		System.out.print(sb.toString());
	
	
		
		
		
		// TODO Auto-generated method stub

	}

}
