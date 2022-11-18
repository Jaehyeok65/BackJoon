package a20221118;

import java.util.*;
import java.io.*;



public class sw11736 {
	
	static int T;
	
	public static int solve(ArrayList<Integer> list) {
		int count = 0;
		
		for(int i = 1; i < list.size()-1; i++) {
			int prev = list.get(i-1);
			int current = list.get(i);
			int next = list.get(i+1);
			if(!isMax(prev,current,next) && !isMin(prev,current,next)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isMax(int prev, int current, int next) {
		if(current > prev && current > next) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean isMin(int prev, int current, int next) {
		if(current < prev && current < next) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= T; i++) {
			
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			while(st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				list.add(tmp);
			}
			
			int result = solve(list);
			
			sb.append("#"+i+" "+result+"\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
