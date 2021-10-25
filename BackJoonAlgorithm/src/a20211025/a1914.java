package a20211025;


import java.io.*;
import java.util.*;
import java.math.*;

public class a1914 {
	static int count;
	static StringBuilder sb = new StringBuilder();
	
	
	public static void hanoi(int n , int start, int end) {
		
		
		if(n > 1) {
			hanoi(n-1,start,6-start-end);
		}
		
		sb.append(start + " " + end + "\n");
		
		if(n > 1) {
			hanoi(n-1,6-start-end,end);
		}
		
	}
	


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		BigInteger big = new BigInteger("2");
		BigInteger count = big.pow(n).subtract(BigInteger.ONE);
		sb.append(count + "\n");
		
		if(n <= 20) {
		hanoi(n,1,3);
		}
		System.out.println(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
