package a20210828;


import java.util.*;


public class a1735 {
	
	public static int sol (int n, int m) {
		
		int temp = Math.min(n, m);
		int result = -1;
		
		for(int i = temp; i > 1; i--) {
			if(n % i == 0 && m % i == 0) {
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();  //n의 분자
		int n2 = sc.nextInt();   //n의 분모
		
		int m1 = sc.nextInt();  // m의 분자
		int m2 = sc.nextInt();  // m의 분모
		
		int bunmo = n2 * m2;
		int bunza1 = n1 * m2;
		int bunza2 = n2 * m1;
		int bunza = bunza1 + bunza2;
		int result = sol(bunza,bunmo);
		
		if(result == -1) {
			System.out.print(bunza + " " + bunmo);
		}
		else {
			bunza = bunza / result;
			bunmo = bunmo / result;
			System.out.print(bunza + " " + bunmo);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
