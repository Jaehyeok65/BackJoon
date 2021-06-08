package class2;


import java.util.*;

public class a1978 {
	
	public static boolean sosu(int n) {
		
		int count = 0;
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if(sosu(m)) {
				count++;
			}
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
