package class3;


import java.util.*;


public class a11403 {
	
	static int graph[][];
	static int N;
	static int map[][];
	
	static void floid() {
		
		
		for(int k = 1; k < N+1; k++) {
			for(int i = 1; i < N+1; i++) {
				for(int j = 1; j < N+1; j++) {
					if(graph[i][k] == 1 && graph[k][j] == 1) {
						graph[i][j] = 1;
					}
				}
			}
		}
	}
	
	static void print() {
		
		for(int i = 1; i < N+1; i++) {
			for(int j = 1; j < N+1; j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //정점의 개수
		
		graph = new int[N+1][N+1]; //인접행렬로 이루어진 그래프 생성
		map = new int[N+1][N+1]; //경로를 출력할 인접행렬
		
		for(int i = 1; i < N+1; i++) {
			for(int j = 1; j < N+1; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		floid();
		print();
	
		
		
		// TODO Auto-generated method stub

	}

}
