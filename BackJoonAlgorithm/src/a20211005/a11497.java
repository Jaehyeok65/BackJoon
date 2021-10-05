package a20211005;


import java.util.*;
	
	
public class a11497 {
	static int arr[];
	static int n;
	public static int sol() {
		Arrays.sort(arr);   //배열을 정렬
		int result[] = new int[n];
		int start = 0;
		int end = n-1;
		int i = 0;
		while(start <= end) {
			if(i < arr.length) {
			result[start] = arr[i++];
			}
			if(i < arr.length) {
			result[end] = arr[i++];
			}
			start++;
			end--;
		}
		int ans = Math.abs(result[0] - result[n-1]);
		for(int j = 1; j < result.length; j++) {
			ans = Math.max(ans, Math.abs(result[j] - result[j-1]));
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = sc.nextInt();
		
		while(t --> 0) {
			n = sc.nextInt();
			arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			sb.append(sol() + "\n");
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
