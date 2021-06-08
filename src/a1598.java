import java.util.*;
import java.math.*;
public class a1598 { 
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result;
		num1--;
		num2--;
		
		int num1x = num1 / 4; // num1의 x좌표
		int num1y = num1 % 4; // num1의 y좌표
		int num2x = num2 / 4; // num2의 x좌표
		int num2y = num2 % 4; // num2의 y좌표
		
		result = Math.abs(num1x - num2x) + Math.abs(num1y - num2y);
		
		System.out.print(result);
		
		
		// TODO Auto-generated method stub

	}

}
