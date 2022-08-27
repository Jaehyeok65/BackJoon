package a20220827;


import java.io.*;
import java.util.*;


public class a11286 {
	
	
	public static class items implements Comparable<items> {
		int abs; //절대값
		int value; //실제 값
		
		public items(int newabs, int newvalue) {
			abs = newabs;
			value = newvalue;
		}

		@Override
		public int compareTo(items item) {
		
			if(this.abs > item.abs) { //자신의 절대값이 target의 절대값보다 크면 1리턴 (자리바꿈) 즉 오름차순 정렬
				return 1;
			}
			else if(this.abs < item.abs) {
				return -1;
			}
			else if(this.abs == item.abs) {
				if(this.value < item.value) { //return값이 양수면 자리가 바뀌게 됨. 즉 target의 value가 작으면 오름차순 
					return -1;
				}
				else {
					return 1;
				}
			}
			return 0;
		}
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<items> pq = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine());
			if(k != 0) { //k가 0이 아닐 경우 절대값과 실제 값을 우선순위큐에 추가
				int newabs = Math.abs(k);
				int newvalue = k;
				pq.add(new items(newabs,newvalue));
			}
			else { //k가 0일 경우
				if(pq.isEmpty()) { //배열이 비어있는 경우
					sb.append(0 + "\n");
				}
				else {
				sb.append(pq.poll().value+"\n");
				}
			}
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
