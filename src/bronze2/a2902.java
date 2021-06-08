package bronze2;


import java.util.*;


public class a2902 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str[] = s.split("-");
		char c[] = new char[str.length];
		for(int i = 0; i < str.length; i++) {
			c[i] = str[i].charAt(0);
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		// TODO Auto-generated method stub

	}

}
