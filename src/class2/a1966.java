package class2;


import java.util.*;


public class a1966 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> que = new LinkedList<>();
		int T = sc.nextInt(); //테스트 케이스
		int count = 0;
		while( T --> 0) {
			
			int M = sc.nextInt(); //문서의 개수
			int index = sc.nextInt(); // 몇번째로 인쇄되었는지 구하고자 하는 값(위치)
			
			for(int i = 0; i < M; i++) {
				int n = sc.nextInt();
				que.offer(n);
			}
			while(!que.isEmpty()) {
				que.poll();
				
			}
			
			System.out.println(sb.toString());
		}
		// TODO Auto-generated method stub

	}

}
