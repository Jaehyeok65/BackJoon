package a20221119;

import java.util.*;
import java.io.*;



public class sw11387 {
	
	static int T;
	
	public static int solve(int D, int L, int N) {
		int result = 0;
		
		double per = L * 0.01;
		for(int i = 0; i < N; i++) {
			result += (D * (1+(i * (per))));
			
		}
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int t = 1; t <= T; t++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int D = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int result = solve(D,L,N);
			
			sb.append("#"+t+" " + result +"\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
