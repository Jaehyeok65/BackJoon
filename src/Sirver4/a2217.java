package Sirver4;


import java.util.*;





public class a2217 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result = arr[i] * (N - i);
			if(max <= result) {
				max = result;
			}
		}
		System.out.print(max);
		
		// TODO Auto-generated method stub

	}

}
