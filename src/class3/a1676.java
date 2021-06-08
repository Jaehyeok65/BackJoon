package class3;


import java.util.*;


public class a1676 {
	static int count = 0;
	static int N;
	
	static int result(int n) {
		
		while(n >= 5) {
			
		count = count + n / 5;
		n = n / 5;
		
		}
		
		return count;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		System.out.print(result(N));
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
