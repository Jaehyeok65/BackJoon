import java.util.*;


public class a1964 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n = 1일때 점 = 5 n = 2일 때 점 = 12 n = 3일때 점 = 22
		long dot = 5; //점의 개수 
		int modnum = 45678;
		for(int i = 2; i <= n; i++) {
			dot = dot + 3*i +1;
		}
		System.out.print(dot % modnum);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
