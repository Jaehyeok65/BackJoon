package a20210917;


import java.math.BigInteger;
import java.util.*;


public class a9659 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		BigInteger n = sc.nextBigInteger();
		
		if(n.remainder(new BigInteger("2")) == BigInteger.ZERO) {
			System.out.print("CY");
		}
		else {
			System.out.print("SK");
		}
		// TODO Auto-generated method stub

	}

}
