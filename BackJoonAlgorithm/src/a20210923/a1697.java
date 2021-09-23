package a20210923;


import java.util.*;


public class a1697 {
	
	static int N;
	static int K;
	
	
	public static int bfs(int n) {
		Queue<Integer> que = new LinkedList<>();
		int check[] = new int[1000001];
		que.add(n);
		check[n] = 0;
		
		while(!que.isEmpty()) {
			
			int tmp = que.poll();
			
			for(int i = 0; i < 3; i++) {
				int next;
				
				if(i == 0) {
					next = tmp + 1;
				}
				else if(i == 1) {
					next = tmp - 1;
				}
				else {
					next = tmp * 2;
				}
				
				if(next >= 0 && next <= 100000) { //그래프의 범위에서 벗어나지 않거나 
					if(check[next] == 0) {  //아직 갱신이 되지 않았으면
					que.add(next);
					check[next] = check[tmp] + 1;
					}
				}
				
				if(next == K) {
					return check[next];
				}
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		K = sc.nextInt();
		
		
		if(N == K) {
			System.out.println("0");
		}
		else {
		System.out.print(bfs(N));
		}
		// TODO Auto-generated method stub

	}

}
