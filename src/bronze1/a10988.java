package bronze1;


import java.util.*;


public class a10988 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb1 = sb.reverse();
		String rev = sb1.toString();
		
		if(s.equals(rev)) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
		
		// TODO Auto-generated method stub

	}

}
