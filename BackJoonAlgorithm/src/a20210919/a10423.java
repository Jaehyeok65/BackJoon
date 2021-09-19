package a20210919;


import java.util.*;


public class a10423 {
	
	
	static int N;
	static int M;
	static int K;
	static ArrayList<Edge> list;
	static int parant[];
	
	public static int find(int x) {
		
		if(parant[x] == -1) {
			return -1;
		}
		
		if(x == parant[x]) {
			return x;
		}
		
		return parant[x] = find(parant[x]);
	}
	
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if (x != y) {
			if (x == -1) {
				parant[y] = x;
			} else if (y == -1) {
				parant[x] = y;
			} else {
				if (x == -1 && y == -1) {
					return;
				} else {
					parant[y] = x;
				}
			}
		}
	}
	
	
	
	public static boolean finish() {
		for(int i = 1; i < parant.length; i++) {
			if(parant[i] != -1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		parant = new int[N+1];
		for(int i = 1; i <= N; i++) {
			parant[i] = i;
		}
		
		for(int i = 0; i < K; i++) {
			int tmp = sc.nextInt();
			parant[tmp] = -1;        //k에 해당하는 루트 노드를 -1로 초기화
		}
		
		list = new ArrayList<>();
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			list.add(new Edge(a,b,c));
		}
		
		for(int i = 0; i < N; i++) {
			parant[i] = i;
		}
		
		Collections.sort(list);
		
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			Edge e = list.get(i);
			
			if(find(e.node1) != find(e.node2)) {
				sum += e.dis;
				
				union(e.node1, e.node2);
				
				if(finish()) {
					break;
				}
			}
			
		}
		System.out.println(sum);
		
		for(int i = 0; i < N; i++) {
			System.out.print(parant[i]+" ");
		}
		
		// TODO Auto-generated method stub

	}

}
