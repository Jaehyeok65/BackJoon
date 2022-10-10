package a20221010;

import java.util.*;
import java.io.*;




public class a2661 {
	static int N;
	static boolean end = false;
	
	
	public static void dfs(String result) {
		if(end) {
			return;
		}
		if(result.length() == N) {
			System.out.print(result);
			end = true;
			return;
		}
		
		for(int i = 1; i <= 3; i++) {
			if(check(result + i)) {
				dfs(result + i);
			}
		}
	}
	
	 private static boolean check(String s) {
	        int length = s.length() / 2;

	        for (int i = 1; i <= length; i++) {
	            if (s.substring(s.length() - i).equals(s.substring(s.length() - 2 * i, s.length() - i))) {
	                return false;
	            }
	        }

	        return true;
	    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		dfs("");
		
		
		// TODO Auto-generated method stub

	}

}
