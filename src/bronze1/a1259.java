package bronze1;


import java.util.*;


public class a1259 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		String s = sc.next();
		if(s.equals("0")) {
			break;
		}
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb1 = sb.reverse();
		String s1 = sb1.toString();
		if(s.equals(s1)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
			
		}
		// TODO Auto-generated method stub

	}

}
