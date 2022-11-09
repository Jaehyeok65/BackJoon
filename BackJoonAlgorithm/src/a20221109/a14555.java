package a20221109;

import java.util.*;
import java.io.*;



public class a14555 {
	
	static int T;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			
			String target = br.readLine();
			
			int count = 0;
			
			for(int i = 0; i < target.length(); i++) {
				char c = target.charAt(i);
				if(c == '(') {
					if(i+1 < target.length() && (target.charAt(i+1) == ')' || target.charAt(i+1) == '|')) {
						count++;
						i++;
					}
					else {
						count++;
					}
				}
				if(c == ')') {
					count++;
				}
			}
			
			sb.append("#"+k+" "+count+"\n");
			
			
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
