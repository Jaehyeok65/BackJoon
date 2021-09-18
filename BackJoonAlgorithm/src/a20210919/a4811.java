package a20210919;


import java.util.*;

public class a4811 {
	
	static long dp[][];
	
	
	public static long solution(int w, int h) {
		if(w == 0) {   //알약을 다 먹고 없다면 
			return 1;
		}
		
		if(dp[w][h] != 0) {
			return dp[w][h];
		}
		
		long count = 0;
		
		if(w > 0) {       //한쪽짜리 알약이 있다면
			count += solution(w-1,h+1);
		}
		
		if(h > 0) {  //반쪽짜리 알약이 있다면
			count += solution(w,h-1);  //반쪽짜리 알약을 먹음
		}
		dp[w][h] = count;
		return count;

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		dp = new long[31][31];
		
		solution(30,0);
		
		while(true) {
			int t = sc.nextInt();
			
			if(t == 0) {
				break;
			}
			
			sb.append(dp[t][0] + "\n");
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
