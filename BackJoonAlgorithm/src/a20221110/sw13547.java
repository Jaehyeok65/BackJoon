package a20221110;


import java.util.*;
import java.io.*;



public class sw13547 {
	
	static int T;
	final static int size = 15;
	
	public static boolean solve(String s) {
		int count = size - s.length();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'o') {
				count++;
			}
		}
		if(count >= 8) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			
			
			String s = br.readLine();
			
			boolean flag = solve(s);
			
			if(flag) {
				sb.append("#"+k+" YES\n");
			}
			else {
				sb.append("#"+k+" NO\n");
			}
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
