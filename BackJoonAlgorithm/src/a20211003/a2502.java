package a20211003;


import java.util.*;
import java.io.*;

public class a2502 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int D = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[D];
		
		for(int i = 1; i <= K/2; i++) {
			for(int j = i + 1; j < K; j++) {
				arr[0] = i;
				arr[1] = j;
				for(int m = 2; m < D; m++) {
					arr[m] = arr[m-1] + arr[m-2];
				}
				
				if(arr[D-1] == K) {
					sb.append(arr[0] + "\n" + arr[1]);
					i = K; //바로 반복을 종료시킴
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
