package class2;



import java.util.*;
import java.io.*;


public class a1654 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		long arr[] = new long[k];
		
		for(int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		long left = 1;
		long right = arr[arr.length-1];
		
		while(left <= right) {
			
			long mid = (left + right)/2;
			long sum = 0;
			
			for(int i = 0; i < k; i++) {
				sum += (arr[i]/mid);
			}
			if(sum >= n) {
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
