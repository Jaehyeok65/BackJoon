package a20211114;


import java.util.*;


public class programass_level2_5 {
	
	public static int solution(int[] scovile, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 0; i < scovile.length; i++) {
			pq.add(scovile[i]);
		}
		int answer = 0;
		while(true) {
			int tmp1 = pq.poll();
			if(tmp1 >= k) {
				break;
			}
			if(pq.size() == 0) {
				return -1;
			}
			int tmp2 = pq.poll();
			int tmp = tmp1 + (tmp2*2);
			pq.add(tmp);
			answer++;
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		int[] scovile = {1,2,3,5};
		int k = 7;
		System.out.println(solution(scovile,k));
		
		
		// TODO Auto-generated method stub

	}

}
