package class3;


import java.util.*;


public class a1914 {
	
	static int count = 0;
	static Queue<dot> que = new LinkedList<>();
	
	static void move(int n, int x, int y) {
		
		count++;
		
		if(n > 1) {
			move(n-1,x,6-x-y);
		}
		
		que.add(new dot(x,y));
		
		if(n > 1) {
			move(n-1,6-x-y,y);
		}
	}
	
	static void move2(int n, int x, int y) {
		
		count++;
		
		if(n > 1) {
			move2(n-1,x,6-x-y);
		}
		if(n > 1) {
			move2(n-1,6-x-y,y);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //원판의 개수
		if(n <= 20) {
			move(n,1,3);
			System.out.println(count);
			while(!que.isEmpty()) {
				dot d = que.poll();
				System.out.println(d.x+" "+d.y);
			}
			
		}
		else {
		move2(n,1,3);
		System.out.println(count);
		}
		
		// TODO Auto-generated method stub

	}

}
