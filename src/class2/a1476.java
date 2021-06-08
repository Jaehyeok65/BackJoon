package class2;


import java.util.*;


public class a1476 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt(); // <= 15
		int S = sc.nextInt(); // <= 28 
		int M = sc.nextInt(); // <= 19
		
		int year = 0;
		int result1 = 1;
		int result2 = 1;
		int result3 = 1;
		while(true) {
			year++;
			if((result1) == E && (result2) == S && (result3) == M) {
				break;
			}
			result1++;
			result2++;
			result3++;
			if(result1 == 16) {
				result1 = 1;
			}
			if(result2 == 29) {
				result2 = 1;
			}
			if(result3 == 20) {
				result3 = 1;
			}
			
		}
		System.out.println(year);
		
		
		// TODO Auto-generated method stub

	}

}
