package class2;


import java.util.*;


public class a15649 {
	
	static boolean visited[]; //중복되는 수를 피하기 위함
	static int arr[];

	static void dfs(int n, int m,int dep) { //중복없이  n부터 m까지의 가능한 모든 경우의 수를 나열 

		
		if(dep == m) { //깊이가 m에 도달하면 더 이상 갈 곳이 없으므로 출력
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i = 0; i < n; i++) { //아직 깊이가 m에 도달하지 않았으면
			if(!visited[i]) { //아직 방문하지 않았으면
				visited[i] = true; //방문을 한뒤
				arr[dep] = i+1; //arr 0 = 1, arr1 = 2
				dfs(n,m,dep+1);
				visited[i] = false;
			}
			
		}
		return;
		
		
	}

	public static void main(String[] args) { //백트래킹 -> 조건을 만족하는 모든 경우의 수를 찾는 것. (재귀를 사용?)
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		visited = new boolean[n];
		arr = new int[m];
		dfs(n,m,0);
		
		// TODO Auto-generated method stub

	}

}
