

import java.util.*;


public class a2231 {
	
	static int linesum(int n) {
		int sum = 0;
		while(n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			int lsum = linesum(i);
			if(i + lsum == n) {
				ans = i;
				break;
			}
			
		}
		System.out.print(ans);
		// TODO Auto-generated method stub

	}

}
