package a20211112;

import java.math.BigInteger;

public class programass_level2_3 {
	
	public static long solution(int w, int h) {
		long answer = 0;
		
		/*BigInteger big1 = BigInteger.valueOf(w);
		BigInteger big2 = BigInteger.valueOf(h);
		int gcd = big1.gcd(big2).intValue();*/
		
		int gcd = 1;
		
		for(int i = 2; i <= Math.min(w, h); i++) { //최대공약수 구하기
			if(w % i == 0 && h % i == 0) {
				gcd = i;
			}
		}
		
		answer = ((long)w * (long)h) - (((long)(w / gcd) + (long)(h / gcd) - 1) * gcd);
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		int n = 8;
		int m = 12;
		
		long result = solution(n,m);
		System.out.println(result);
		
		
		
		// TODO Auto-generated method stub

	}

}
