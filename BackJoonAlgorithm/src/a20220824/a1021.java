package a20220824;

import java.util.*;
import java.io.*;


public class a1021 {
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<Integer> deque = new ArrayDeque<>();
		int count = 0;
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		for(int i = 1; i <= N; i++) {
			deque.add(i);
		}
		
		int M = Integer.parseInt(st.nextToken());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		int temp[] = new int[M];
		for(int i = 0; i < M; i++) {
			temp[i] = Integer.parseInt(st1.nextToken());
		}
		
		/*for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println("");*/
		
		
		int j = 0;
		while(true) {
			if(j == temp.length) {
				break;
			}
			int x = temp[j];
			int cnt = 0;
			while(x != deque.peekFirst()) {
				int front = deque.pollFirst();
				deque.addLast(front);
				cnt++;
			}
			count += Math.min(cnt, deque.size() - cnt);
			deque.pollFirst();
			j++;
		}
		
		System.out.println(count);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
