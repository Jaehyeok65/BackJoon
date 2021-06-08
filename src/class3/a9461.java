package class3;


import java.util.*;


public class a9461 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		
		long p[] = new long[101];
		
		p[1] = 1;
		p[2] = 1;
		p[3] = 1;
	
		
		while(Test --> 0) {
			
			int n = sc.nextInt();
			for(int i = 4; i <= n; i++) {
				p[i] = p[i-3] + p[i-2];
			}
			System.out.println(p[n]);
			
		}
		// TODO Auto-generated method stub

	}

}
