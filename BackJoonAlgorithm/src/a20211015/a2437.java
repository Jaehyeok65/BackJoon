package a20211015;


import java.util.*;
	
	
public class a2437 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			if(sum + 1 < arr[i]) {
				break;
			}
			
			sum += arr[i];
		}
		
		System.out.print(sum + 1);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
