package 복습;


import java.util.*;


public class a2798복습 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //입력받을 카드의 숫자
		int M = sc.nextInt(); //입력받은 숫자에 최대한 가깝게 3장의 합을 구함 (결과를 구할 값)
		
		int arr[] = new int[N];
		int ans = 0;
		int result = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				for(int k = j+1; k < arr.length; k++) {
					ans = arr[i] + arr[j] + arr[k];
					if(ans == M) {
						result = ans;
						break;
					}
					else if(ans < M) {
						result = Math.max(ans, result);
					}
				}
			}
		}
		System.out.print(result);
		// TODO Auto-generated method stub

	}

}
