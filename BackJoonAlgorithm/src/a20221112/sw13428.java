package a20221112;


import java.util.*;
import java.io.*;


public class sw13428 {
	
	static int T;
	
public static String maxsolution(String s) {
		
		for(int i = 0; i < s.length() - 1; i++) {
			int max = Integer.parseInt(s.substring(i,i+1));
			int swapindex = -1;
			int swapindex2 = -1;
			for(int j = i + 1; j < s.length(); j++) {
				int target = Integer.parseInt(s.substring(j,j+1));
				
				if(i == 0) { //i가 0일경우 0을 스왑해서는 안되므로 0을 제외하고 찾음
					if(target > max && target != 0) {
						max = target;
						swapindex = i;
						swapindex2 = j;
					}
				}
				else {
					if(target > max) {
						max = target;
						swapindex = i;
						swapindex2 = j;
					}
				}
			}
			if(swapindex != -1) { //swapindex가 -1이 아니라는것은 교환이 일어났다는 것
				String result = swap(s,swapindex,swapindex2);
				return result;
			}
		}
		
		return s; //교환이 모두 안 일어났으면 그냥 리턴
		
	}
	
	public static String minsolution(String s) {
		
		for(int i = 0; i < s.length() - 1; i++) {
			int min = Integer.parseInt(s.substring(i,i+1));
			int swapindex = -1;
			int swapindex2 = -1;
			for(int j = i + 1; j < s.length(); j++) {
				int target = Integer.parseInt(s.substring(j,j+1));
				
				if(i == 0) { //i가 0일경우 0을 스왑해서는 안되므로 0을 제외하고 찾음
					if(target < min && target != 0) {
						min = target;
						swapindex = i;
						swapindex2 = j;
					}
				}
				else {
					if(target < min) {
						min = target;
						swapindex = i;
						swapindex2 = j;
					}
				}
			}
			if(swapindex != -1) { //swapindex가 -1이 아니라는것은 교환이 일어났다는 것
				String result = swap(s,swapindex,swapindex2);
				return result;
			}
		}
		
		return s; //교환이 모두 안 일어났으면 그냥 리턴
		
	}
	
	public static String swap(String s, int index1, int index2) {
		char c[] = s.toCharArray();
		char tmp = c[index1];
		c[index1] = c[index2];
		c[index2] = tmp;
		
		String result = String.valueOf(c);
		return result;
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for(int k = 1; k <= T; k++) {
			
			String s = br.readLine();
			
			sb.append("#"+k+" "+minsolution(s)+" "+maxsolution(s)+"\n");
		}
		
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
