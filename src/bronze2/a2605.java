package bronze2;


import java.util.*;


public class a2605 {
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			list.add(i-n,i+1);
		}
		
		for(int i = 0; i < t; i++) {
			System.out.print(list.get(i)+" ");
		}
		// TODO Auto-generated method stub

	}

}
