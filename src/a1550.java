
import java.util.*;


public class a1550 {
	
	public static int trans(char a, int n) { //a = A ~ F
		if(a == 'A') {
			n = 10;
		}
		else if(a == 'B') {
			n = 11;
		}
		else if(a == 'C') {
			n = 12;
		}
		else if(a == 'D') {
			n = 13;
		}
		else if(a == 'E') {
			n = 14;
		}
		else if(a == 'F') {
			n = 15;
		}
		return n;
	} 
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String a = sc.next();
		char b = a.charAt(0);
		int m = trans(b,n);
		System.out.println(m);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
