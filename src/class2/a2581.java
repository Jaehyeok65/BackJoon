package class2;


import java.util.*;


public class a2581 {
	
	public static boolean sosu(int n) {
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean[] pan(int n) {
		boolean check[] = new boolean[n+1];
		check[0] = true;
		check[1] = true;
		int sq = (int)Math.sqrt(n);
		
		for(int i = 2; i <= sq; i++) {
			if(sosu(i)) {
			int result = i;
			int temp = 2;
			while(true) {
				result = i * temp++;
				if(result > n) {
					break;
				}
				check[result] = true;
			}
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean flag = false;
		boolean [] result;
		result = pan(N);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i = M; i <= N; i++) {
			if(!result[i]) {
				flag = true;
				sum += i;
				min = Math.min(min, i);
			}
		}
		if(flag) {
			System.out.println(sum);
			System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
		// TODO Auto-generated method stub

	}

}
