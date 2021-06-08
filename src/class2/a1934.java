package class2;


import java.util.*;


public class a1934 {
	
	static int minm(int n, int m) {
		
		int big = n>m?n:m;
		int small = n<m?n:m;
		
		int mok;
		int ng;
		
		int minM;
		while(true) {
			mok = big/small;
			ng = big - mok*small;
			if(ng == 0) {
				minM = n * m / small;
				return minM;
			}
			else {
				big = small;
				small = ng;
			}
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int Test = sc.nextInt();
		
		while(Test --> 0) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(minm(n,m));
		}
		
		// TODO Auto-generated method stub

	}

}
