package a20210817;


import java.util.*;

public class a10973 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = n;
		int temp = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		while(true) {
			temp = arr[count-1];
			
		}
		// TODO Auto-generated method stub

	}

}
