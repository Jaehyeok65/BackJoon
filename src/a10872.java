import java.util.*;


public class a10872 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for(int i = n; i > 0; i--) {
			sum = sum * i;
		}
		System.out.print(sum);
		
		// TODO Auto-generated method stub

	}

}
