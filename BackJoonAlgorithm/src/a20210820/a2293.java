package a20210820;

import java.util.*;
import java.io.*;


public class a2293 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int dp[] = new int[k+1];
		dp[0] = 1; //동전이 없을 때는 k를 만들 수 있는 경우의 수는 없음
		
		int coin[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < n; i++) {
			
			for(int j = coin[i]; j <= k; j++) {
				dp[j] = dp[j] + dp[j - coin[i]];
			}
		}
		System.out.print(dp[k]);
		
		
		// TODO Auto-generated method stub

	}

}
