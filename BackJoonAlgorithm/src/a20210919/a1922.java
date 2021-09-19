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
public class a1922 {
	
	static ArrayList<Edge> list = new ArrayList<>();
	static int parant[];   //사이클이 발생하는지 여부를 확인하는 배열 선언
	static int N;
	static int M;
	
	public static int getparant(int x) {
		if(parant[x] == x) return x;
		return parant[x] = getparant(parant[x]);
	}
	
	public static void unionparant(int a, int b) {
		a = getparant(a);
		b = getparant(b);
		
		if(a < b) {
			parant[b] = a;
		}
		else {
			parant[a] = b;
		}
	}
	
	public static int findparant(int a, int b) {
		a = getparant(a);
		b = getparant(b);
		
		if(a == b) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		parant = new int[N];
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(); //연결 정점 1
			int b = sc.nextInt(); //연결 정점 2
			int c = sc.nextInt(); //가중치
			list.add(new Edge(a,b,c));  //리스트에 간선을 추가해줌
		}
		
		Collections.sort(list);
		
		for(int i = 0; i < N; i++) {
			parant[i] = i;
		}
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			
			if(findparant(list.get(i).node1-1, list.get(i).node2-1) == 0) {
				sum += list.get(i).dis;
				unionparant(list.get(i).node1-1,list.get(i).node2-1);	
			}
		}
		
		System.out.print(sum);
		
		
		// TODO Auto-generated method stub

	}

}
