package class2;


import java.util.*;


public class a1436 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long k = Long.MAX_VALUE;
		long result = 0;
		
		for(long i = 0; i < k; i++) {
			String s = String.valueOf(i);
			if(s.contains("666")) {
				n--;
				result = i;
			}
			if(n == 0) {
				break;
			}
		}
		System.out.print(result);
		
		// TODO Auto-generated method stub

	}

}
