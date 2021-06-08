package bronze2;


import java.util.*;
import java.math.*;

public class a5988 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		BigInteger two = new BigInteger("2");
		for(int i = 0; i < n; i++) {
			BigInteger num = sc.nextBigInteger();
			if(num.remainder(two) == BigInteger.ZERO) {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
		
		// TODO Auto-generated method stub

	}

}
