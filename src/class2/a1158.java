package class2;


import java.util.*;


public class a1158 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) {
			que.offer(i); // 1부터 N까지 que에 대입.
		}
		sb.append("<");
		while(!que.isEmpty()) {
			for(int i = 0; i < K-1; i++) {
				que.offer(que.poll());
			}
			if(que.size() != 1) {
			sb.append(que.poll()+", ");
			}
			else {
				sb.append(que.poll());
			}
		}
		sb.append(">");
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
