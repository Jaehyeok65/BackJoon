
import java.util.*;
import java.math.*;

public class a1009 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a,b,r;
		for(int i = 0; i < t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			r = 1;
			
			for(int j = 0; j < b; j++) {
				r = (r * a) % 10;
				if(r == 0) {
					r = 10;
				}
			}
			System.out.println(r);
		}
		// TODO Auto-generated method stub

	}

}
