package class2;


import java.util.*;


public class a1920 {

	public static void main(String[] args) { //이분탐색으로 풀 것.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int A[] = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		int m = sc.nextInt();
		int result = 0;
		for(int i = 0; i < m; i++) {
			result = sc.nextInt();
			boolean dis = false;
				int start = A.length/2; //이분 탐색을 위해 중간지점부터 탐색 (중간지점의 인덱스)
				if(result >= A[start]) { //비교할 값이 중간값보다 크다면 오른쪽 탐색
					for(int j = start; j < A.length; j++) {
						if(result == A[j]) {
							dis = true;
							break;
						}
					}
				}
				else if(result < A[start]){ //비교할 값이 중간보다 작다면 왼쪽 탐색
					for(int j = 0; j < start; j++) {
						if(result == A[j]) {
							dis = true;
							break;
						}
					}
				}
				if(dis) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
		
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
