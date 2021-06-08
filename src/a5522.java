import java.util.*;


public class a5522 {
	
	public static int cardgame(int a, int b, int c, int d, int e)
	{
		int arr[] = new int[5];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int sum = cardgame(a,b,c,d,e);
		System.out.print(sum);
		
		// TODO Auto-generated method stub

	}

}
