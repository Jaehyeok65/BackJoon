package bronze2;

import java.util.*;


public class a1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count[] = new int[26];
		char c[] = new char[26];
		for(int i = 0; i < c.length; i++) {
			c[i] = (char)(i+'a');
		}
		boolean count1 = false;
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			for(int j = 'a'; j <= 'z'; j++) {
				if(s.charAt(0) == j) {
					count[j-'a']++;
				}
			}
		}
		for(int i = 0; i < count.length; i++) {
			if(count[i] >= 5) {
				System.out.print(c[i]);
				count1 = true;
			}
		}
		if(!count1) {
			System.out.print("PREDAJA");
			
		}
		// TODO Auto-generated method stub

	}

}
