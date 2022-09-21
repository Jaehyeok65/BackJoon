package a20220921;

import java.util.*;
import java.io.*;



public class a1202 {
	
	static int N;
	static int K;
	static long result = 0;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int array[] = new int[K];
		ArrayList<jewel> jlist = new ArrayList<>();
		
		
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			jlist.add(new jewel(m,v));
		}
		
		
		for(int i = 0; i < K; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		Collections.sort(jlist);
		Arrays.sort(array);
		Queue<Integer> pq = new PriorityQueue<>((o1,o2) -> (o2-o1));
		
		int j =0;
		
		for(int i=0; i< K; i++) {
			
			while(true) {
				if(j>=N) break;
				jewel jinfo = jlist.get(j);
				
				if(array[i] < jlist.get(j).m) break;
				// 보석의 무게가 가방보다 작으면 최소 힙에 저장
				pq.add(jinfo.v);
				j++; // 보석 탐색 수count
			}
			// 최소 힙 맨 앞에 있는 숫자 꺼내줌 (가장 비싼 보석)
			if(!pq.isEmpty()) {
				result += Math.abs(pq.poll());
			}
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}


class jewel implements Comparable<jewel> {
	
	int m;
	int v;
	
	public jewel(int m, int v) {
		this.m = m;
		this.v = v;
	}

	@Override //가격 내림차순으로 정렬
	public int compareTo(jewel o) {
		// TODO Auto-generated method stub
		return this.m-o.m;
	}
}