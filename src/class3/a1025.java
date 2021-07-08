package class3;


import java.io.*;
import java.util.*;

public class a1025 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String arr[][] = new String[N][M];
		int k = 0;
		while(N --> 0) {
			String s = br.readLine();
			for(int i = 0; i < s.length(); i++) {
				arr[k][i] = s.substring(i,i+1);
			}
			k++;
		}
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
			}
		}
		// TODO Auto-generated method stub

	}

}
