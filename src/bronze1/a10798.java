package bronze1;

import java.util.*;


public class a10798 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s[] = new String[5];
		int maxlength = 0;
		String result = "";
		for(int i = 0; i < 5; i++) {
			s[i] = sc.nextLine();
			maxlength = Math.max(maxlength, s[i].length());
		}
		
		for(int i = 0; i < maxlength; i++) {
			for(int j = 0; j < s.length; j++) {
				if(s[j].length() > i) {
					result += s[j].charAt(i);
				}
			}
		}
		System.out.print(result + "\n");
		// TODO Auto-generated method stub

	}

}
