package a20210901;

import java.util.*;



public class a1449 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //물이 새는 곳 위치의 개수 (입력받을 개수)
		int l = sc.nextInt(); // 테이프의 길이
		
		int arr[] = new int[n];
		int count = 1; //물을 막는데 필요한 테이프의 개수 하나는 무조건 필요하므로 1으로 초기화해줌
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); //물이 새는 곳을 정렬
		
		int tape = 0;
		
		for(int i = tape + 1; i < n; i++) {
			
			if(arr[i] - arr[tape] > l - 1) { //테이프 하나로 막을 수 없는 경우
				count++; //테이프를 추가해주고
				tape = i; //그 지점부터 다시 테이프를 붙임
			}
		}
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
