package a20210915;

import java.util.*;


public class a14002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int arr[] = new int[n];  //수열 선언
		int dp[] = new int[n];
		int tmp[] = new int[n];
		int maxindex = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {  //수열 초기화
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			dp[i] = 1; //처음 수열의 길이는 1이므로 1로 초기화
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j] && dp[j] + 1 > dp[i]) { //
					dp[i] = dp[j] + 1;
					tmp[i] = j; //가장 긴 증가하는 부분수열을 구성하는 인덱스를 저장함.
				}
			}
			if(dp[i] > max) { //가장 긴 수열의 길이를 max 변수에 저장함.
				max = dp[i];
				maxindex = i;
			}
		}
		
		int result[] = new int[max];  //결과 수열을 저장할 배열을 선언
		int index = maxindex;   //인덱스 변수에  maxindex 대입.
		
		for(int i = max - 1; i >= 0; i--) { //tmp 배열을 역추적하여 인덱스 리스트를 추적함.
			result[i] = arr[index];
			index = tmp[index];
		}
		
		System.out.println(max);  //결과 출력
		
		
		for(int i = 0; i < max; i++) {
			System.out.print(result[i]+ " ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
