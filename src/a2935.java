import java.util.*;
import java.math.*;

public class a2935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		String dus = sc.next();
		BigInteger B = sc.nextBigInteger();
		
		if(dus.equals("*")) {
			System.out.println(A.multiply(B));
		}
		else if(dus.equals("+")) {
			System.out.println(A.add(B));
		}
		// TODO Auto-generated method stub

	}

}
