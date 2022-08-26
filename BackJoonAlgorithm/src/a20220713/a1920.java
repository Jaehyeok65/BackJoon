package a20220713;

import java.util.*;
import java.io.*;



public class a1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> map = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			map.add(temp);
		}
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		while(st1.hasMoreTokens()) {
			if(map.contains(Integer.parseInt(st1.nextToken()))) {
				sb.append("1"+"\n");
			}
			else {
				sb.append("0"+"\n");
			}
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
