package a20210915;

import java.util.*;


public class a1965 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int box[] = new int[n+1];  //상자를 저장할 배열을 선언
		int dp[] = new int[n+1];   //최대상자를 넣을 배열을 선언
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= n; i++) {  //상자 배열 초기화 == 순서를 바꿀 수 없음
			box[i] = sc.nextInt();
		}
		
		
		for(int i = 1; i <= n; i++) {
			dp[i] = 1; //처음에는 상자가 하나밖에 못들어간다고 가정.
			for(int j = 1; j < i; j++) {
				if(box[i] > box[j]) {  //box[j]가 box[i]보다 작다면
					dp[i] = Math.max(dp[i], dp[j] + 1); //dp[i]와 현재까지 최대값에서 박스를 더한 것의 최대값을 비교해 더 큰 값을 저장한다.
				}
 			}
		}
		
		
		for(int i = 1; i <= n; i++) {  //dp배열을 반복하면서 max변수에 최댓값 저장.
			max = Math.max(max, dp[i]);
		}
		
		System.out.print(max); //결과출력
		
		
		// TODO Auto-generated method stub

	}

}
