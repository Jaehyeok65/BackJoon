package a20220904;

import java.util.*;
import java.io.*;



public class a2776 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			HashSet<Integer> hash = new HashSet<>();
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			while(st1.hasMoreTokens()) {
				hash.add(Integer.parseInt(st1.nextToken()));
			}
			int m = Integer.parseInt(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			while(st2.hasMoreTokens()) {
				int num = Integer.parseInt(st2.nextToken());
				if(hash.contains(num)) {
					sb.append(1+"\n");
				}
				else {
					sb.append(0+"\n");
				}
			}
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
