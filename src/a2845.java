import java.util.*;


public class a2845 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //1m2당 사람 수
		int b = sc.nextInt(); //파티의 넓이
		int c[] = new int[5];
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = sc.nextInt(); //5개의 기사 입력받음.
		}
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] - a*b+" ");
		}
		
		
		// TODO Auto-generated method stub

	}

}
