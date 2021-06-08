package bronze1;


import java.util.*;


public class a11050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int numerator = 1;
		int fact = 1;
		int fact1 = 1;
		for(int i = n; i >= 1; i--) {
			numerator = numerator * i;
		}
		for(int i = k; i >= 1; i--) {
			fact = fact * i;
		}
		for(int i = n-k; i >= 1; i--) {
			fact1 = fact1 * i;
		}
		
		int demonirator = fact * fact1;
		
		int result = numerator/demonirator;
		
		System.out.print(result);
		
		
		
		// TODO Auto-generated method stub

	}

}
