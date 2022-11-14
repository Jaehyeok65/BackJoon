package a20221114;

import java.util.*;
import java.io.*;



public class sw13229 {
	static int T;
	
	public static int solve(String s) {
		
		switch(s) {
		case "SUN" : {
			return 7;
		}
		case "MON" : {
			return 6;
		}
		case "TUE" : {
			return 5;
		}
		case "WED" : {
			return 4;
		}
		case "THU" : {
			return 3;
		}
		case "FRI" : {
			return 2;
		}
		case "SAT" : {
			return 1;
		}
		}
		return -1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			
			
			String s = br.readLine();
			
			sb.append("#"+t+" "+solve(s)+"\n");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
