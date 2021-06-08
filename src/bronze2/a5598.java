package bronze2;


import java.util.*;


public class a5598 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char c[] = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)-3 < 'A') {
				c[i] = (char)(s.charAt(i) + 23);
			}
			else {
			c[i] = (char)(s.charAt(i) - 3);
			}
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		// TODO Auto-generated method stub

	}

}
