package a20221109;

import java.util.*;
import java.io.*;



public class sw14692 {
	static int T;
	static long N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			N = Long.parseLong(br.readLine());
			
			if(N % 2 == 0) {
				sb.append("#"+i+" Alice\n");
			}
			else {
				sb.append("#"+i+" Bob\n");
			}
		}
		
		System.out.print(sb.toString());
		
		
		
		
		// TODO Auto-generated method stub

	}

}
