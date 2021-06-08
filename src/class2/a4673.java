package class2;


import java.util.*;


public class a4673 {
	
	public static int Selfnum(int n) {
		int sum = n;
		
		while(n > 0) {
			sum += n % 10;
			n /= 10;
		}
		
		return sum;
	
	}

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		int result = 0;
		boolean check[] = new boolean[10001];
		for(int i = 1; i <= 10000; i++) {
			result = Selfnum(i);
			
			if(result < check.length) {
				check[result] = true;
			}
			
		}
		for(int i = 1; i < check.length; i++) {
			if(!check[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.print(sb.toString());
		
		// TODO Auto-generated method stub

	}

}
