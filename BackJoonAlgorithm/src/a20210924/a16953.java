package a20210924;


import java.util.*;



class Pair {
	
	long x;
	long count;
	
	public Pair(long x, long count) {
		this.x = x;
		this.count = count;
	}
}

public class a16953 {
	static long A;
	static long B;
	static long result = -1;
	
	
	public static void bfs(long n, long count) {
		Queue<Pair> que = new LinkedList<>();
		que.add(new Pair(n,count));
		
		while(!que.isEmpty()) {
			Pair p = que.poll();
			
			if(p.x == B) {
				result = p.count + 1;
				return;
			}
			
			for(int i = 0; i < 2; i++) {
				long next = 0;
				if(i == 0) {
					next = p.x * 2;   //연산1 == 2를 곱함
				}
				else if(i == 1) {
					next = p.x * 10 + 1; //수의 오른쪽에 1를 추가함.
				}
				
				if(next > 0 && next <= Math.pow(10, 9)) {
					que.add(new Pair(next,p.count+1));
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		A = sc.nextLong();
		B = sc.nextLong();
		
		bfs(A,0);
		
		System.out.print(result);
		
		// TODO Auto-generated method stub

	}

}
