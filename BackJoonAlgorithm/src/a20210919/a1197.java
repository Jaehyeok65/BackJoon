package a20210919;


import java.util.*;

class Edge implements Comparable<Edge> {
	int node1;
	int node2;
	int dis;
	
	public Edge(int node1, int node2, int dis) {
		this.node1 = node1;
		this.node2 = node2;
		this.dis = dis;
	}
	
	@Override
	public int compareTo(Edge e) {
		if(this.dis > e.dis) {
			return 1;
		}
		else if(this.dis == e.dis) {
			return 0;
		}
		else {
			return -1;
		}
	}
}

public class a1197 {
	
	static int N;
	static int M;
	static int parant[];
	static ArrayList<Edge> list = new ArrayList<>();
	
	public static int getparant(int x) {
		if(x == parant[x]) return x;  //부모가 자기 자신이라면 x를 리턴
		return parant[x] = getparant(parant[x]);
	}
	
	public static void unionparant(int a, int b) {  //부모를 찾아서 부모가 다르다면 합침
		a = getparant(a);
		b = getparant(b);
		
		if(a > b) {
			parant[a] = b;
		}
		else {
			parant[b] = a;
		}
	}
	
	public static boolean findparant(int a, int b) {
		a = getparant(a);
		b = getparant(b);
		
		if(a == b) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		parant = new int[N];
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			list.add(new Edge(a,b,c));
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < N; i++) {
			parant[i] = i;
		}
		
		int sum = 0;
		
		for(int i = 0; i < list.size(); i++) {
			
			if(!findparant(list.get(i).node1-1, list.get(i).node2-1)) {  //사이클을 형성하지 않으면
				sum += list.get(i).dis; //가중치를 더해주고
				unionparant(list.get(i).node1-1, list.get(i).node2-1); //간선을 연결
			}
		}
		
		System.out.print(sum);
		// TODO Auto-generated method stub

	}

}
