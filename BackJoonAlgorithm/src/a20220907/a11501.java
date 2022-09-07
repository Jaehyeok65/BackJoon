package a20220907;


import java.util.*;
import java.io.*;

public class a11501 {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int day = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max = 0;
			long result = 0;
			
			ArrayList<Integer> list = new ArrayList<>();
			while(st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				list.add(num);
			}
			

			
			for(int j = day - 1; j >= 0; j--) {
				if(list.get(j) > max) {
					max = list.get(j);
				}
				else {
					result += (max - list.get(j));
				}
			}
			
			sb.append(result + "\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
