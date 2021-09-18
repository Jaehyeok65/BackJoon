package a20210918;


import java.util.*;


class depth {
	
	int x;
	int depth;
	
	public depth(int x, int depth) {
		this.x = x;
		this.depth = depth;
	}
}

public class a2660 {
	
	static int N;
	static int map[][];
	static boolean visited[];
	static int count[];
	
	
	public static void bfs(int n) {
		Queue<depth> que = new LinkedList<>();
		int max = 0;
		visited = new boolean[N+1];
		que.add(new depth(n,0));
		visited[n] = true;
		while(!que.isEmpty()) {
			depth v = que.poll();
			
			for(int i = 1; i <= N; i++) {
				if(map[v.x][i] == 1 && !visited[i]) {
					que.add(new depth(i,v.depth + 1));
					max = Math.max(max, v.depth + 1);
					visited[i] = true;
				}
			}
		}
		
		count[n] = max;
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		count = new int[N+1];
		map = new int[N+1][N+1];
		
		int a = 0;
		int b = 0;
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == -1 && b == -1) {
				break;
			}
			map[a][b] = 1;
			map[b][a] = 1;  //상호 친구사이이므로 간선을 연결
		}
		
		int min = 100;
		
		for(int i = 1; i <= N; i++) {
			bfs(i);
			min = Math.min(min, count[i]);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= N; i++) {
			if(min == count[i]) {
				list.add(i);
			}
		}
		
		System.out.println(min + " " + list.size());
		for(int result : list) {
			System.out.print(result + " ");
		}
		System.out.println("");
		
		// TODO Auto-generated method stub

	}

}
