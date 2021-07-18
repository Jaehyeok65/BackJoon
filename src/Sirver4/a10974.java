package Sirver4;


import java.util.*;



public class a10974 {
	static int output[];


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //팩토리얼으로 출력할 수
		int arr[] = new int [n];
		output = new int[n];
		boolean visited[] = new boolean[n];
		for(int i = 0; i < n; i++) {
			visited[i] = true;
			dfs(arr,visited,n,i,0);
			visited[i] = false;
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	static void dfs(int [] arr, boolean visited[], int N, int start, int depth) {
		output[depth] = start + 1;
		if(depth == N -1) {
			for(int i = 0; i < N; i++) {
				System.out.print(output[i]+" ");
			}
			System.out.println("");
			return;
		}
		for(int i = 0; i < N; i++) {
			if(visited[i])
				continue;
			visited[i] = true;
			dfs(arr,visited,N,i,depth + 1);
			visited[i] = false;
		}
	}

}
