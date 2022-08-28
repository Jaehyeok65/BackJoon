package a20220828;

import java.util.*;
import java.io.*;


public class a1715 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		
		long result = 0;
		
		for(int i = 0; i < n; i++) {
			long k = Long.parseLong(br.readLine());
			pq.add(k);
		}
		
		while(pq.size() > 1) {
			long count1 = pq.poll();
			long count2 = pq.poll();
			
			result += (count1 + count2);
			pq.add(count1 + count2);
		}
		
		System.out.print(result);
		
	
		// TODO Auto-generated method stub

	}

}
