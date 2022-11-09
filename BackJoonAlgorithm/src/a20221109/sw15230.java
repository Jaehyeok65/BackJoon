package a20221109;

import java.util.*;
import java.io.*;



public class sw15230 {
	
	static int T; //테스트 케이스의 개수
	static int X;
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		String target = "abcdefghijklmnopqrstuvwxyz";
		
		for(int k = 1; k <= T; k++) {
			
			String s = br.readLine();
			int count = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(s.substring(i,i+1).equals(target.substring(i,i+1))) {
					count++;
				}
				else {
					break;
				}
			}
			
			sb.append("#"+k+" "+count +"\n");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
