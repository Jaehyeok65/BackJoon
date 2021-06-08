package bronze2;

import java.util.*;


public class a10987 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char c[] = {'a','e','i','o','u'};
		int count = 0;
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < c.length; j++) {
				if(s.charAt(i) == c[j]) {
					count++;
				}
			}
		}
		System.out.print(count);
		// TODO Auto-generated method stub

	}

}
