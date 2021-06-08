package class2;


import java.util.*;


public class a2609 {
	
	public static int minmulti(int n, int m) { //최소공배수
		int result = 0;
		for(int i = 1; i <= n*m; i++) {
			if(i % n == 0 && i % m == 0) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	public static int maxdiv(int n, int m) { //최대공약수
		int result = 0;
		int max = Math.max(n, m);
		for(int i = 1; i <= max; i++) {
			if(n % i == 0 && m % i == 0) {
				result = i;
			}	
		}
		return result;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(maxdiv(n,m));
		System.out.println(minmulti(n,m));
		
		
		// TODO Auto-generated method stub

	}

}
