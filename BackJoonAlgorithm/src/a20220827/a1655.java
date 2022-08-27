package a20220827;



import java.util.*;
import java.io.*;

public class a1655 { //자료구조를 두개사용?
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> maxpq = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Integer> minpq = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			
			int k = Integer.parseInt(br.readLine());
			
			if(maxpq.size() == minpq.size()) {
				maxpq.add(k);
				
				if(!minpq.isEmpty() && maxpq.peek() > minpq.peek()) {
					minpq.add(maxpq.poll());
					maxpq.add(minpq.poll());
				}
			}
			else {
				minpq.add(k);
				
				if(maxpq.peek() > minpq.peek()) {
					minpq.add(maxpq.poll());
					maxpq.add(minpq.poll());
				}
			}
			
			sb.append(maxpq.peek() + "\n");
			
			
		}
		
		
		System.out.print(sb.toString());
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
