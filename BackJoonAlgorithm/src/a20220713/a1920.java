package a20220713;

import java.util.*;
import java.io.*;



public class a1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int i = 0;
		while(st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			map.put(i, temp);
			i++;
		}
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		while(st1.hasMoreTokens()) {
			if(map.containsValue(Integer.parseInt(st1.nextToken()))) {
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
