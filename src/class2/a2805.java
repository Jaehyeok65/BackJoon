package class2;



import java.util.*;


public class a2805 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int max = arr[arr.length-1];
		long left = 0;
		long right = max;
		long mid = 0;
		
		while(left <= right) {
			
			mid = (left + right) / 2; //기준
			long ans = 0; //자르고 가져갈 나무 길이
			
			for(int i = 0; i < n; i++) {
				if(arr[i] > mid) { //자르고 남은 부분을 가져가려면 기준보다 나무 높이가 높아야됌
				ans += (arr[i]-mid);
				}
			}
			if(ans >= m) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
			
		}
		System.out.print(right);
		// TODO Auto-generated method stub

	}

}
