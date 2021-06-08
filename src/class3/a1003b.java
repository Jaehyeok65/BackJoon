package class3;


import java.util.*;


public class a1003b {
	
	static int zero;
	static int one;
	static int temp;
	
	static void fibo(int n) {
		
		zero = 1;
		one = 0;
		
		for(int i = 1; i <= n; i++) {
			temp = zero;
			zero = one;
			one = temp + zero;
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Testcase = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(Testcase --> 0) {
			
			int n = sc.nextInt();
			fibo(n);
			sb.append(zero+" "+one+"\n");
		
		}
		System.out.println(sb.toString());
		// TODO Auto-generated method stub

	}

}
