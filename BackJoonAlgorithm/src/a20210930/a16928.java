package a20210930;


import java.util.*;


public class a16928 {
	static boolean visited[];
	static int ladder[][];  //사다리
	static int snake[][];   //뱀
	static int N;         //사다리 개수 입력받음
	static int M;         //뱀 개수 입력받음
	static int count[];
	static int min = 101;
	
	
	public static void bfs(int n) {
		Queue<Integer> que = new LinkedList<>();
		
		que.add(n);
		visited[n] = true;
		
		while(!que.isEmpty()) {
			int tmp = que.poll();
			if(tmp == 100) {
				System.out.println(count[tmp]);
				return;
			}
			for(int i = 1; i <= 6; i++) {   //주사위를 굴림
				int next = tmp + i;
				for(int j = 0; j < N; j++) {  //사다리를 탐
					if(next == ladder[j][0]) {
						next = ladder[j][1];
					}
				}
				for(int j = 0; j < M; j++) {  //뱀이라면 내려감
					if(next == snake[j][0]) {
						next = snake[j][1];
					}
				}
				
				if(next > 0 && next <= 100 && !visited[next]) { //맵의 범위 안에 있고 아직 방문하지 않았다면
					que.add(next);      //큐에 추가하고
					visited[next] = true;  //방문했다고 표시
					count[next] = count[tmp] + 1;  //count배열에 초기화해줌
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		count = new int[101]; 
		visited = new boolean[101];
		ladder = new int[N][2];
		snake = new int[M][2];
		
		for(int i = 0; i < N; i++) {
			ladder[i][0] = sc.nextInt();
			ladder[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			snake[i][0] = sc.nextInt();
			snake[i][1] = sc.nextInt();
		}
		
		bfs(1);
		
		
		// TODO Auto-generated method stub

	}

}
