package 복습;


import java.util.*;


public class a10250복습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int Test = sc.nextInt();
		
		while(Test --> 0) {
			
			int h = sc.nextInt(); //층 수
			int w = sc.nextInt(); //호 수
			
			int h1 = 1; //1층부터 배정이 시작되기 때문
			int w1 = 1; //1호부터 배정이 시작되기 때문
			
			int result = sc.nextInt(); //배정해야할 호수
			while(true) {
				result--; //손님이 방문
				if(result == 0) {
					break;
				}
				if(h1 == h) {
					h1 = 0; //0으로 초기화를 해야 다음에 1층부터 배정하기 때문.
					w1++;
				}
				h1++;
				
			}
			String hight = String.valueOf(h1);
			String weight = String.format("%02d", w1);
			
			sb.append(hight+weight+"\n");
			
		}
		
		System.out.print(sb.toString());
		// TODO Auto-generated method stub

	}

}
