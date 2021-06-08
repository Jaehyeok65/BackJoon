package bronze2;


import java.util.*;


public class a10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			
		}
		int k = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(k == arr[i]) {
				count++;
			}
		}
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
