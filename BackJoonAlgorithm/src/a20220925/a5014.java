package a20220925;

import java.io.*;
import java.util.*;



public class a5014 {
	
	static int F; //총 층수
	static int S; //강호가 있는 층수
	static int G; //목표가 있는 층수
	static int U; //위로 U칸 가는 버튼
	static int D; //아래로 D칸 가는 버튼
	static int map[];
	static boolean visited[];
	static int dy[] = {1,-1}; //위아래 두 방향으로만 이동하므로
	
	public static int bfs(int target) {
		visited[target] = true;
		
		Queue<btn> que = new LinkedList<>();
		que.add(new btn(target,0));
		
		
		while(!que.isEmpty()) {
			btn b = que.poll();
			//System.out.println(n);
			if(b.n == G) {
				return b.count;
			}
			
			for(int i = 0; i < 2; i++) {
				int next = 0;
				if(dy[i] == -1) { //-1이라면 아래로 이동
					next = b.n + dy[i] * D; //D칸 가는 버튼이므로 D를 곱해줌
				}
				else {
					next = b.n + dy[i] * U; //위로 U칸 가는 버튼이므로 u를 곱해줌
				}
				if(next < 1 || next > F) continue; //총 층수의 범위를 벗어나면 continue
				if(!visited[next]) { //방문하지 않았다면
					que.add(new btn(next, b.count + 1));
					visited[next] = true;
				}
			}
		}
		
		return -1;
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		F = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		U = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken()); //입력 완료
		
		map = new int[F+1]; //총 F층으로 이루어져 있으므로 map의 크기를 F+1로 초기화 (1층부터 시작하므로)
		visited = new boolean[F+1]; //마찬가지
		
		int result = bfs(S);
		
		System.out.print(result == -1 ? "use the stairs" : result);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

class btn {
	int n;
	int count;
	
	public btn(int n, int count) {
		this.n = n;
		this.count = count;
	}
}
