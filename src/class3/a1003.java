package class3;


import java.util.*;


public class a1003 {
	static int count[] = {0,0};
	
	static int fibo(int n) {
		
		if(n == 0) {
			count[0]++;
			return 0;
		}
		else if(n == 1) {
			count[1]++;
			return 1;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Test = sc.nextInt();
		
		while (Test --> 0) {
			int n = sc.nextInt();
			fibo(n);
			System.out.println(count[0]+" "+count[1]);
			count[0] = count[1] = 0;
			
		}
		
		
		// TODO Auto-generated method stub

	}

}
