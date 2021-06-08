package bronze2;

import java.util.*;


public class a10808 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int count[] = new int[26];
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		for(int i = 0; i < s.length(); i++) {
			for(int j = 'a'; j <= 'z'; j++) {
				if(s.charAt(i) == j) {
					count[j-'a']++;
				}
			}
		}
		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i]+" ");
		}
		// TODO Auto-generated method stub

	}

}
