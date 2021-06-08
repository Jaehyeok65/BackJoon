package bronze2;

import java.util.*;


public class a10820 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.nextLine();
			int count = 0;
			int alpha = 0;
			int space = 0;
			int Alpha = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == ' ') {
					space++;
				}
				for(int j = 'a'; j <= 'z'; j++) {
					if(s.charAt(i) == j) {
						alpha++;
					}
				}
				for(int j = 'A'; j <= 'Z'; j++) {
					if(s.charAt(i) == j) {
						Alpha++;
					}
				}
				for(int j = '0'; j <= '9'; j++) {
					if(s.charAt(i) == j) {
						count++;
					}
 				}
			}
			System.out.println(alpha+" "+Alpha+" "+count+" "+space);
			
		}
		// TODO Auto-generated method stub

	}

}
