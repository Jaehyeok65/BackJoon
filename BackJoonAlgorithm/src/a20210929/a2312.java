package a20210929;


import java.util.*;


public class a2312 {
	static boolean check[];
	static int cnt[];
	
	
	public static void sol(int n) {
		check = new boolean[n+1];
		for(int i = 2; i * i <= n; i++) {
			for(int j = i * i; j <= n; j+=i) {
				check[j] = true;   //소수가 아닌 것을 true로 초기화
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		while(t --> 0) {
			int n = sc.nextInt();
			sol(n); //소수를 찾음
			cnt = new int[n+1];
			for(int i = 2; i <= n; i++) {
				if(!check[i]) {   //i가 소수이며
					if(n % i == 0) {
						while(n % i == 0) {
							n = n / i;
							cnt[i]++;
						}
					}
				}
			}
			for(int i = 1; i < cnt.length; i++) {
				if(cnt[i] > 0) {
					sb.append(i + " " + cnt[i]+"\n");
				}
			}
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
