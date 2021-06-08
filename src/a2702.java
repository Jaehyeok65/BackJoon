

import java.util.*;


public class a2702 {
	
	public static int minqotn(int a, int b) {
		int ans = a * b;
		for(int i = 1; i < ans; i++) {
			if(i % a == 0 && i % b == 0) {
				ans = i;
			}
		}
		return ans;
	}
	
	public static int maxdirtn(int a, int b) {
		int temp = a > b ? a : b; //둘 중 큰수를 리턴
		int ans = 0;
		for(int i = 1; i <= temp; i++) {
			if(a % i == 0 && b % i == 0) {
				ans = ans > i ? ans : i;
			}
		}
		return ans;
 		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(minqotn(a,b)+" "+maxdirtn(a,b));
		}
		
		// TODO Auto-generated method stub

	}

}
