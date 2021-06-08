package bronze1;


import java.util.*;


public class a1977 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int i = 1;
		int sqr = 0;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		boolean dfs = false;
		while(true) {
			sqr = (int)Math.pow(i, 2);
			if(sqr > N) {
				break;
			}
			if(sqr >= M && sqr <= N) {
				dfs = true;
				sum += sqr;
				if(min > sqr) {
					min = sqr;
				}
			}
			i++;
		}
		if(dfs) {
		System.out.println(sum);
		System.out.println(min);
		}
		else {
			System.out.print(-1);
		}
		// TODO Auto-generated method stub

	}

}
