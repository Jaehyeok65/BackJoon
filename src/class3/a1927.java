package class3;


import java.util.*;


public class a1927 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> que = new PriorityQueue<>(); //우선순위가 낮은 순서인 우선순위 큐 선언
		
		int N = sc.nextInt(); //연산 횟수
		
		while(N --> 0) { //N번 반복
			
			int n = sc.nextInt(); //값을 입력받음.
			
			if(n == 0) { //처음에 0이 입력받을 수 있기 때문에 이 조건문을 먼저 씀
				if(!que.isEmpty()) { //큐가 비어있지 않으면 최소값 출력
					sb.append(que.poll()+"\n");
				}
				else { //큐가 비어있으면 0출력
					sb.append(0+"\n"); 
				}
			}
			if(n != 0) {
				que.add(n);
			}
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
