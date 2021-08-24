package a20210824;


import java.util.*;



public class a2003 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		int count = 0;
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			result = arr[i];
			if(result == m) {
				count++;
				continue;
			}
			for(int j = i + 1; j < n; j++) {
				result = result + arr[j];
				if(result == m) {
					count++;
					break;
				}
				else if(result > m) {
					break;
				}
			}
		}
		
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
