package bronze2;


import java.util.*;


public class a11365 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			if(s.equals("END")) {
				break;
			}
			StringBuffer sb = new StringBuffer(s);
			String reverse = sb.reverse().toString();
			System.out.println(reverse);
		}
		// TODO Auto-generated method stub

	}

}
