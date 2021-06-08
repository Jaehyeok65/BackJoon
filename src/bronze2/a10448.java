package bronze2;


import java.util.*;
	
	
public class a10448 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean check[] = new boolean[1001];
		int arr[] = new int[46];
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + i;
		}
		int T = sc.nextInt();
		
		
		for(int k = 0; k < T; k++) {
			
			int n = sc.nextInt();
			
			for(int i = 1; i < arr.length; i++) {
				for(int j = 1; j < arr.length; j++) {
					for(int t = 1; t < arr.length; t++) {
						if(arr[i] + arr[j] + arr[t] == n) {
							check[n] = true;
							break;
						}
					}
				}
			}
			if(check[n]) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
