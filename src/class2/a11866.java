package class2;


import java.util.*;


public class a11866 {
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int result = 0;
		Queue<Integer> que = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= N; i++) {
			que.offer(i);
		}
		
		while(!que.isEmpty()) {
			for(int i = 0; i < K-1; i++) { //3번 반복
				result = que.poll();
				que.offer(result);
			}
			list.add(que.poll());
		}
		System.out.print("<");
		for(int i = 0; i < list.size(); i++) {
			if(i != list.size()-1) {
			System.out.print(list.get(i)+", ");
			}
			else {
				System.out.print(list.get(i));
			}
		}
		System.out.print(">");
		// TODO Auto-generated method stub

	}

}
