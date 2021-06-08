package class3;


import java.util.*;


public class a11726 {
	
	static class graph { //인접행렬을 이용한 그래프 구현
		int graph[][];
		static boolean visited[];
		int n;
		
		public graph(int size) {
			
			this.graph = new int[size+1][size+1];
			this.visited = new boolean[size+1];
		}
		
		public int[][] getgraph() {
			return graph;
		}
		
		public void push(int x, int y) {
			graph[x][y] = graph[y][x] = 1;
		}
		
		public void print() {
			for(int i = 0; i < graph.length; i++) {
				for(int j = 0; j < graph[i].length; j++) {
					System.out.print(graph[i][j]+" ");
				}
				System.out.println("");
			}
		}
		
		public void inivisited() { //방문확인 배열 초기화 false == 방문하지 않음
			for(int i = 0; i < visited.length; i++) {
				visited[i]= false;
			}
		}
		
		public void dfs(int x) {
			
			this.visited[x] = true; //x로부터 시작해서 방문;
			for(int i = 1; i <= visited.length-1; i++) {
				
				if(graph[x][i] == 1 && visited[i] == false) { //아직 방문하지 않았다면 재귀호출로 방문을 수행
					dfs(i);
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		graph g = new graph(n);
		
		int k = sc.nextInt();
		
		for(int i = 0; i < k; i++) {
			g.push(sc.nextInt(), sc.nextInt()); //그래프를 입력받음
		}
		g.dfs(1);
		for(int i = 0; i < g.visited.length; i++) {
			if(g.visited[i]) {
				count++;
			}
		}
		System.out.print(count-1); //1번 자신을 뺌
		
		// TODO Auto-generated method stub

	}

}
