import java.util.*;
import java.math.*;



public class a1247 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger("0");
		for(int i = 0; i < 3; i++)
		{
			BigInteger sum = new BigInteger("0");
			int n = sc.nextInt(); //입력받을 개수
		for(int j = 0; j < n; j ++)
		{
			BigInteger s = sc.nextBigInteger();
			sum = sum.add(s);
		}
		if(sum.compareTo(a) == 0)
		{
			System.out.println("0");
		}
		else if (sum.compareTo(a) > 0)
		{
			System.out.println("+");
		}
		else
		{
			System.out.println("-");
		}
		
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
