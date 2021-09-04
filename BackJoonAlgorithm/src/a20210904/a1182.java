package a20210904;

import java.util.*;



public class a1182 {
	
	static int result = 0; //부분수열의 개수를 파악하는 결과 변수
	
	static void back(int arr[], boolean visited[], int start, int n, int r, int k) { //백트래킹을 이용해 부분수열을 구함
		
		if(r == 0) {   //n개의 수열 중 r개의 부분 수열을 구함 (r을 1씩 빼는 백트래킹을 통해 r == 0이 되면 리턴)
			sum(arr,visited,n,k);   //r이 0이 되면 부분수열의 합이 구하고자 하는 k와 같은지 검사한다. 
			return;
		}
		
		for(int i = start; i < n; i++) {       //백트래킹 구현
			visited[i] = true;  //방문
			back(arr,visited,i + 1, n, r - 1, k);
			visited[i] = false;   //출력하면 다시 방문해야하기 때문에 방문을 false로 초기화해준다.
		}
	}
	
	static void sum(int arr[], boolean visited[], int n, int k) {   //부분수열의 합이 k와 같은지 검사하는 함수 
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				sum += arr[i];
			}
		}
		if(sum == k) {      //백트래킹을 통해 알아낸 부분수열의 합이 k와 같다면 결과변수를 1 증가시킨다.
			result++; 
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();   //정수의 개수
		int k = sc.nextInt();   //구하고자 하는 값
		int arr[] = new int[n];
		boolean visited[] = new boolean[n]; //백트래킹 구현에 필요한 배열을 선언해준다.
		
		for(int i = 0; i < n; i++) {  //수열 입력
			arr[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {  //반복문을 통해 수열의 부분수열을 모두 구한다. (1부터 n까지 반복을 통해 )
			back(arr,visited,0,n,i,k);
		}
		System.out.print(result);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
