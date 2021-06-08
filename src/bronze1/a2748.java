package bronze1;


import java.util.*;


public class a2748 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long Fibo[] = new long[n+1];
		Fibo[0] = 0;
		Fibo[1] = 1;
		for(int i = 2; i < Fibo.length; i++) {
			Fibo[i] = Fibo[i-1] + Fibo[i-2];
		}
		System.out.print(Fibo[n]);
		// TODO Auto-generated method stub

	}

}
