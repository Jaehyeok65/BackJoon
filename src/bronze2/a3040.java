package bronze2;

import java.util.*;


public class a3040 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[9];
		int ans[] = new int[7];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); //9개의 모자수를 입력받음.
			sum += arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum - 100) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != -1) {
				System.out.println(arr[i]);
			}
		}
		// TODO Auto-generated method stub

	}

}
