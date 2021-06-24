package class3;


import java.util.*;
import java.io.*;


public class a11659 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N+1];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st1.nextToken()) + arr[i-1];
		}
		
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st2.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			int result = 0;
			result = arr[b] - arr[a-1];
			sb.append(result+"\n");
		}
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
