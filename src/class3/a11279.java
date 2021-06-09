package class3;


import java.util.*;


public class a11279 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder()); //우선순위가 높은순서대로
		
		int N = sc.nextInt(); //반복횟수
		
		while(N --> 0) { //N번 반복
			
			int n = sc.nextInt();
			
			if(n == 0) { //n이 0일 때
				if(!que.isEmpty()) { //큐가 비어있지 않으면 최대값 출력
					sb.append(que.poll()+"\n");
				}
				else { //큐가 비어있으면 0 출력
					sb.append(0+"\n");
				}
			}
			
			if(n != 0) { //n이 0이아니면 큐에 추가
				que.add(n);
			}
			
			
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
