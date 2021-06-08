package class2;


import java.util.*;


public class a2164 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		Queue<Integer> list = new LinkedList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			list.add(i); // n까지의 카드를 초기화
		}
		
		int i = 0;
		
		while(list.size() != 1) {
			list.poll();
			list.add(list.poll());
		}
		System.out.print(list.poll());
		
		// TODO Auto-generated method stub

	}

}
