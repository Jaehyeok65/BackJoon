package a20210902;


import java.util.*;
import java.io.*;


public class a3273 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int x = Integer.parseInt(br.readLine());
		int count = 0;
		
		Collections.sort(list);
		
		int start = 0;
		int end = n - 1;
		
		
		while(start < end) {
			
			if(list.get(start) + list.get(end) == x) {
				count++;
			}
			
			if(list.get(start) + list.get(end) <= x) {
				start++;
			}
			else {
				end--;
			}
		}
		
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
