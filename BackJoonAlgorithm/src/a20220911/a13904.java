package a20220911;

import java.util.*;
import java.io.*;


public class a13904 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;
		int lastday = 0;
		int n = Integer.parseInt(br.readLine());
		ArrayList<work> list = new ArrayList<>();
		PriorityQueue<work> pq = new PriorityQueue<>();
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			list.add(new work(day,score));
			lastday = Math.max(lastday, day);
		}
		
		Collections.sort(list, (o1, o2) -> o2.day - o1.day);
		
		int workindex = 0;
		  for(int i = lastday; i > 0; i--) {
	            while(workindex < n && list.get(workindex).day >= i) {
	                pq.add(list.get(workindex++));
	            }
	            if(!pq.isEmpty()) result += pq.poll().score;
	        }
	        
		System.out.print(result);
		
		
		
		// TODO Auto-generated method stub

	}

}


class work implements Comparable<work>{
	int day;
	int score;
	
	public work(int day, int score) {
		this.day = day;
		this.score = score;
	}

	@Override
	public int compareTo(work w) { //점수 내림차순
		
		return -(this.score - w.score);
		// TODO Auto-generated method stub
	
	}
}
