package a20210825;

import java.util.*;
	
	

public class a1057 {
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		while(a != b) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			count++;
		}
		System.out.print(count);
		
		
		// TODO Auto-generated method stub

	}

}
