package class2;


import java.util.*;


public class a15650 {
	
	static boolean visited[];
	static int arr[];
	static void dfs(int n, int m, int dep,int prev) {
		
		if(dep == m) {
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			
			if(!visited[i]) {
				if(prev > i) {
					continue;
				}
				visited[i] = true;
				arr[dep] = i + 1;
				dfs(n,m,dep+1,arr[dep]); //자식 노드 방문 후
				visited[i] = false; //상위 노드를 다시 false로 지정
			}
		}
		return;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		visited = new boolean[n];
		arr = new int[m];
		dfs(n,m,0,-1);
		
		// TODO Auto-generated method stub

	}

}
