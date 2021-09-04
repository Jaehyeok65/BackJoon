package a20210904;


import java.util.*;


public class a6603 {
	
	
	static void combination(int arr[], boolean visited[], int start, int n, int r) {
		
		if(r == 0) {
			print(arr,visited,n);
			return;
		}
		
		for(int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr,visited,i+1, n , r-1);
			visited[i] = false;
		}
	}
	
	static void print(int arr[], boolean visited[], int n) {
		
		for(int i = 0; i < n; i++) {
			if(visited[i] ) {
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println("");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = 1;
		
		
		while(k != 0) {
			k = sc.nextInt();
			int arr[] = new int[k];
			boolean visited[] = new boolean[k];
			
			for(int i = 0; i < k; i++) {
				arr[i] = sc.nextInt();
			}
			
			combination(arr,visited,0,k,6);
			
			System.out.println("");
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
