

import java.util.*;


public class a2455 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = 0;
		int max = 0;
		for(int i = 0; i < 4; i++) {
			
			int n = sc.nextInt(); //내린 사람 수
			int m = sc.nextInt(); //탄 사람 수
			p = p - n;
			p = p+ m;
			if(p > max) {
				max = p;
			}
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
