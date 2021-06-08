package bronze2;


import java.util.*;


public class a2161 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		while(!list.isEmpty()) {
			System.out.print(list.getFirst()+" "); //1을 출력후
			list.removeFirst();
			if(list.isEmpty()) break;
			list.add(list.getFirst()); 
			list.removeFirst(); //
		}
		
		}
		// TODO Auto-generated method stub

	}


