package a20221014;

import java.util.*;
import java.io.*;



public class a13335 {
	static int N;
	static int W;
	static int L;
	static Queue<Integer> que = new LinkedList<>();
	static Queue<Truck> truck = new LinkedList<>(); //다리에 올려놓는 작업
	static int bridge = 0; //다리 위에 있는 트럭의 무게
	static int time = 0;
	static int pass = 0;
	static int count = 0;
	
	
	public static void solve() {
		
		
		
		while(pass < N) { //다리를 다 건넌 트럭의 수가 N이 된다면 멈춤
			time++;
			
			pass();
			
			check();
		}
		
		System.out.print(time);
		
	}
	
	public static void check() { //트럭을 다리에 올려놓고 무게를 체크하는 과정
		if(!que.isEmpty()) {
			int t = que.peek(); //맨 위의 큐를 체크함
			if(t + bridge <= L && count < W) {
				bridge += que.peek();
				truck.add(new Truck(time,que.poll()));
				count++;
			}
		}
	}
	
	public static void pass() { //다리를 건넜는지 확인
		if(!truck.isEmpty()) {
			int truckstime = truck.peek().time;
			int truckweight = truck.peek().weight;
		
			if(time - truckstime >= W) { //현재 시간과 트럭이 진입한 시간을 계산하여 W보다 크거나 같다면
				pass++; //통과 개수 증가
				truck.poll(); //다리에 놓인 트럭에서 뺌
				count--;
				bridge -= truckweight;
			}
		}
	}
	
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			que.add(Integer.parseInt(st.nextToken())); //모든 트럭들을 큐에 집어넣음
		}
		
		solve();
		
		
		
		
		// TODO Auto-generated method stub

	}

}

class Truck{
	int time, weight;

	Truck(int time, int weight){
		this.time = time;
		this.weight = weight;

	}
}
