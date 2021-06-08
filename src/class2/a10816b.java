package class2;


import java.util.*;


public class a10816b {
	
	static int lower_bound(int[] arr, int key) { //키가 처음으로 나타나는 위치를 리턴
		
		int first = 0;
		int last = arr.length;
		
		while(first < last) {
			
			int mid = (first + last) / 2;
			
			if(arr[mid] >= key) {
				last = mid;
			}
			else {
				first = mid + 1;
			}
		}
		return last;
		
	}
	
	static int upper_bound(int[] arr, int key) { //키의 값보다 처음으로 커지는 위치를 리턴
		
		int first = 0;
		int last = arr.length;
		
		while(first < last) {
			
			int mid = (first + last) /2;
			
			if(arr[mid] <= key) { 
				first = mid+1;
			}
			
			else {
				last = mid;
			}
		}
		return last;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt(); //가지고 있는 숫자 카드 개수
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			int key = sc.nextInt();
			sb.append(upper_bound(arr,key) - lower_bound(arr,key)+" ");
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
