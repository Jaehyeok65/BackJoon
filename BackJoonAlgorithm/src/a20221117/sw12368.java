package a20221117;

import java.util.*;
import java.io.*;



public class sw12368 {
	
	static int T;
	
	public static int solve(int A, int B) {
		int result = A + B;
		if(result >= 24) {
			result = result - 24;
		}
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			int result = solve(A,B);
			sb.append("#"+i+" "+result+"\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
