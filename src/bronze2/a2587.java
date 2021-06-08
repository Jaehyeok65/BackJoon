package bronze2;

import java.util.*;


public class a2587 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int average = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			average += arr[i];
		}
		average = average / 5;
		Arrays.sort(arr);
		System.out.println(average);
		System.out.println(arr[2]);
		
		// TODO Auto-generated method stub

	}

}
