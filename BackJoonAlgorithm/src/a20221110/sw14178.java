package a20221110;

import java.util.*;
import java.io.*;



public class sw14178 {
	static int T;
	static int N;
	static int D;
	
	public static int solve() {
		int count = 0;
		int tmp = D * 2 + 1;
		while(true) {
			if(N <= 0) break;
			N = N - tmp;
			count++;
		}
		
		return count;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			D = Integer.parseInt(st.nextToken());
			
			int result = solve();
			
			sb.append("#"+k+" "+result+"\n");
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
