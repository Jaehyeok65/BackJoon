package bronze2;


import java.util.*;


public class a7567 {
	
	public static int rotate(char c[]) {
		int result = 10;
		for(int i = 1; i < c.length; i++) {
			if(c[i] == c[i-1]) {
				result += 5;
			}
			else if(c[i] != c[i-1]) {
				result += 10;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		char c[] = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		
		System.out.print(rotate(c));
		// TODO Auto-generated method stub

	}

}
