import java.util.*;


public class a4504 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(true) {
			int m = sc.nextInt();
			if(m == 0) {
				break;
			}
			if(m % n == 0) { //m이 n의 배수이면
				System.out.println(m+" is a multiple of "+n+".");
			}
			else if(m % n != 0) { //m이 n의 배수가 아니면
				System.out.println(m+ " is NOT a multiple of "+n+".");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
