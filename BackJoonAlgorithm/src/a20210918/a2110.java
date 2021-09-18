package a20210918;

import java.util.*;


public class a2110 {
	static int N;
	static int M;
	static int arr[];
	static int dis;  //거리를 측정할 변수
	static int count;
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //집의 개수
		M = sc.nextInt(); //공유기를 설치할 개수
		
		arr = new int[N];
		
		for(int i = 0; i < N; i++) {   //집의 좌표 배열 초기화
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);  //이분탐색을 수행하기 위해 배열을 정렬함
		
		int start = 1;
		int end = arr[N-1] - arr[0];
		
		dis = 0;
		
		while(start <= end) {
			int mid = (start + end) /2;
			int left = arr[0];
			count = 1;
			for(int i = 1; i < N; i++) {
				if(arr[i] - left >= mid) {
					count++;
					left = arr[i];
				}
			}
			
			if(count >= M) {
				dis = mid;
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		System.out.print(dis);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
