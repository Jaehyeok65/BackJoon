package a20221101;

import java.util.*;
import java.io.*;
import java.math.BigInteger;



public class a2061 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger K = new BigInteger(st.nextToken());
		BigInteger L = new BigInteger(st.nextToken());
		//인수분해 소수가 L보다 작을 경우 해당 소수를 저장할 변수 선언
		int N = 0;
		
		for(int i = 2; i < L.intValue(); i++) {
			if((K.remainder(BigInteger.valueOf(i))).compareTo(BigInteger.ZERO) == 0) {
				N = i;
				break;
			}
		}
		//삼항연산자로 S값에 N값의 여부에 따른 값 저장
		String S = (N > 0)? ("BAD " + N) : "GOOD";
		
		System.out.println(S);
		// TODO Auto-generated method stub

	}

}
