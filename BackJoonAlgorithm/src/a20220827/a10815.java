package a20220827;

import java.util.*;
import java.io.*;


public class a10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			map.put(Integer.parseInt(st.nextToken()), 0);
		}
		int m = Integer.parseInt(br.readLine());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		while(st1.hasMoreTokens()) {
			if(map.containsKey(Integer.parseInt(st1.nextToken()))) {
				sb.append(1 + " ");
			}
			else {
				sb.append(0 + " ");
			}
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
