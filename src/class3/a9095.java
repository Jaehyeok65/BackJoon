package class3;


import java.util.*;


public class a9095 {	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while( t --> 0 ) {
			int n = sc.nextInt();
			int arr[] = new int[11];
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 4;
			for(int i = 4; i <= n; i++) {
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
			}
			
			System.out.println(arr[n]);
			
		}
		// TODO Auto-generated method stub

	}

}
