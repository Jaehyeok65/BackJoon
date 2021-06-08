package bronze2;


import java.util.*;


public class a2839 {
	
		
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //담아야할 키로수
		int k = 5; //5키로
		int m = 3; //3키로
		int ans = 0;
		while(true) {
			if(n % 5 == 0) {
				ans = ans + n / 5;
				System.out.print(ans);
				break;
			}
			else {
				n = n -3;
				ans++;
			}
			if (n < 0) 
			{
				System.out.print(-1);
				break;
			}

		}
		// TODO Auto-generated method stub

	}

}
