import java.util.*;
import java.math.*;

public class a2903 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int dot = 0;
		for(int i = 0; i < n; i++) {
			dot = (int)Math.pow(2, n) + 1;
		}
		System.out.print((int)Math.pow(dot, 2));
		
		// TODO Auto-generated method stub

	}

}
