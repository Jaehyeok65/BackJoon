package bronze2;


import java.util.*;


public class a1075 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = sc.nextInt();
		int m = n % 100;
		int nm = n - m;
		int result = 0;
		for(int i = nm; i < nm + 100; i++) {
			if(i % f == 0) {
				result = i % 100;
				break;
			}
		}
		 System.out.println(String.format("%02d", result));

		
		
		
		
		// TODO Auto-generated method stub

	}

}
