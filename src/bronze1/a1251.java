package bronze1;


import java.util.*;


public class a1251 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> sta = new Stack<Integer>();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a + b;
		
		int result = 0;
		boolean pan = false;
		while(true) {
			if(pan) {
				result = c % 10 +1;
			}
			else {
				result = c % 10;
			}
			pan = false;
			if(result > 1) {
				result = result - 2;
				pan = true;
			}
			sta.add(result);
			c = c / 10;
			if(!(c > 0) && pan == false) {
				break;
			}
		}

		while(!sta.isEmpty()) {
			System.out.print(sta.pop());
		}
		
	
	
		
		// TODO Auto-generated method stub

	}

}
