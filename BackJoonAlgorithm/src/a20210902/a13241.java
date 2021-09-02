package a20210902;


import java.util.*;


public class a13241 {
	
	
	public static long GCD(long n, long m) { //유클리드 호제법 (최대공약수 구하기)
		
		if(m == 0)
			return n;
		else 
			return GCD(m, n % m);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long maxdivisor = GCD(n,m); //최대공약수를 변수에 저장.
		
		long minmulti = n * m / maxdivisor; //최소공배수는 두 수의 곱을 최대공약수로 나눈 수
		
		System.out.print(minmulti);
		
		
		// TODO Auto-generated method stub

	}

}
