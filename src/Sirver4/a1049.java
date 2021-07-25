package Sirver4;


import java.util.*;



public class a1049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //끊어진 기타줄의 개수 즉 구매 해야할 기타줄의 개수
		int M = sc.nextInt(); //브랜드의 개수 M M만큼 반복해서 입력받음
		int p[] = new int[M]; //1패키지당 개수는 6개
		int c[] = new int[M]; 
		int Minp = Integer.MAX_VALUE;
		int Minc = Integer.MAX_VALUE;
		int result = 0;
		for(int i = 0; i < M; i++) {
			p[i] = sc.nextInt();
			Minp = Math.min(Minp, p[i]);
			c[i] = sc.nextInt();
			Minc = Math.min(Minc, c[i]);
		}
		while(N > 0) {
			if(N < 6) {
				if(Minc * N < Minp) { //낱개가격이 패키지 가격보다 더 싸면
					result += Minc * N; //낱개로 구매
					N = N - N;
				}
				else { //패키지 가격이 더 싸면
					result += Minp; //패키지로 구매
					N = N - N;
				}
			}
			else {
				if(Minc * 6 < Minp) { //낱개로 6개 구매하는 것이 패키지로 구매하는 것보다 싸다면
					result += Minc * 6;
					N = N - 6;
				}
				else {
					result += Minp;
					N = N - 6;
				}
			}
		}
		System.out.print(result);
		
		// TODO Auto-generated method stub

	}

}
