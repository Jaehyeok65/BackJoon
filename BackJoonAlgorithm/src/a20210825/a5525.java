package a20210825;


import java.util.*;


public class a5525 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		char [] arr = sc.next().toCharArray();
		int [] map = new int[m];
		int count = 0;
		
		for(int i = 1; i < m - 1; i++) {
			if(arr[i] == 'O' && arr[i+1] == 'I') {
				map[i+1] = map[i-1] + 1; 
			}
			
			if(map[i+1] >= n && arr[i - 2*n +  1] == 'I') {
				count++;
			}
		}
		
		System.out.print(count);
		
		
		// TODO Auto-generated me



}
}