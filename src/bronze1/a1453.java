package bronze1;


import java.util.*;


public class a1453 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // n < 100
		boolean pan[] = new boolean[101];
		int count = 0;
		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if(pan[m]) {
				count++;
			}
			else {
				pan[m] = true;
			}
		}
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
