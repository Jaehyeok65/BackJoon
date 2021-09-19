package a20210919;



import java.util.*;


public class a1647 {
	static int N;
	static int M;
	static int parant[];
	static ArrayList<Edge> list;
	
	
	public static int find(int x) {
		if(x == parant[x]) {
			return x;
		}
		
		return parant[x] = find(parant[x]);
	}
	
	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		
		if(x > y) {
			parant[x] = y;
		}
		else {
			parant[y] = x;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		list = new ArrayList<>();
		parant = new int[N+1];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			list.add(new Edge(a,b,c));
		}
		
		for(int i = 1; i <= N; i++) {
			parant[i] = i;
		}
		
		Collections.sort(list);
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < list.size(); i++) {
			
			Edge e = list.get(i);
			
			if(find(e.node1) != find(e.node2)) {
				sum += e.dis;
				cnt = e.dis;
				union(e.node1 , e.node2);
			}
		}
		
		System.out.print(sum-cnt);
		
		// TODO Auto-generated method stub

	}

}
